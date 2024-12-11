ArrayList<Ball> ballGroup;
//Ball[] ballGroup;
//int pos = 0;

//Happens Once
void setup() {
    size(1280, 720);
    background(200, 200, 200);
    ballGroup = new ArrayList<Ball>();
}

//Happens constantly
void draw() {
    background(200, 200, 200);

    // for (int i = 0; i < ballGroup.size(); i++) {
    //     ballGroup.get(i).display();
    //     ballGroup.get(i).move();
    // }

    for (Ball theBall : ballGroup) {
        theBall.move();

        for (Ball otherBall : ballGroup) {
            theBall.cc(otherBall);
        }

        theBall.display();
    }

}

void mousePressed() {
  ballGroup.add(new Ball(mouseX, mouseY, 50, false));
}

void keyPressed() {
  if (key == 'c') {
     for(int i = ballGroup.size()-1; i >= 0; i--) {
        ballGroup.remove(i);
     }
  }
  else if (key == ' ') {
    ballGroup.add(new Ball(width/2, height/2, 10, true));
  }
}


class Ball {
    int x, y, r;
    int dx, dy; //Speed or velocity
    int cr, cg, cb; //RGB Values
    int grav; //Set Gravity
    boolean inf;

    //Constructor
    Ball(int tempx, int tempy, int tempr, boolean tempinf) {
        x = tempx;//Set x cord
        y = tempy;//Set y cord
        r = tempr;//Set the radius
        inf = tempinf;
       
       //Set Velocity
        dx = int(random(-10,10));
        dy = int(random(-10,10));
        grav = 0;
        
        //Set Colour Values
        cr = int(random(0,255));
        cg = int(random(0,255));
        cb = int(random(0,255));
    }

    void display() {
        if (inf == true) {
            cr = 255;
            cg = 0;
            cb = 0;
            grav = -1;
        }
        fill(cr, cg, cb);
        circle(x, y, r*2);
    }

    void move() {
        y += dy;
        x += dx;
        dy -= grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy*-1;
        }
        if (x >= width-r || x <= 0+r) {
          dx = dx*-1;
    }
}

    void cc(Ball otherBall) {
        double dA = dist(x, y, otherBall.x, otherBall.y);
        double thresh = r + otherBall.r;
        if (dA < thresh) {
            int tempdx = dx;
            int tempdy = dy;
            dx = otherBall.dx;
            dy = otherBall.dy;
            otherBall.dx = tempdx;
            otherBall.dy = tempdy;
            if (otherBall.inf == true && inf == false) {
                inf = true;
            }
            else if (otherBall.inf == false && inf == true) {
                otherBall.inf = true;
            }
        }
    }

}


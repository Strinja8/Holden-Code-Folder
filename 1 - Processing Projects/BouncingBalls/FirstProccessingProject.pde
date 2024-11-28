Ball redball;

//Happens Once
void setup() {
    size(1280, 720);
    background(200, 200, 200);
    redball = new Ball();
}

//Happens constantly
void draw() {
    background(200, 200, 200);
    redball.display();
    redball.move();
}

class Ball {
    int x, y, r;

    //Constructor
    Ball() {
        x = 640;
        y = 360;
        r = 100;
    }

    void display() {
        circle(x, y, r*2);
    }

    void move() {
        if (y <= height - r) {
            y++;
            x++;
        }
    }
}

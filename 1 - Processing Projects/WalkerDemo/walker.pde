class Walker {
    int x, y; //Position
    int size;
    int speed;
    int cr, cg, cb;
    boolean npc; //is this a computer

    //Constructor
    Walker(int tempx, int tempy, boolean tempnpc) {
        x = tempx;
        y = tempy;
        size = 50;
        speed = 10;
        npc = tempnpc; // If true -> Automate!
        cr = int(random(0,255));
        cg = int(random(0,255));
        cb = int(random(0,255));
    }

    void display() {
        fill(cr, cg, cb);
        rect(x, y, size, size); //X-cord, Y-cord, Width, and Height
    }

    // dir 0 = up, 1 = left, 2 = down, 3 = right
    void move(int dir) {
        
        //Computer Movement
        if(npc) {
            dir = int(random(0,4));
        }
        
        //Move Up
        if (dir == 0 && y > 0 + size) {
            y -= speed;
        }
        //Move Left
        else if (dir == 1 && x > 0 + size) {
            x -= speed;
        }
        //Move down
        else if (dir == 2 && y < height - size) {
            y += speed;
        }
        //Move right
        else if (dir == 3 && x < width - size) {
            x += speed;
        }
    }
}


//Walker Demo
//Intro to Keyboard input for movement
Walker noahy, john, fanum, hawk, diddy, fanum2, hawk2, diddy2, fanum3, hawk3, diddy3;

void setup() {
    size(1280, 720);
    noahy = new Walker(width/2+160, height/2, false);
    john = new Walker(width/2-160, height/2, false);
    fanum = new Walker(int(random(0,width)), int(random(0,height)), true);
    hawk = new Walker(int(random(0,width)), int(random(0,height)), true);
    diddy = new Walker(int(random(0,width)), int(random(0,height)), true);
    fanum2 = new Walker(int(random(0,width)), int(random(0,height)), true);
    hawk2 = new Walker(int(random(0,width)), int(random(0,height)), true);
    diddy2 = new Walker(int(random(0,width)), int(random(0,height)), true);
    fanum3 = new Walker(int(random(0,width)), int(random(0,height)), true);
    hawk3 = new Walker(int(random(0,width)), int(random(0,height)), true);
    diddy3 = new Walker(int(random(0,width)), int(random(0,height)), true);
}

void draw() {
    background(255);
    noahy.display();
    john.display();

    fanum.display();
    fanum.move(0);
    hawk.display();
    hawk.move(0);
    diddy.display();
    diddy.move(0);
    fanum2.display();
    fanum2.move(0);
    hawk2.display();
    hawk2.move(0);
    diddy2.display();
    diddy2.move(0);
    fanum3.display();
    fanum3.move(0);
    hawk3.display();
    hawk3.move(0);
    diddy3.display();
    diddy3.move(0);
}

void mousePressed() {

}

void keyPressed() {
    // For Arrpws, use keyCode and UP, DOWN, ENTER, ect..
    // For ACSII char's, use 'key', and 'a', 'w', ect..

    //Noahy Movement
    if (keyCode == UP) {
        noahy.move(0);
    }
    else if (keyCode == LEFT) {
        noahy.move(1);
    }
    else if (keyCode == DOWN) {
        noahy.move(2);
    }
    else if (keyCode == RIGHT) {
        noahy.move(3);
    }

    //John Movement
    else if (key == 'w') {
        john.move(0);
    }
    else if (key == 'a') {
        john.move(1);
    }
    else if (key == 's') {
        john.move(2);
    }
    else if (key == 'd') {
        john.move(3);
    }
}
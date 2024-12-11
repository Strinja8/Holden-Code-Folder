grid g;

void setup() {
  size(1280,720);
  g = new grid(10, 10);
}


void draw() {
  background(220);
  g.display();
}

void mousePressed() {
 g.click(mouseX, mouseY); 
}

void keyPressed() {
  if(key == 'c') {
   g.clear(); 
  }
  else if (key == '5') {
   g.five();
  }
}

class grid {  
  int ROWS, COLS;
  boolean[][] gridArray;
  
  grid(int tempr, int tempc) {
   ROWS = tempr;
   COLS = tempc;
   gridArray = new boolean[ROWS][COLS];
   
  clear();

}

void display() {
  
 for (int y = 0; y < ROWS; y++) {
  for (int x = 0; x < COLS; x++) {
    if (gridArray[y][x] == false) {
    fill(255);
    }
    else {
     fill(0); 
    }
    int CW = width / COLS;
    int CH = height / ROWS;
    
    rect(x * CW, y * CH, CW, CH);
  }
 }
}
  
  
  void click(int mx, int my) {
    int CW = width / COLS;
    int CH = height / ROWS;
    
    int x = mx / CW;
    int y = my / CH;
    
    if (gridArray[y][x] == false) {
     gridArray[y][x] = true; 
    }
    else {
     gridArray[y][x] = false; 
    }
  }
  
  void clear() {
       for (int y = 0; y < ROWS; y++) {
     for (int x = 0; x < COLS; x++) {
       gridArray[y][x] = false;
     }
   }
  }
 
  void five() {
   for (int y = 0; y < ROWS; y++) {
    for(int x = 0; x < COLS; x++) {
     if(y == 5 || x == 5) {
      gridArray[y][x] = true; 
     }
    } 
   }
  }
}

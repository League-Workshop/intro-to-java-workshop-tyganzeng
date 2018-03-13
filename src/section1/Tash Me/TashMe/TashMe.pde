PImage mustache;
  PImage face;
void setup(){
  face = loadImage("face.jpg");
    size(800,600);
    face.resize(width,height);
  mustache = loadImage("mustache.png");
    mustache.resize(350,100);
}

void draw(){
 background(face);
 if(mousePressed){
   image(mustache, mouseX-175, mouseY-50);
 }
}
import processing.core.*;
public class Start extends PApplet
{
  private int rotation = 0;
  private float speed = 1;
  private Cube cube;
  int vx = 7; //shouldn't have these in here, also not using the class
  int vy = 7;
  int vz = 50;
  int r = 0;
  int g = 0;
  int b = 0;

  public void settings()
  {
    fullScreen(P3D);
  }
  public void setup()
  {
    cube = new Cube(this);
  }

  public void draw()
  {
    background(r, g, b);

    for(int x = 0; x<width; x+=(vx*2))
    {
      for(int y = 0; y<height; y+=(vy*2))
      {
        pushMatrix();
        translate(x,y,-100);
        rotate(radians(rotation+x+y));
        translate(-20,-20);

        cube.display();

        cube.colorChange(); //makes them rainbow

        popMatrix();
      }
    }
    rotation+=speed;
  }

  public void keyPressed()
  {
    if(keyCode == LEFT)//faster
    {
      speed+=1;
    }
    if(keyCode == RIGHT)//slower
    {
     speed-=1;
    }
    if (keyCode == UP && vx < 30)//bigger
    {
     vx += 1;
     vy += 1;
    }
    if (keyCode == DOWN && vx > 10)//smaller
    {
     vx -= 1;
     vy -= 1;
    }
  }
  public void mousePressed()
  {
    cube.colorChange();
  }

  public static void main(String[] args)
  {
    PApplet.main("Start");
  }
}

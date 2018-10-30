import processing.core.*;
public class Cube
{
  public Cube(PApplet papplet) //colorIn
  {
    this.papplet = papplet;
    vx = 7; //set to values
    vy = 7;
    vz = 50;
    c1 = papplet.color(papplet.random(255),papplet.random(255),papplet.random(255));
    //color = colorIn;
  }

  public void display()
  {
    papplet.fill(c1);
    papplet.box(vx, vy, vz);
  }

  public void colorChange()
  {
    int newRandom = papplet.color(papplet.random(255),papplet.random(255),papplet.random(255));
    c1 = newRandom;
      //c1 +=2;
  }

  private PApplet papplet;
  private float vx;
  private float vy;
  private float vz;
  private int c;
  private int c1;
  private int c2;
  private int c3;
}

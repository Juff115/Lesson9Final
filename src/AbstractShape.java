
import TurtleGraphics.Pen;


public abstract class AbstractShape{
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos=0;
        yPos=0;
    }
    
    public AbstractShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    
    //cant be defiened here
    //but must be aknowledged
    public abstract double area(); 

    public abstract void draw(Pen p);

      public double getxPos() {
        return xPos;
    }

       public double getyPos() {
        
        return yPos;
    }

      public void move(double x, double y) {
        xPos=x;
        yPos=y;
    }
      
    public abstract void stretchBy(double factor);
    
    public String toString(){
        return "X-Y: ("+xPos+", "+yPos+")" +"\n";
    }
}

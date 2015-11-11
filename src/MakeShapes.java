import TurtleGraphics.*;
public class MakeShapes {

    
    public static void main(String[] args) {
        AbstractShape x, y, z;
        x=new Rectangle(-150,110,300,220);
        Pen p = new WiggleRainbowPen(new SketchPadWindow(600,400));
        x.draw(p);
        y=new Wheel(0,0,100,8);
        y.draw(p);
    }
    
    public AbstractShape makeShape(String type, AbstractShape s){
       return null; 
    }
}

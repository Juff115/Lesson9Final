import TurtleGraphics.*;
public class MakeShapes {

    
    public static void main(String[] args) {
        AbstractShape x, y, z;
        x=new Rectangle(-150,110,300,220);
        Pen p = new WiggleRainbowPen(new SketchPadWindow(600,400));
        x.draw(p);
        y=new Wheel(0,0,100,8);
        y.draw(p);
        z=makeShape("circle",x);
        z.move(150, 110);
        z.draw(p);
        AbstractShape w = makeShape("wheel",x);
        w.draw(p);
    }
    
    public static AbstractShape makeShape(String type, AbstractShape s){
       AbstractShape returnshape;
       double x=s.getxPos();
       double y=s.getyPos();
       if (type.equals("circle")){
           returnshape= new Circle(x,y,50);
       }
       else if (type.equals("wheel")){
           returnshape= new Wheel(x,y,50,12);
       }
       else{//make a rectangle
           returnshape= new Rectangle(x,y,100,150);
       }    
       return returnshape; 
    }
}

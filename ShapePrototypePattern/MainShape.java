package ShapePrototypePattern;

public class MainShape {
    public static void main(String args[]){
        Triangle t=new Triangle("Red");
        Circle C=new Circle("yellow");
        Rectangle R=new Rectangle("Blue");

        ShapeRegistery shreg=new ShapeRegistery();

        shreg.registerShape("Rectangle",R);
        shreg.registerShape("Circle", C);
        shreg.registerShape("Triangle", t);

        Shape rect=shreg.CreateShape("Rectangle");
        
        rect.display();

    }
    
}

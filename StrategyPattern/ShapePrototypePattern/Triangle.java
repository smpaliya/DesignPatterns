package ShapePrototypePattern;

public class Triangle implements Shape {
    String color;
    public Triangle(String color){
        this.color=color;
    }
    public Shape clone(){
        try{
            return (Shape)super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Error occured due to exception");
            return null;
        }
    }
    public void display(){
        System.out.println("It is a "+color+" Circle");
    }
}

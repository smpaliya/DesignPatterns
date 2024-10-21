package ShapePrototypePattern;

public class Rectangle implements Shape {
      String color;
    Rectangle(String color){
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
        System.out.println("It is a "+color+" rectangle");
    }
}

package PrototypePattern;
public class LandMonster implements Monster {
    private String color;
    public LandMonster(String c){
        this.color=c;
    }

    @Override
    public void display(){
System.out.println("Display called");  
System.out.println("Land monster ceated of "+color);    
}
    @Override
    public Monster clone(){
        //Object class ke clone() ka return type object hai
        try{ 
            return (Monster)super.clone();
        } catch(CloneNotSupportedException e){
            System.out.println("Exception occured !!!");
            return null;
        }
    }
}


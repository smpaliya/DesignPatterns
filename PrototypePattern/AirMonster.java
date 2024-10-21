package PrototypePattern;

public class AirMonster implements Monster{
    private String color;

    public AirMonster(String c){
        this.color=c;
    }
    @Override
    public void display(){
        System.out.println("Display called");  
        System.out.println("Air monster ceated of "+color);    
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

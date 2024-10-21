package PrototypePattern;
import java.lang.Cloneable; 
  
public interface Monster extends Cloneable{
    void display();
    Monster clone();
} 

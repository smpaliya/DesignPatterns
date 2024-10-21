package ShapePrototypePattern;
import java.lang.Cloneable; 
public interface Shape extends Cloneable {

    Shape clone();
    void display();
    
}

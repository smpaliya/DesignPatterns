package ShapePrototypePattern;
import java.util.HashMap;

public class ShapeRegistery {

    HashMap<String,Shape> map=new HashMap<>();

    public void registerShape(String type,Shape sh){
       map.put(type, sh);
    }

    public Shape CreateShape(String key){
        Shape s=map.get(key);
        if(s!=null){
            return s.clone();
        }
        else{
            return null;
        }
    }
}

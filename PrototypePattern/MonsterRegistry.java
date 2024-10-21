package PrototypePattern;
import java.util.HashMap;

public class MonsterRegistry implements Cloneable {
    HashMap<String,Monster> map=new HashMap<>();

    void registerMonster(String key,Monster m){
        map.put(key, m);
    }

    Monster createMonster(String key){
        //m gets the prototype from hashmap
        Monster m=map.get(key);
        if(m!=null){ 
            return m.clone();
        }
        else{
            return null;
        }
          
            
    }
}

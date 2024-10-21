package PrototypePattern;

public class MainMonster {
    public static void main(String args[]){
        AirMonster Am= new AirMonster("Red");
        LandMonster Lm=new LandMonster("Pink");

        MonsterRegistry reg=new MonsterRegistry();
         reg.registerMonster("AirMonster",Am);
         reg.registerMonster("LandMonster", Lm);

         //create clone of air monster

         Monster m=reg.createMonster("AirMonster");

         //print airmonster details

         m.display();



    }
    
}

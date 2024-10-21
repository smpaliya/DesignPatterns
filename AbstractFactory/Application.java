package AbstractFactory;

public class Application{
    Button b;
    CheckBox ch;
    //the factory we will use in constructor that os's object will be created
    public Application(GUIFactory factory){
        b=factory.createButton();
        ch=factory.creatCheckBox();
    }
    void paint(){
        b.paint();
        ch.paint();
    }
}

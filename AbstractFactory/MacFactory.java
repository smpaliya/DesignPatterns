package AbstractFactory;
public class MacFactory implements GUIFactory {
    public Button createButton(){
        return new MacButton();
    }
    public CheckBox creatCheckBox(){
        return new MacCheckBox();
    }
}

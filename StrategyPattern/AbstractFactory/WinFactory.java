package AbstractFactory;
public class WinFactory implements GUIFactory {
    public Button createButton(){
        return new WinButton();
    }
    public CheckBox creatCheckBox(){
        return new WinCheckBox();
    }
}

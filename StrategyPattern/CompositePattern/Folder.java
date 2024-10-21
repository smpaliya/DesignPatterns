import java.util.ArrayList;
public class Folder implements FilesystemComponent {
    String name;
    ArrayList<FilesystemComponent> array =new ArrayList<>();
    Folder(String name){
        this.name=name;
    }
    public void add(FilesystemComponent filesystem) {
      this.array.add(filesystem);
    }
    
    public void remove(FilesystemComponent filesystem){
        this.array.remove(filesystem);
    };
    public void getChild(int i){
       FilesystemComponent fget=this.array.get(i);
       fget.display();
    };
    public void display(){
        System.out.println("Folder Name :"+this.name);
        System.out.println("Folder Contents");
        for(int i=0;i<this.array.size();i++){
            getChild(i);
        }
    }
    
}

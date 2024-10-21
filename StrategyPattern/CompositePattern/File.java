
public class File implements FilesystemComponent {
    String name;
    File(String name){
        this.name=name;
    }
    public void add(FilesystemComponent filesystem) {
        throw new UnsupportedOperationException("Operation not supported");
    }
    
    public void remove(FilesystemComponent filesystem){
        throw new UnsupportedOperationException("Operation not supported");
    };
    public void getChild(int i){
        throw new UnsupportedOperationException("Operation not supported");
    };
    public void display(){
        System.out.println("Name :"+this.name);
    }
}

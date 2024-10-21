public class Client {
    public static void main(String args[]){
        File file1=new File("File1");
        File file2=new File("File2");
        Folder Folder1=new Folder("Folder1");
        Folder Folder2=new Folder("Folder2");
        Folder1.add(file1);
        Folder1.add(file2);
        Folder1.add(Folder2);
        Folder1.display();
    }
    
}

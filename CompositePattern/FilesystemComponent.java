public interface FilesystemComponent {
    void display();
    void add(FilesystemComponent filesystem);
    void remove(FilesystemComponent filesystem);
    void getChild(int i);
}
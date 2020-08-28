package Interface;

public interface DASU<O> {
    void getAll();
    void update(O o);
    void remove(String name);
    void add(O o);
    void search(String name);
}

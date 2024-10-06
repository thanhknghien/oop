public interface Modify<T> {
    void add(T item);
    void edit(T item);
    void delete(int id);
    void importData(String filePath);
    void exportData(String filePath);
    void view();
}

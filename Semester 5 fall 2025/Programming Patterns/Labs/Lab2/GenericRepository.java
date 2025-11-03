import java.util.List;
interface GenericRepository<T> {
    void add(T item);
    T get(int index);
    List<T> getAll();
}

public class DataPacket<T> {
    private T content;

    public DataPacket(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

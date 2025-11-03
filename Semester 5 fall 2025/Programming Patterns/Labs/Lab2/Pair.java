public class Pair<K, V> { //k for key and v for value
    private K key;
    private V value;

    public Pair(K key, V value) { // Constructor
        this.key = key;
        this.value = value;
    }


    //Accessors methods
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("key = %1$s, value = %2$s", key, value);
    }
}
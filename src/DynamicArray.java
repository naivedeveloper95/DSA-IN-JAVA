public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

    }

    public int search(Object data) {
        return -1;
    }

    private void grow() {

    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String str = "";

        for (int i = 0; i < size; i++) {
            str += array[i] + ", ";
        }

        if (str != "") {
            str = "[" + str.substring(0, str.length() - 2) + "]";
        } else {
            return "[]";
        }
        return str;
    }
}
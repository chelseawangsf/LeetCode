package arraylist;

public class MyArrayList {
    private int capacity;
    private int size;
    private int[] data;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        data = new int[capacity];
    }

    public int get(int index) {
        if (index < 0 || index >= size) {  // 边界判断
            // throw Exception
        }
        return data[index];
    }
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            // throw Excpeption
        }
        data[index] = value;
    }
    public void add(int value) {


    }
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            // throw Exception
        }
        if (size == capacity) {
            resize();

        }
        size++;
        for (int  i = size - 1; i >= index + 1; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
    }

    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {

        }
        size--;
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
    }

}

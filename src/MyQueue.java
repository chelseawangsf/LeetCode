public class MyQueue {
    private int size;
    private int capacity;
    private int front;
    private int rear;
    private int[] elementData;

    public MyQueue(int capacity){
        this.capacity = capacity;
        size = 0;
        front = 0;
        rear = 0;
        elementData = new int[capacity];
    }

    public void offer(int val) {
        if (size == capacity) {
            // throw Exception
            System.out.println("size is full");
        } else {
            size++;

            elementData[rear] = val;
            rear = (rear + 1) % capacity;
        }

    }

    public int poll() {
        int result = 0;
        if (size == 0) {
            // throw Exception
            System.out.println("empty");
        } else {
            result = elementData[front];
            size--;
            front = (front + 1) % capacity;
            return result;
        }

        return result;
    }

    public int peek() {
        int result = 0;
        if (size == 0) {
            System.out.println("empty");
        } else {
            result = elementData[front];
        }

        return result;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("Empty");
        } else {
            for (int i = front ;  i < rear; i++) {
                System.out.println(elementData[i]);

            }
            System.out.println("front is "+ front);
            System.out.println("rear is "+ rear);
            System.out.println("size is" + size);
        }
    }
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.offer(1);
        myQueue.offer(91);
        myQueue.offer(10);
        myQueue.printAll();


        System.out.println("after one poll");
        myQueue.poll();
        myQueue.printAll();
    }
}

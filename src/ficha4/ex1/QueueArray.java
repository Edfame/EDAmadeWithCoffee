package ficha4.ex1;

public class QueueArray<AnyType> implements Queue<AnyType> {

    private AnyType[] anyTypes;
    private int size;
    private int lastPos = 0;

    public QueueArray() {
        anyTypes = (AnyType[]) new Object[10];
        this.size = 10;
    }

    public QueueArray(int size) {
        anyTypes = (AnyType[]) new Object[size];
        this.size = size;
    }

    @Override
    public void enqueue(AnyType o) {
        if (lastPos == size)
            throw new RuntimeException("the limit of the queue was reached");

        for (int i = lastPos; i > 0; i--) {
            anyTypes[i] = anyTypes[i - 1];
        }
        anyTypes[0] = o;
        lastPos++;
    }

    @Override
    public AnyType front() {
        return anyTypes[0];
    }

    @Override
    public AnyType dequeue() {
        if (size() == 0)
            throw new RuntimeException("the queue is empty");
        AnyType temp = anyTypes[0];

        for (int i = 0; i < size(); i++) {
            anyTypes[i] = anyTypes[i + 1];
        }
        lastPos--;
        return temp;
    }

    @Override
    public int size() {
        return lastPos;
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }
}

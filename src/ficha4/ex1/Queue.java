package ficha4.ex1;

public interface Queue<AnyType> {
    void enqueue(AnyType o) /*throws OverflowQueueException*/;
    AnyType front() /*throws EmptyQueueException*/;
    AnyType dequeue() /*throws EmptyQueueException*/;
    int size();
    boolean empty();
}

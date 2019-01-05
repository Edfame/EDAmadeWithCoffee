package ficha5.ex1;

public class DoubleLinkedList<AnyType> {

    private Node<AnyType> first;

    public DoubleLinkedList(){
        first = new Node<>();
    }


    public java.util.Iterator iterator() {

    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void remove(int i) {
    }

    public void remove(AnyType x) {
    }

    public void add(AnyType x) {
        Node<AnyType> added = new Node<>(x);
        first.setNext(added);
        added.setPrevious(first);
    }

    public void add(int i, AnyType x) {

    }

    public AnyType get(int i) {
        AnyType anyType = (AnyType) new Object();
        return anyType;
    }

    public void set(int i, AnyType y) {

    }

    public String toString() {
        return "";
    }
}

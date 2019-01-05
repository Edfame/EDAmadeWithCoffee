package ficha5.ex1;

public class Node<AnyType> {

    private AnyType element;
    private Node next;
    private Node previous;

    public Node(AnyType x){
        element = x;
        next = null;
        previous = null;
    }

    public Node(){
        this(null);
    }

    public Node(AnyType thisNode, Node<AnyType> nextNode){
        element = thisNode;
        next = nextNode;
    }

    public Node(Node<AnyType> previousNode, AnyType thisNode, Node<AnyType> nextNode){
        element = thisNode;
        next = nextNode;
        previous = previousNode;
    }

    public AnyType element() throws InvalidNodeException{
        if (this == null)
            throw new InvalidNodeException("Null node");
        return element;
    }

    public Node<AnyType> getNext(){
        return next;
    }

    public void setElement(AnyType element){
        this.element = element;
    }

    public void setNext(Node<AnyType> next){
        this.next = next;
    }

    public Node<AnyType> getPrevious(){
        return previous;
    }

    public void setPrevious(Node<AnyType> previous){
        this.previous = previous;
    }

}

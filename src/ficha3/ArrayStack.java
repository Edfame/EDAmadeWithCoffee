package ficha3;

public class ArrayStack<AnyType> implements Stack<AnyType> {

    private AnyType[] anyTypes;
    private int topPos = 0;

    public ArrayStack(){
        anyTypes = (AnyType[]) new Object[10];
    }

    public ArrayStack(int size){
        anyTypes = (AnyType[]) new Object[size];
    }

    @Override
    public void push(AnyType o){
        if (topPos == this.size())
            throw new RuntimeException("above the size");
        anyTypes[topPos] = o;
        topPos++;
    }

    @Override
    public AnyType top() {
        return anyTypes[topPos];
    }

    @Override
    public AnyType pop() {
        if (size() == 0)
            throw new RuntimeException("nothing to remove");
        topPos--;
        return anyTypes[topPos+1];
    }

    @Override
    public int size() {
        return topPos+1;
    }

    @Override
    public boolean empty() {
        if (topPos == 0)
            return true;
        return false;
    }

    public String toString(){
        String finalText = "";

        for (AnyType anyType: anyTypes){
            if (anyType == null)
                break;
            finalText += anyType.toString() + " ";
        }

        return finalText;
    }
}

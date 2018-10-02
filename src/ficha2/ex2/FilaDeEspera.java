package ficha2.ex2;

public interface FilaDeEspera<AnyType> extends Comparable<FilaDeEspera<AnyType>>{

    public int getSize();

    public int getMaxSize();

    public int getPlaces();

    public boolean isFull();

    public boolean isEmpty();

    public void addElement(AnyType object);

    public AnyType getFirstElement();

    public AnyType removeFirst();

    public String getElements();

}

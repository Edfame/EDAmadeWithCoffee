package ficha10;

public abstract class HashTable<AnyType> {

    private Element<AnyType>[] elements;
    private int count = 0;

    public HashTable(){
        elements = new Element[10];
    }

    public HashTable(int dimension){
        elements = new Element[dimension];
    }

    public int ocupados(){
        return this.count;
    }

    public float factorCarga(){
        return (this.count/elements.length);
    }

    protected abstract int procPos(AnyType x);

    public void alocarTabela(int dimension){
        elements = new Element[dimension];
        count = 0;
    }

    public void tornarVazia(){
        elements = new Element[elements.length];
        count = 0;
    }

    public AnyType procurar(AnyType x){
        int pos = procPos(x);

        if (elements[pos] == null || !elements[pos].isActive())
            return null;

        return elements[pos].getElement();
    }

    public void remove(AnyType x){
        elements[procPos(x)].remove();
        count--;

    }

    public void insere(AnyType x){
        int pos = procPos(x);

        if (!elements[pos].isActive())
            elements[pos].setActive();
        else if (elements[pos] == null)
            elements[pos] = new Element<>(x);

        count++;
    }

    public void reHash(){

    }

    public void print(){

    }
}

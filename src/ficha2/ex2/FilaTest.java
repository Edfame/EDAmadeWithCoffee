package ficha2.ex2;

import java.util.ArrayList;

public class FilaTest<AnyType> implements FilaDeEspera<AnyType> {

    ArrayList<AnyType> nomes = new ArrayList<>();

    private int maxSize = 20;

    @Override
    public int getSize() {
        return nomes.size();
    }

    @Override
    public int getMaxSize() {
        return this.maxSize;
    }

    @Override
    public int getPlaces() {
        return this.getMaxSize() - this.getSize();
    }

    @Override
    public boolean isFull() {
        return this.getMaxSize() == this.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    @Override
    public void addElement(AnyType object) {
        nomes.add(object);
    }


    @Override
    public AnyType getFirstElement() {
        return nomes.get(0);
    }

    @Override
    public AnyType removeFirst() {
        AnyType first = nomes.get(0);
        nomes.remove(0);
        return first;
    }

    @Override
    public String getElements() {
        return nomes.toString();
    }

    @Override
    public int compareTo(FilaDeEspera<AnyType> fila) {
        if (this.getSize() == fila.getSize()) {
            return 0;
        } else if (this.getSize() < fila.getSize()) {
            return -1;
        } else {
            return 1;

        }
    }

}

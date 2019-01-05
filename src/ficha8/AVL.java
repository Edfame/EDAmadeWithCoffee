package ficha8;

public class AVL<AnyType extends Comparable<? super AnyType>> implements AVLInterface<AnyType> {

    private No<AnyType> root;

    public AVL(){
        root = new No<>();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(AnyType x) {
        return false;
    }

    @Override
    public AnyType findMin() {
        return null;
    }

    @Override
    public AnyType findMax() {
        return null;
    }

    @Override
    public void insert(AnyType x) {

    }

    @Override
    public void remove(AnyType x) {

    }

    @Override
    public void printEmOrdem() {

    }

    @Override
    public void printPosOrdem() {

    }

    @Override
    public void printPreOrdem() {

    }

    @Override
    public void rodateRight() {

    }

    @Override
    public void rodateLeft() {

    }

    @Override
    public void rodateRightLeft() {

    }

    @Override
    public void rodateLeftRight() {

    }

    @Override
    public void heightUpdate() {

    }

    @Override
    public boolean isBalanced() {
        return false;
    }

}
package ficha4.ex1;

import ficha5.ex1.Node;

public class Teste{

    public static void main(String[] args) {

        Node<Integer> nodes = new Node<>();

        nodes.setElement(1);
        nodes.setNext(new Node<>(2));

        System.out.println(nodes.element());
        System.out.println(nodes.getNext().element()+"\n");

        nodes.getNext().setNext(new Node<>(3));

        System.out.println(nodes.element());
        System.out.println(nodes.getNext().element());
        System.out.println(nodes.getNext().getNext().element()+"\n");

        nodes.getNext().setPrevious(nodes);
        nodes.getNext().getPrevious().setElement(0);

        System.out.println(nodes.element());
        System.out.println(nodes.getNext().element());
        System.out.println(nodes.getNext().getNext().element()+"\n");
    }
}

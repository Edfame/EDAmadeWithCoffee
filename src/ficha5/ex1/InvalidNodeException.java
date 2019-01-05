package ficha5.ex1;

public class InvalidNodeException extends RuntimeException{

    public InvalidNodeException(){
        super();
    }

    public InvalidNodeException(String msg){
        super(msg);
    }
}

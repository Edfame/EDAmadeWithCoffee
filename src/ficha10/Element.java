package ficha10;

public class Element<AnyType> {

    private AnyType e;
    private boolean active;

    public Element(AnyType x){
        this.e = x;
        this.active = true;
    }

    public AnyType getElement() {
        return e;
    }

    public void setElement(AnyType e) {
        this.e = e;
    }

    public void setActive() {
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void remove(){
        this.active = false;
    }
}

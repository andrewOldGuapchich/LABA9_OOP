package patterns;

public interface Copyable {
    Copyable copy();
}

class ComplicatedObject implements Copyable {
    private Type type;
    public enum Type {
        ONE, TWO;
    }

    @Override
    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type){
        this.type = type;
    }
}

class PrototypeTest {//тест
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }
}

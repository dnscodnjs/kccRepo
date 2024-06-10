package kosa.oopInterface;

public class Work extends Man implements Speakable{
    public Work(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return getName() + "열심히 일해라";
    }
}

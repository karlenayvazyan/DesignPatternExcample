package pattern.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside pattern.factory.Square::draw() method.");
    }
}

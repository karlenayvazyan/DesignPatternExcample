package pattern.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        factory.getShape(ShapeType.CIRCLE).draw();
        factory.getShape(ShapeType.SQUARE).draw();
        factory.getShape(ShapeType.RECTANGLE).draw();
    }
}

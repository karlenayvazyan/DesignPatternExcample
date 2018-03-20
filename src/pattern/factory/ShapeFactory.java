package pattern.factory;

public class ShapeFactory {

    public Shape getShape(ShapeType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}

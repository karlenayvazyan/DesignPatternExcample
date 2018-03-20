package pattern.abstractfp;

import pattern.factory.*;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType type) {
        throw new RuntimeException("This method should not call");
    }

    @Override
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

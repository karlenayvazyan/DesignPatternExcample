package pattern.abstractfp;

import pattern.factory.Shape;
import pattern.factory.ShapeType;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            case BLUE:
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(ShapeType type) {
        throw new RuntimeException("This method should not call");
    }
}

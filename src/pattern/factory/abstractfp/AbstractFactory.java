package pattern.factory.abstractfp;

import pattern.factory.Shape;
import pattern.factory.ShapeType;

public abstract class AbstractFactory {

    public abstract Color getColor(ColorType type);

    public abstract Shape getShape(ShapeType type);
}

package pattern.factory.abstractfp;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
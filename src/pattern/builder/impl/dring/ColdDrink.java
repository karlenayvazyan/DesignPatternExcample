package pattern.builder.impl.dring;

import pattern.builder.Item;
import pattern.builder.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}

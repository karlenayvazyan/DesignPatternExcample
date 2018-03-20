package pattern.builder.impl.burger;

import pattern.builder.Item;
import pattern.builder.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

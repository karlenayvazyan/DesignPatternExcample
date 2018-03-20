package pattern.builder.impl.burger;

import pattern.builder.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

package pattern.builder.impl.dring;

public class Pepsi extends ColdDrink {

   @Override
   public double price() {
      return 35.0f;
   }

   @Override
   public String name() {
      return "Pepsi";
   }
}
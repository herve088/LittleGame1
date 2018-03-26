public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new Bourse1());		
      System.out.println("Your bourse is  " + context.executeStrategy(10));

      context = new Context(new Bourse2());		
      System.out.println("Your bours is  " + context.executeStrategy(10));

      
   }
}
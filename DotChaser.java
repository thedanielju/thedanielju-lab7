import java.util.*;

public class DotChaser {  
  public static Random rand = new Random(System.currentTimeMillis());
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;
    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList things = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {
        things.addThing(new TypeA(45, 60));
        things.addThing(new TypeB(55, 50));
      }
      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      things.printAll();
      System.out.println("done");
      System.out.flush();
      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      things.moveAll();
      count++;
    }
  }
}

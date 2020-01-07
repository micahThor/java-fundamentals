import java.time.LocalDateTime;
import java.util.TimerTask;
import java.util.Timer;

public class Main {

  public static void main(String[] args) {

    // TEST PLURALIZE METHOD
    System.out.println("*********************");
    System.out.println("PLURALIZE METHOD TEST");
    System.out.println("*********************");
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // TEST FLIPNHEADS METHOD
    System.out.println("*********************");
    System.out.println("COIN FLIP METHOD TEST");
    System.out.println("*********************");
    flipNHeads(3);

    // TEST CLOCK METHOD
    System.out.println("*********************");
    System.out.println("CLOCK METHOD TETS");
    System.out.println("*********************");
    clock();
  }

  /*
  FUNCTION PRINTS TO CONSOLE A GRAMMATICALLY CORRECT ANIMAL NAME.  PLURALIZES WHERE NECESSARY.
  */
  public static String pluralize(String animal, int count) { 

    if (count > 1 || count == 0) {
      return animal + "s";
    }
    return animal;
  }

  /*
  FUNCTION PRINTS TO CONSOLE THE RESULTS OF COIN FLIP, AND HOW MANY SUCCESSIVE HEADS FLIPS TO ACHIEVE INPUT NUMBER
  */
  public static void flipNHeads(int n) {

    int flipCounter = 0;
    int headsCounter = n;

    while (headsCounter > 0) {

      if (Math.random() < 0.5) {
        System.out.println("tails");
        headsCounter = n;
      } else {
        System.out.println("heads");
        headsCounter--;
      }
      flipCounter++;
    }

    String outputText = String.format("It took %d flips to flip %d head in a row", flipCounter, n);

    System.out.println(outputText);
  }

  /*
  FUNCTION PRINTS TIME IN HH:MM:SS FORMAT TO CONSOLE FOR EVERY SECOND
  */
  public static void clock() {

    
    class PrintHourMinutesSeconds extends TimerTask {

      public void run() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
          System.out.println(String.format("%02d:%02d:%02d", hour, minute, second)); 
        }
    }

    Timer timer = new Timer();
    TimerTask task = new PrintHourMinutesSeconds();

    timer.schedule(task, 0, 1000);
  }

}
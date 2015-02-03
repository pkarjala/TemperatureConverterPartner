import com.sun.javafx.css.CssError;

/**
 * Created by patrick on 2/2/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double celsius, fahrenheit = 0;
    // Check for present args
    String firstArg = "0";
    double secondArg = 0.0;
    if( args.length > 0 ) {
        firstArg = args[0];
    } else {
      System.out.println("No arguments provided.");
      System.exit(1);
    }
    if (args.length > 1) {
      try {
        secondArg = Double.parseDouble(args[1]);
      } catch(NumberFormatException f) {
        System.err.println("Second argument " + args[1] + " must be a number.");
        System.exit(1);
      }
    } else {
      System.out.println("No second argument provided.");
      System.exit(1);
    }
    if(firstArg.equals("-F")) {
      fahrenheit = secondArg;
      celsius = (fahrenheit - 32) * 5/9;
      System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
    }
    else if (firstArg.equals("-C")) {
      celsius = secondArg;
      fahrenheit = (celsius * 9/5) + 32;
      System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
    else {
      System.out.println("Illegal first argument");
      return;
    }
  }
}

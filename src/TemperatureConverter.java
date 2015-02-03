/**
 * Created by patrick on 2/2/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double celsius, fahrenheit = 0;
    // If flag is -F for value is Fahrenheit
    for( String value : args ){
      System.out.println("Array Value: " + value);
    }
    if(args[0].equals("-F")) {
      fahrenheit = Double.parseDouble(args[1]);
      celsius = (fahrenheit - 32) * 5/9;
      System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
    }
    else if (args[0].equals("-C")) {
      celsius = Double.parseDouble(args[1]);
      fahrenheit = (celsius * 9/5) + 32;
      System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
    else {
      System.out.println("Illegal first argument");
    }
  }
}

import java.util.Scanner;
public class ControlStructuresif_else {

  public static void main (String[] args){
    //declaring the valid range between 92 and 104
    double highTemp = 104;
    double lowTemp = 92;
    //variable for user input
    double userTemp;
    Scanner scanner = new Scanner(System.in);
    
    //print a message to prompt the user to enter a temperature value
    System.out.println("Please enter a temperature between " + lowTemp + " and " + highTemp);
    userTemp = scanner.nextDouble();

    //testing the user input to ensure the value is within specified range
    if (userTemp > lowTemp && userTemp < highTemp){
      if(userTemp < 97.5){
        System.out.println("The temperature " + userTemp + " degrees is below normal.");
      }
      else if(userTemp > 104){
        System.out.println("The temperature " + userTemp + " degrees is above normal.");
      }
      else{
        System.out.println("The temperature " + userTemp + " degrees is normal.");
      }
    }
    else{
      System.out.println("The temperature you entered is above the valid range!");
    }
  }
}

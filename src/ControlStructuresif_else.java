import java.util.Scanner;
public class ControlStructuresif_else {

  public static void main (String[] args){
    double highTemp = 104;
    double lowTemp = 92;
    double userTemp;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a temperature between " + lowTemp + " and " + highTemp);
    userTemp = scanner.nextDouble();

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

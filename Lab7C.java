import java.util.Scanner;

public class Lab7C {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int value;

    System.out.print("Please enter a value for the size: ");
    value = sc.nextInt();
    sc.close();

    System.out.println("This is the requested " + value + "x" + value + " right-triangle:");

    for (int i = 0; i < value; i++) {
      for (int k = 0; k < (value - i); k++) {
          System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
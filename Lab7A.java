import java.util.Scanner;

public class Lab7A {
  private static int value;

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value for the size: ");
    value = sc.nextInt();
    sc.close();

    System.out.println("This is the requested " + value + "x" + value + " box:");

    for (int i = 0; i < value; i++) {
      for (int j = 0; j < value; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
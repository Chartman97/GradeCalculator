import java.util.Scanner;
public class Main {
// Grade Conversion
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double grade;
// Grade Input
    System.out.print("\nHello, please enter your grade.\nHere ->");
    grade = in.nextDouble();
// Conversion & Output
        if ( grade >= 92 ) {
            System.out.println("Your Grade is: A");
        } else if ( grade >= 89 && grade < 91.99 ) {
            System.out.println("Your Grade is: A-");
        } else if ( grade >= 87 && grade < 88.99 ) {
            System.out.println("Your Grade is: B+");
        } else if ( grade >= 82 && grade < 86.99 ) {
            System.out.println("Your Grade is: B");
        } else if ( grade >= 79 && grade < 81.99 ) {
            System.out.println("Your Grade is: B-");
        } else if ( grade >= 77 && grade < 78.99 ) {
            System.out.println("Your Grade is: C+");
        } else if ( grade >= 72 && grade < 76.99 ) {
            System.out.println("Your Grade is: C");
        } else if ( grade >= 69 && grade < 71.99 ) {
            System.out.println("Your Grade is: C-");
        } else if ( grade >= 67 && grade < 68.99 ) {
            System.out.println("Your Grade is: D+");
        } else if ( grade >= 60 && grade < 66.99 ) {
            System.out.println("Your Grade is: D");
        } else if ( grade >= 0 && grade < 59.99 ) {
            System.out.println("Your Grade is: F");
        } else if ( grade < 0 ) {
            System.out.println("Error -- You must really suck");
        }
    System.out.print("...\nGood Bye\n");
    }
}
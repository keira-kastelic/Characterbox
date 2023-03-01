import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class CharacterBox {
    public static void main(String[] args) {

        System.out.println("Task one"); // printing the task
        Scanner user = new Scanner(System.in); // creating a scanner
        System.out.println("How many lines do you want to print?"); // prompting the user
        int value = user.nextInt(); // reading in the users input
        int rows = value - 2; // subtracting two rows for the astrics
        System.out.println("************"); // printing the astrics line before
        for (int i = 0; i < rows; i++){ // creating a for loop for the amount of times the lines will print
            System.out.print("*"); // adding an astrics before each loop
            for (int n = 0; n < 10; n++){ // creating a for loop to add ni=umbers 0-9
                System.out.print(n); // printing out the numbers
            }System.out.println("*"); // adding an astrics at the end
        }System.out.println("************"); // adding the last line of astrics

        System.out.println("Task two"); // printing the task
        for (int i = 0; i < 5; i++){ // creating a for statement to run the line 5 times
            System.out.print("Save the "); // printing save the
            for (int n = 0; n < 3; n++){ // creating a loop to print something three times
                System.out.print("trees"); // printing trees three times
                for ( int t = 0; t < 3; t++){ // creating a for loop to print something three times after trees
                    System.out.print("!"); // printing !
                }
            }
            System.out.println(); // pressing enter
        }
    }
}

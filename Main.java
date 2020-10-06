 import java.util.Scanner;
/**
 * This program takes any number and computes the factorial of that number
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 
    //ask user for an intger 
    System.out.println("Please enter an integer to calculate the factorial of");
    int integer = input.nextInt(); 
    //creating a variable to keep count of expression
    int count = integer; 
    //the accumulator to add to the count into  
    int sum = 1; 
    //using loop to count up to the sum
    while(count >= 1){
      //print starting number
      System.out.print(count + ",");
      //adding the sum from 1 to whatever the user int is
      sum = sum * count ; 
      //increase value by 1
      count = count - 1;
    }
    

    //tell the user what the sum is 
    System.out.println(integer + "! = " + sum); 

    
  }
}

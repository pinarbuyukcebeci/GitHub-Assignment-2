import java.util.Scanner;
import java.util.Random;


public class GitHub_Assignment_2 {
  
    public static void main(String[] args) {
        boolean again = true;
        while(again)
        {
            // Take choice input
            System.out.println("\nPlease choose what you want to find:");
            System.out.println("-------------------------------");
            System.out.println("1) Minimum of the array:");
            System.out.println("2) Maximum of the array:");
            System.out.println("3) Difference from the average:");
            System.out.println("4) The sum of the odd indexes");
            System.out.println("5) The sum of the even indexes");
            System.out.println("6) Exit");
            System.out.println("-------------------------------");
            System.out.print("Enter choice: ");
            int choice = in.nextInt();
            int sumOfOdd = 0;
            int sumOfEven = 0;

            if (choice == 1)
            {
                System.out.print("The minimum element of the list is: ");
            }
            else if (choice == 2)
            {
                System.out.print("The maximum element of the list is: ");
            }
            else if (choice == 3)
            {
                System.out.print("The differences of elements of the list from average are: ");  
            }
            else if (choice == 4)
            {
                for(int ind=1; ind < arr.length; ind+=2){
                    sumOfOdd += arr[ind];
                }
                System.out.print("The sums of elements on odd indexes: "+ sumOfOdd);  
            }
            else if (choice == 5)
            {
                for(int ind=1; ind < arr.length; ind+=2){
                    sumOfEven += arr[ind];
                }
                System.out.print("The sums of elements on even indexes: " + sumOfEven);  
            }
            else if (choice == 6)
            {
                again = false;
                in.close();
            }
        }
    }

}

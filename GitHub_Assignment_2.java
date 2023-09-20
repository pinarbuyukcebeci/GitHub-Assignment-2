import java.util.Scanner;
import java.util.Random;


public class GitHub_Assignment_2 {

    public static int findMax(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int j=0; j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        return max;
    }

    public static int findMin(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int j=0; j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }
        return min;
    }

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
                System.out.print("The sums of elements on odd indexes: ");  
            }
            else if (choice == 5)
            {
                System.out.print("The sums of elements on even indexes: ");  
            }
            else if (choice == 6)
            {
                again = false;
                in.close();
            }

        }
    }



}

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
                arrDifferenceFromAvg(arr); 
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
            }
        }
    }

    public static void arrDifferenceFromAvg(int[] nums) 
    {
        // creating sum and average variables
        int sum = 0 ;
        int average ;
        //finding sum
        for (int i : nums) 
        {
            sum += i ;
        }

        //displaying average
        if (sum/nums.length % 2 != 0) 
        {
            average = (sum+1)/nums.length ;
            System.out.println("Average of an array is:" + average);
        }
        else 
        {
            average = sum/nums.length ; 
            System.out.println("Average of an array is:" + average);
        }
        

        //creating array where will be shown difference of original values from average
        int[] arrOfDiff = new int[nums.length] ;
        for (int i = 0 ; i < arrOfDiff.length ; i++)  
        {
            arrOfDiff[i] = nums[i] - average ;
        } 

        // displaying array of difference
        System.out.print("The differences of elements of the array from average are:" + Arrays.toString(arrOfDiff));
    }

}

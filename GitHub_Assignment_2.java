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
        Scanner in = new Scanner(System.in);
        int minsize = 6;
        int maxsize = 12;
        Random random = new Random();
        int arrsize = random.nextInt(maxsize - minsize + 1) + minsize;
        int[] arr = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
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
                System.out.print(findMin(arr));
            }
            else if (choice == 2)
            {
                System.out.print("The maximum element of the list is: ");
                System.out.print(findMax(arr));
            }
            else if (choice == 3)
            {
                arrDifferenceFromAvg(arr); 
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
                for(int ind=0; ind < arr.length; ind+=2){
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
        int[] arrFromDiff = new int[nums.length] ;
        for (int i = 0 ; i < arrFromDiff.length ; i++)  
        {
            arrFromDiff[i] = nums[i] - average ;
        } 

        // displaying array of difference
        System.out.print("The differences of elements of the array from average are:" + Arrays.toString(arrFromDiff));
    }



}

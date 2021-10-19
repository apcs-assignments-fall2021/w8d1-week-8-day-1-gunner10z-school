import java.util.Scanner;
import java.util.Arrays;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int)(Math.random()*11+10);
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        // YOUR CODE HERE FOR WARMUP
        /*int[] arr={randomTeen(),randomTeen(),randomTeen()};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int x=randomTeen();
        int y=randomTeen();
        int z=randomTeen();*/
        System.out.println(Mathey.max(5,7,9)); //9
        System.out.println(Mathey.max(3,2));//3
        System.out.println(Mathey.max(0.001,0.005));//0.005
        System.out.println(Mathey.max(0.001,0.002,0.003,0.004));//0.004
        System.out.println(Mathey.randomInteger(6));//num between 0 and 6
        System.out.println(Mathey.randomInteger(3,7));//num between 3 and 7
        System.out.println(Mathey.abs(-10));//10
        System.out.println(Mathey.ceil(0.00005));//1
        System.out.println(Mathey.floor(2.04));//2
        System.out.println(Mathey.pow(2,3));//8
        System.out.println(Mathey.round(3.04));//3

        System.out.println(Mathey.sqrt((Mathey.pow(12,2))+(Mathey.pow(5,2))));



//         // Uncomment this code later!
//         System.out.println("Mathey.max tests");
//         System.out.println(Mathey.max(1, 2)); // 2
//         System.out.println(Mathey.max(2, 1)); // 2
    }

}



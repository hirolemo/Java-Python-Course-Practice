import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int count = sc.nextInt();
        sc.nextLine();
        int[] array = readIntegers(count);
        //findMinElement(array);
        Reverse(array);




    }

    public static int[] readIntegers(int count) {
        Scanner sc1 = new Scanner(System.in);
        int[] array = new int[count];

        for(int i = 0; i<count; i++) {
            System.out.print("Enter an integer: ");
            array[i] = sc1.nextInt();
            sc1.nextLine();
        }
        sc1.close();
        return array;
    }

    public static void findMinElement(int[] array) {
        int min = 0;

        for(int i=0; i< array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(min);

    }

    public static void Reverse(int[] array) {
        int maxInd = (array.length) -1;
        int temp = 0;

        System.out.println("Old: " + Arrays.toString(array));

        for(int i=0; i < (array.length)/2; i++) {

            temp = array[i];
            array[i] = array[maxInd];
            array[maxInd] = temp;
            maxInd--;


        }
        System.out.println("New: " + Arrays.toString(array));
    }
    //extend an array: assign a new array to the one u want to extend.
    //assign ur old array to (new int[x] where x is the extended length
    //use a for loop to set the fields of the extended array to the contents of the old/copied array!

}

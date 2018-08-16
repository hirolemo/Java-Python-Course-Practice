import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] array = getIntegers();
        int[] sorted = sortArray(array);

        for(int i=0; i<10; i++) {
            System.out.print(sorted[i] + " ");
        }



    }

    public static int[] getIntegers() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0; i<10; i++) {
            System.out.println("Enter a number: ");
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    public static int[] sortArray(int[] array) {


        int temp = 0;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i = 0; i< (array.length)-1; i++) {
                if(array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }

        return array;
    }
}

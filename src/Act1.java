import java.util.Arrays;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cual es el tamaño del array?");
        int size= sc.nextInt();
        int[] array;

        array= new int[size];
        System.out.println("Inserta los enteros");
        for (int i=0; i<array.length; i++){

            array[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(array));

    }
}

import java.util.Arrays;

public class Act10 {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};
        int array2[]= {1,2,3,4,5};
        int array3[]= {5,4,3,2,1};

        String arrayFruta[]= {"Manzana","Pera", "Plátano"};
        String arrayFruta2[]={"Pera", "Plátano", "Manzana"};


        System.out.println(equalSinOrden(array, array3));
        System.out.println(equalSinOrdenString(arrayFruta, arrayFruta2));
    }



    public static boolean equalSinOrden(int array[], int array1[]) {


        int sortArray[]= Arrays.copyOf(array, array.length);
        int sortArrat1[]= Arrays.copyOf(array1, array1.length);
        Arrays.sort(sortArray);
        Arrays.sort(sortArrat1);
        for (int i=0; i<array.length; i++){
            if (sortArray[i]!= sortArrat1[i]){
                return false;
            }
        }
        return true;

    }


    public static boolean equalSinOrdenString(String array1[], String array2[]){
        String sortArray1 []= Arrays.copyOf(array1, array1.length);
        String sortArray2[] = Arrays.copyOf(array2,array2.length);

        Arrays.sort(sortArray1);
        Arrays.sort(sortArray2);

        for (int i=0; i<array1.length; i++){
            if (!sortArray1[i].equalsIgnoreCase(sortArray2[i])){
                return false;
            }
        }
        return true;
    }
}


/*
SI FUERAN STRINGS EQUALS Y NO ==
  for (int i = 0; i < sortedArray1.length; i++) {
            if (!sortedArray1[i].equals(sortedArray2[i])) {
                return false;
            }
        }
 */
/*
Arrays.sort(): orden abecedario o numerico

    Arrays.sort(array): Ordena los elementos de un array en orden ascendente. Utiliza el algoritmo de ordenación rápido (Quicksort) para lograr una eficiencia general muy buena.
 */

/*
Arrays.copyOf():

    Arrays.copyOf(original, newLength): Crea y devuelve una copia del array original con la longitud especificada (newLength).
 */
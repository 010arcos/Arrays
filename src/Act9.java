public class Act9 {
    public static void main(String[] args) {

        int array[]= {1,2,3,4,5};
        int array2[]= {1,2,3,4,5};
        int array3[]= {5,4,3,2,1};


        System.out.println(equals(array, array2));
        System.out.println(equals(array, array3));



    }


    public static boolean equals(int array1 [], int array2 []){

        if (array1.length!=array2.length){
            return false;
        }

        if (array1==null||array2==null){
            return false;
        }

        for (int i=0; i<array1.length; i++){
            if (array1[i] != array2[i]) {
                return false;
            }
            }
        return true;




        }



    }


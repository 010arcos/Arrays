import javax.swing.*;

public class Act2 {
    public static void main(String[] args) {
        int listaArray[]= {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max=0;



        for (int i=0; i<listaArray.length;i++){

           if (max<listaArray[i]){
               max=listaArray[i];
           }
        }
        System.out.println("El numero máximo es: " + max);



    }



}

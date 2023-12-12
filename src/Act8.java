import java.util.Arrays;

public class Act8 {
    public static void main(String[] args) {
        double array[]= {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};


        double arrayMedia=mediaArray(array);
        System.out.println("La media del array es: " + arrayMedia);

    }


    public static double mediaArray(double[]array){
        double total=0.0;
        double mediaFinal=0;


        for (double numero: array ){
           total= total+numero;
           mediaFinal= total/2;
            System.out.println("total es: " + total);


        }
        return mediaFinal;

    }
}

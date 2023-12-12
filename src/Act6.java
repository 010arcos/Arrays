public class Act6 {
    public static void main(String[] args) {
        //Realiza ejericicio 3 y 4 con ForEach

        System.out.println("Ejercicio 3 con For Each");
        int listaArray[]= {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max=0;
        for (int numero: listaArray){
            if (max<numero){
                max=numero;
            }
        }
        System.out.println("El numero max es: " + max);

        System.out.println("--------------------------");

        System.out.println("Ejercicio 4 con For Each");
        int lista[]= {-35, -13, -77, -46, -82, -2, -26};
        int min=0;
        for (int numero: lista){
           if (min>numero){
               min=numero;
           }
        }
        System.out.println("El numero min es: " + min);

    }
}




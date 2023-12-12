public class Act4 {
    public static void main(String[] args) {
        int lista[]= {-35, -13, -77, -46, -82, -2, -26};
        int min=0;

        for (int i=0; i<lista.length; i++){
            if (min>lista[i]){ //
                min= lista[i];
            }
            System.out.println("El numero minimo es: " + min);
        }


    }
}
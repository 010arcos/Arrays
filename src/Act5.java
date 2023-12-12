public class Act5 {
    public static void main(String[] args) {
        int pagoSemanal[]= {987, 688, 1324, 450, 667, 801};
        int sum=0;
        for (int i=0; i<pagoSemanal.length; i++){
            sum= sum + pagoSemanal[i];
            System.out.println("La iteracion: " + i + " es: "+ sum);
        }

        System.out.println("--------------");
        System.out.println("El total del Pago Semanal es: " + sum);

    }
}

import java.util.Scanner;

public class pembelianbarang {

    public static void main(String[] args) {
        double total, diskon, potHar;

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan total pembelian: ");
        total = input.nextDouble();

        if (total > 150000) {
            potHar =0;
            diskon = 0.1 * total;
            total -= diskon;
        }else{
            diskon = 0;
            potHar = 5000;
            total-= potHar;
        }

        System.out.println("Diskon: " + diskon);
        System.out.println("potonagan Harga: "+ potHar);
        System.out.println("Total yang harus dibayarkan: " + total);
    }
}
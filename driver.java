import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        
        String dwi = null;
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner hamzah = new Scanner (System.in);

        System.out.print("Apa ada barang yang anda inginkan? (CD/DVD) ");
        dwi = hamzah.next();

        if(dwi.equalsIgnoreCase("CD")) {
            cd.print();
        }else if(dwi.equalsIgnoreCase("DVD")) {
            dvd.print();


        }else{
            System.out.println("Maaf, Kami Hanya Menyediakan CD atau DVD");
        }
    }
}
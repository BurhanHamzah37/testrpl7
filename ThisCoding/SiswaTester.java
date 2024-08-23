//object class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan Id Sisiwa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();
        // object
        // Class object = new Construction
        Siswa azam = new Siswa();
        Siswa Ibra = new Siswa();
        Siswa Melvin = new Siswa();
        Siswa Gilam = new Siswa();
        Siswa Kinza = new Siswa();
        Siswa ryu = new Siswa(1,"hikaru",100);
        azam.id = 22;
        azam.nama = "azam";
        azam.ipk = 90;

        Ibra.id = 29;
        Ibra.nama = "Ibra";
        Ibra.ipk = 90;

        Melvin.id = 21;
        Melvin.nama = "Melvin";
        Melvin.ipk = 90;

        Gilam.id = 19;
        Gilam.nama = "Gilam";
        Gilam.ipk = 90;

        Kinza.id = 15;
        Kinza.nama = "Kinza";
        Kinza.ipk = 90;

        System.out.println("ID : " + azam.id);
        System.out.println("Nama : " + azam.nama);
        System.out.println("IPK : " + azam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Ibra.id);
        System.out.println("Nama : " + Ibra.nama);
        System.out.println("IPK : " + Ibra.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Melvin.id);
        System.out.println("Nama : " + Melvin.nama);
        System.out.println("IPK : " + Melvin.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Gilam.id);
        System.out.println("Nama : " + Gilam.nama);
        System.out.println("IPK : " + Gilam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Kinza.id);
        System.out.println("Nama : " + Kinza.nama);
        System.out.println("IPK : " + Kinza.ipk);
        azam.print();
        Ibra.print();
        Melvin.print();
        Gilam.print();
        Kinza.print();
        ryu.print();

        input.close();
    }

}
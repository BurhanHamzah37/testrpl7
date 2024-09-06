import java.util.Scanner;

public class tarifparkir {
    public static void main(String[] args) {
        String platnomor;
    int jumlahJam;
    double harga;

    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Nomor Plat: ");
    platnomor = s.nextLine();
    System.out.print("Jumlah jam:");
    jumlahJam = s.nextInt();

    if(jumlahJam >0 && jumlahJam >=1){
        harga=7000;
    }else if(jumlahJam >1 && jumlahJam <=4){
        harga=7000;
    }else if(jumlahJam > 4){
        harga=10000;
    }else{
        harga=0;
        System.out.println("System Eror");
    }

    System.out.println(platnomor);
    System.out.println("Tarif parkir "+harga);
        
    }
    
}

        
    
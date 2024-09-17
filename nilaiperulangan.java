import java.util.Scanner;
public class nilaiperulangan {
    public static void main(String[] args) {
        
        int jumSis;
        double rata,nilai, totalNilai = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Jumalah Siswa");
        jumSis = a.nextInt();

        for (int i = 1; i <= jumSis; i++) {
            System.out.println("nilai siswa " +i +": ");
            nilai = a.nextDouble();
            totalNilai = totalNilai + nilai;
        }
        rata = totalNilai/jumSis;
        System.out.println("Total Nilai: " +totalNilai);
        System.out.println("Rata - Rata Nilai:"+rata);
    }
    
}

//object class
public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Karyawan Reva = new Karyawan(9,"Reva","TU","Madura");
        Karyawan Ibra = new Karyawan(29,"Ibra","Kesiswaan","Lamongan");
        Karyawan Ryu = new Karyawan(31,"Ryu","TU","Lamongan");
        Karyawan Gilam = new Karyawan(19,"Gilam","Kesiswaan","Papua");
        Karyawan Kinza = new Karyawan(15,"Kinza","Kurikulum","Sidoarjo");

        Reva.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        Ryu.print();
        System.out.println();
        Gilam.print();
        System.out.println();
        Kinza.print();
    }
}
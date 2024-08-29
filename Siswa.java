//object class
public class Siswa {
    int id;
    String nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor
    //nama harus sama dengan Class
    public Siswa(){
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
    //constructor parameter
    public Siswa(int id, String nama, double
    ipk) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    //menthod print
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("NAMA : + nama");
        System.out.println("IPK : ipk");
    }

}
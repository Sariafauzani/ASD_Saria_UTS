import java.util.Scanner;

public class Rekening26 {

    String NoRekening;
    String nama;
    String namaIbu;
    String Phone;
    String Email;

    public Rekening26(String a, String b, String c, String d, String e){
        NoRekening = a;
        nama = b;
        namaIbu = c;
        Phone = d;
        Email = e;
    }
    
    public String getNoRekening() {
        return NoRekening;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

}
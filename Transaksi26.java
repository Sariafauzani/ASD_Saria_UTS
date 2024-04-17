import java.util.ArrayList;

public class Transaksi26 {
    ArrayList<Transaksi26> transaksis = new ArrayList<>();
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    public Transaksi26(double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }

    public double Saldo() {
        return saldo;
    }

    public double SaldoAwal() {
        return saldoAwal;
    }

    public double SaldoAkhir() {
        return saldoAkhir;
    }

    public String TanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String Type() {
        return type;
    }

    public void tambahTransaksi(Transaksi26 transaksi) {
        transaksis.add(transaksi);
    }

    public void tampilkanRekening(ArrayList<Rekening26> rekenings) {
        System.out.println("==================================");
        System.out.println("          DATA TRANSAKSI          ");
        System.out.println("==================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-20s\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi", "Type");
        System.out.println("----------------------------------");
        for (Transaksi26 trans : transaksis) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-20s %-10s\n", trans.Saldo(), trans.SaldoAwal(), trans.SaldoAkhir(), trans.TanggalTransaksi(), trans.Type());
        }
    }

    public void tampilkanTransaksi() {
        System.out.println("==================================");
        System.out.println("          DATA TRANSAKSI          ");
        System.out.println("==================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-20s\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi", "Type");
        System.out.println("----------------------------------");
        for (Transaksi26 trans : transaksis) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-20s %-10s\n", trans.Saldo(), trans.SaldoAwal(), trans.SaldoAkhir(), trans.TanggalTransaksi(), trans.Type());
        }
    }
}

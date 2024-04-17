import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainTransaksi26 {
    ArrayList<Rekening26> rekenings = new ArrayList<>();
    Transaksi26 transaksi = new Transaksi26();
    

    public MainTransaksi26() {
        initRekening26();
    }

    public void initRekening26() {
        Rekening26 rek1 = new Rekening26("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        Rekening26 rek2 = new Rekening26("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening26 rek3 = new Rekening26("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net");
        Rekening26 rek4 = new Rekening26("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk");
        Rekening26 rek5 = new Rekening26("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk");
        rekenings.add(rek1);
        rekenings.add(rek2);
        rekenings.add(rek3);
        rekenings.add(rek4);
        rekenings.add(rek5);
    }

    public void menu() {
        Scanner sc26 = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("                UTS               ");
        System.out.println("==================================");

        while (true) {
            System.out.println("1. Tampil Data rekening");
            System.out.println("2. Tampil Data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");

            System.out.print("Pilih (1-5): ");
            String pilihan = sc26.nextLine();

            switch (pilihan) {
                case "1":
                    transaksi.tampilkanRekening(rekenings);
                    break;
                case "2":
                    transaksi.tampilkanTransaksi();
                    break;
                case "3":
                    // Mencari rekening dengan saldo > 500000
                    System.out.println("Rekening dengan saldo > 500000:");
                    for (Rekening26 rek : rekenings) {
                        if (cariSaldo(rek.getNORekening()) > 500000) {
                            System.out.printf("No Rekening: %s, Saldo: %.2f\n", rek.getNORekening(), cariSaldo(rek.getNORekening()));
                        }
                    }
                    break;
                case "4":
                    // Sorting rekening berdasarkan nama
                    Collections.sort(rekenings, new Comparator<Rekening26>() {
                        @Override
                        public int compare(Rekening26 r1, Rekening26 r2) {
                            return r1.getNama().compareTo(r2.getNama());
                        }
                    });
                    transaksi.tampilkanRekening(rekenings);
                    break;
                case "5":
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Method to find saldo by NoRekening
    private double cariSaldo(String noRekening) {
        for (Transaksi26 trans : transaksi.transaksis) {
            if (trans.NoRekening().equals(noRekening)) {
                return trans.SaldoAkhir();
            }
        }
        return 0; // Return 0 if no saldo found for the given NoRekening
    }

    public static void main(String[] args) {
        MainTransaksi26 main = new MainTransaksi26();
        main.menu();
    }
}

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class MainTransaksi26 {
    Rekening26[] rekenings = {
        new Rekening26("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"),
        new Rekening26("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
        new Rekening26("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"),
        new Rekening26("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
        new Rekening26("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk")
    };

    Transaksi26[] transaksis = {
        new Transaksi26(205420, 200162, 775880, "2021-06-25 10:23:00"),
        new Transaksi26(770592, 334245, 444267, "2020-08-11 13:36:56"),
        new Transaksi26(234301, 278309, 547922, "2021-08-24 13:18:39"),
        new Transaksi26(243306, 869468, 50283, "2021-03-12 03:40:16"),
        new Transaksi26(862731, 561908, 109431, "2021-07-31 08:11:00")
    };

    public void menu() {
        Scanner sc26 = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("                UTS               ");
        System.out.println("==================================");

        while (true) {
            System.out.println("\n1. Tampil Data rekening");
            System.out.println("2. Tampil Data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");

            System.out.print("Pilih (1-5): ");
            String pilihan = sc26.nextLine();

            switch (pilihan) {
                case "1":
                    tampilkanRekening(rekenings);
                    break;
                case "2":
                    tampilkanTransaksi(transaksis);
                    break;
                case "3":
                    cariSaldo(transaksis);
                    break;
                case "4":
                    sortingByName(rekenings);
                    break;
                case "5":
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void tampilkanRekening(Rekening26[] rekenings){
        System.out.printf("%-15s %-10s %-15s %-15s %-20s\n", "No Rekening", "Nama", "Nama Ibu", "Phone", "Email");
        for (Rekening26 rekening : rekenings) {
        System.out.printf("%-15s %-10s %-15s %-15s %-20s\n", rekening.getNoRekening(), rekening.getNama(), rekening.getNamaIbu(), rekening.getPhone(), rekening.getEmail());
        }
    }

    public static void tampilkanTransaksi(Transaksi26[] transaksis) {
        System.out.printf("%-15s %-15s %-15s %-20s\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi");
        for (Transaksi26 transaksi : transaksis) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-20s\n", transaksi.getSaldo(), transaksi.getSaldoAwal(), transaksi.getSaldoAkhir(), transaksi.getTanggalTransaksi());
        }
    }    

    public static void cariSaldo(Transaksi26[] transaksis) {
        System.out.println("Saldo lebih dari 500000:");
        for (Transaksi26 transaksi : transaksis) {
            if (transaksi.getSaldo() > 500000) {
                //System.out.printf("%-15s %-15s %-15s %-20s\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi");
                System.out.printf("%-15.2f %-15.2f %-15.2f %-20s\n", transaksi.getSaldo(), transaksi.getSaldoAwal(), transaksi.getSaldoAkhir(), transaksi.getTanggalTransaksi());
                //System.out.println();
            }
        }
    }

    public static void sortingByName(Rekening26[] rekenings) {
        Arrays.sort(rekenings, Comparator.comparing(Rekening26::getNama));
        //System.out.println("Daftar Rekening setelah diurutkan berdasarkan nama:");
        for (Rekening26 rekening : rekenings) {
            System.out.printf("%-15s %-10s %-15s %-15s %-20s\n", rekening.getNoRekening(), rekening.getNama(), rekening.getNamaIbu(), rekening.getPhone(), rekening.getEmail());
        }
    } 
    public static void main(String[] args) {
        MainTransaksi26 main = new MainTransaksi26();
        main.menu();
    }
}
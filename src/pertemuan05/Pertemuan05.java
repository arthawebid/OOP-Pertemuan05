package pertemuan05;

/**
 *
 * @author Lab E
 * tgl: 2024-04-24
 */
public class Pertemuan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dtAlamat DA = new dtAlamat(10);
        String ul = "ulang";
        do{
            System.out.println("Aplikasi Data Alamat");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Lihat Data");
            System.out.println("B. Tambah Data");
            System.out.println("C. Ubah Data");
            System.out.println("D. Hapus Data");
            System.out.println("S. Selesai");
            System.out.print("Pilih A/B/C/D/S: ");
            String mPIL = DA.dtIN.nextLine();
            switch (mPIL) {
            case "A":
                DA.ViewData();
                break;
            case "B":
                DA.StoreData();
                break;
            case "C":
                DA.UpdateData();
                break;
            case "D":
                DA.DestroyData();
                break;
            case "S":
                ul = "selesai";
                break;
            default:
                System.out.println("Pilihan tidak terdaftar");
                break;
            }
        }while( ul.equals("ulang") );
        
    }
    
}

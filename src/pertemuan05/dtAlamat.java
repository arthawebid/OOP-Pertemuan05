package pertemuan05;

import java.util.Scanner;

/**
 *
 * @author Lab E
 * tgl: 2024-04-24
 */
public class dtAlamat {
    private int jRecord = 4;
    public int aRec = 0;
    private String[][] dtBukuAlamat = new String[jRecord][3];
    Scanner dtIN = new Scanner(System.in);

    public dtAlamat(int jRek){
        jRecord = jRek;
    }
    public void StoreData(){
        int idx = aRec;
      
        if(idx >= jRecord){
            System.out.println("Tempat penyimpanan data sudah penuh");
            System.out.println("");
            return;
        }
        System.out.println("Tambah Data Alamat");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama   : ");
        dtBukuAlamat[idx][0] = dtIN.nextLine();      
        System.out.print("Alamat : ");
        dtBukuAlamat[idx][1] = dtIN.nextLine();        
        System.out.print("No Telp: ");
        dtBukuAlamat[idx][2] = dtIN.nextLine();
        aRec++;
    }
    public void UpdateData(){
        System.out.println("Ubah Data Buku Alamat");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("No Record: ");
        String tIDX = dtIN.nextLine();
        int idx = Integer.parseInt(tIDX);
        System.out.println("Data Lama");
        System.out.println("Nama    : "+dtBukuAlamat[idx][0]);
        System.out.println("Alamat  : "+dtBukuAlamat[idx][1]);
        System.out.println("No Telp : "+dtBukuAlamat[idx][2]);
        System.out.println("==>Di Ubah Menjadi");
        System.out.print("Nama    : ");
        dtBukuAlamat[idx][0] = dtIN.nextLine();
        System.out.print("Alamat  : ");
        dtBukuAlamat[idx][1] = dtIN.nextLine();
        System.out.print("No Telp : ");
        dtBukuAlamat[idx][2] = dtIN.nextLine();
        System.out.println("Data Record "+idx+" telah di ubah");
    }
    public void DestroyData(){
        String[][] tmp = new String[jRecord][3];
        
        System.out.println("Hapus Data Buku Alamat");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("No Record: ");
        String tIDX = dtIN.nextLine();
        int idx = Integer.parseInt(tIDX);
        //copy data ke tmp
        int cx = 0;
        for(int i=0; i<aRec; i++){
            
            if(i == idx){
                continue;
            }
            tmp[cx][0]=dtBukuAlamat[i][0];
            tmp[cx][1]=dtBukuAlamat[i][1];
            tmp[cx][2]=dtBukuAlamat[i][2];
            cx++;
        }
        aRec--;
        for(int i=0; i<(aRec); i++){
            dtBukuAlamat[i][0]=tmp[i][0];
            dtBukuAlamat[i][1]=tmp[i][1];
            dtBukuAlamat[i][2]=tmp[i][2];
        }
        System.out.println("Data Record ke "+tIDX+" telah di hapus");
    }
    public void ViewData(){
        System.out.println("Data Buku Alamat ("+aRec+"/"+jRecord+")");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        for(int i=0; i<aRec; i++){
            System.out.println("Data Record ke "+i);
            System.out.println("Nama        :"+dtBukuAlamat[i][0]);
            System.out.println("Alamat      :"+dtBukuAlamat[i][1]);
            System.out.println("No Telp     :"+dtBukuAlamat[i][2]);
        }
        System.out.println(" ");
        
    }
}

package Riswanda07202_modul1;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Pelayanan_KTP {
    static ArrayList <Riswanda07202_PendudukEntity> dataPenduduk = new ArrayList();
    static Scanner input = new Scanner (System.in);
public static void main(String[] args) {
    System.out.println("Selamat Datang Di Pusat Layanan Publik Kota");
    int pilihan;
    do{
        System.out.println("1. Registrasi");
        System.out.println("2. cetak");
        System.out.println("3. edit");
        System.out.println("4. delete");
        System.out.println("5. exit");
        System.out.print("pilih = ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1 :
                registrasi();
                break;
            case 2 :
                System.out.print("Nama = ");
                String nama = input.next();
                System.out.print("pass = ");
                String pass = input.next();
                cetak(nama,pass);
                break;
            case 3 :
                update();
                break;
            case 4 :
                delete();
                break;
        }
    }while(pilihan!=5);
    }
static void registrasi(){
    System.out.print("masukan nama = ");
    String nama = input.next();
    System.out.print("masukan pass = ");
    String pass = input.next();
    System.out.print("masukan tempat lahir = ");
    String tempatlahir = input.next();
    System.out.print("masukan tanggal lahir (mm/dd/yyyy)=");
    Date tanggallahir = new Date (input.next());
    System.out.print("masukan kelamin = ");
    String kelamin = input.next();
    System.out.print("masukan agama = ");
    String agama = input.next();
    System.out.print("masukan status = ");
    String status = input.next();
    System.out.print("masukan pekerjaan = ");
    String pekerjaan = input.next();
    
    dataPenduduk.add(new Riswanda07202_PendudukEntity(nama,pass,tempatlahir,kelamin,agama,
            status,pekerjaan,tanggallahir));
}
static void cetak(String nama,String pass){
    for(int i=0;i<dataPenduduk.size();i++){
    if(nama.equals(dataPenduduk.get(i).getNama())&&pass.equals(dataPenduduk.get(i).Riswanda07202_pass)){
        System.out.println("nama:"+dataPenduduk.get(i).getNama());
        System.out.println("tempatlahir:"+dataPenduduk.get(i).getTempatLahir());
        System.out.println("tanggal lahir:"+ new SimpleDateFormat("MM-dd-yyyy").format(dataPenduduk.get(i).getDate()));
        System.out.println("kelamin:"+dataPenduduk.get(i).getKelamin());
        System.out.println("agama:"+dataPenduduk.get(i).getAgama());
        System.out.println("status:"+dataPenduduk.get(i).getStatus());
        System.out.println("pekerjaan:"+dataPenduduk.get(i).getPekerjaan());
    }else{
        System.out.println("nama salah");
    }
}
}
static void update(){
    System.out.println("update data ke- ");
    int index = input.nextInt();
    System.out.print("masukan nama = ");
    String nama = input.next();
    System.out.print("masukan pass = ");
    String pass = input.next();
    System.out.print("masukan tempat lahir = ");
    String tempatlahir = input.next();
    System.out.print("masukan tanggal lahir(mm/dd/yyyy) = ");
    Date tanggallahir = new Date (input.next());
    System.out.print("masukan kelamin = ");
    String kelamin = input.next();
    System.out.print("masukan agama = ");
    String agama = input.next();
    System.out.print("masukan status = ");
    String status = input.next();
    System.out.print("masukan pekerjaan = ");
    String pekerjaan = input.next(); 
    
    dataPenduduk.set(index,new Riswanda07202_PendudukEntity(nama,pass,tempatlahir,kelamin,agama,status,pekerjaan,tanggallahir));
}
static void delete()
{
    System.out.print("nama = ");
    String nama = input.next();
    dataPenduduk.remove(cari(nama));
    System.out.println("data telah dihapus");
}
static int cari(String nama){
    int index = -1;
       for(int i=0;i<dataPenduduk.size(); i++)
       {
           if(nama.equals(dataPenduduk.get(i).getNama()))
           {
               index = i;
           }
       }
       return index;
}
}
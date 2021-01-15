package Riswanda07202_modul1;
import java.util.Date;
public class Riswanda07202_PendudukEntity {
    String  Riswanda07202_nama,Riswanda07202_tempatlahir,Riswanda07202_kelamin,
            Riswanda07202_pass,Riswanda07202_agama,Riswanda07202_status,
            Riswanda07202_pekerjaan;
    Date Riswanda07202_TanggalLahir;
    
    public Riswanda07202_PendudukEntity(String nama,String pass,String tempatlahir,
            String kelamin,String agama,String status,String pekerjaan,Date tanggallahir){
        this.Riswanda07202_nama=nama;
        this.Riswanda07202_pass=pass;    
        this.Riswanda07202_tempatlahir=tempatlahir;
        this.Riswanda07202_kelamin=kelamin;
        this.Riswanda07202_agama=agama;
        this.Riswanda07202_status=status;
        this.Riswanda07202_pekerjaan=pekerjaan;
        this.Riswanda07202_TanggalLahir=tanggallahir;
    }
    String getNama(){
        return this.Riswanda07202_nama;
    }
    String getTempatLahir(){
        return this.Riswanda07202_tempatlahir;
    }
    String getKelamin(){
        return this.Riswanda07202_kelamin;
    }
    String getAgama(){
        return this.Riswanda07202_agama;
    }
    String getStatus(){
        return this.Riswanda07202_status;
    }
    String getPekerjaan(){
        return this.Riswanda07202_pekerjaan;
    }
    Date getDate(){
        return this.Riswanda07202_TanggalLahir;
    }
}
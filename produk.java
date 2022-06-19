
import java.lang.Integer;

public class produk {
   public int id;
   public int harga;
   public String nama;
   public produk(int id,String nama, int harga){
        this.nama=nama;
        this.id=id;
        this.harga=harga;
   }
   public Integer getInteger(){
       Integer integerID= Integer.valueOf(this.id);
    return integerID;
   }





}

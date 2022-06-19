import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class mappingArrListProduk {
    public static String getNama(produk x){
        return x.nama;
    }
    public static void main(String[] args) {
        ArrayList<produk> listProduk=new ArrayList<>();
        ArrayList<ArrayList<Object>> listProdukJumlah=new ArrayList<>();
        listProduk.add(daftarProduk.listedProduct().find(1));
        listProduk.add(daftarProduk.listedProduct().find(1));
        listProduk.add(daftarProduk.listedProduct().find(1));
        listProduk.add(daftarProduk.listedProduct().find(2));
        listProduk.add(daftarProduk.listedProduct().find(2));
        listProduk.add(daftarProduk.listedProduct().find(3));


        Map<produk,Integer> mapedProduk=new HashMap<>();
        for(produk i:listProduk){
            if(mapedProduk.containsKey(i)){
                mapedProduk.put(i, mapedProduk.get(i)+1);
            }
            else{
                mapedProduk.put(i,1);
            }

        }

        for(produk m:mapedProduk.keySet()){
            listProdukJumlah.add(new ArrayList<>(List.of(m,mapedProduk.get(m))));
        }

        System.out.println(getNama((produk) listProdukJumlah.get(0).get(0))+" "+listProdukJumlah.get(0).get(1));
        System.out.println(getNama((produk) listProdukJumlah.get(1).get(0))+" "+listProdukJumlah.get(1).get(1));
        System.out.println(getNama((produk)listProdukJumlah.get(2).get(0))+" "+listProdukJumlah.get(2).get(1));
        System.out.println(listProdukJumlah.size());


    }
}

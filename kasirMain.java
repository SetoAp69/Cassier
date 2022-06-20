import java.util.*;

public class kasirMain {
    public static Scanner input=new Scanner(System.in);

    public static String getNama(produk x){
        return x.nama;
    }

    public static int getHarga(produk x){
        return x.harga;
    }

    public static void tambahKeStruk(linkedList llist,ArrayList<produk> struk,int id,int jumlah ){
        for(int i=0;i<jumlah;i++){
            struk.add(llist.find(id));
        }
    }

    public static String printStruk(int id,int nama, int harga,int jumlah,int jumlahHarga){
        String printedProduk="";

        return printedProduk;
    }

    public static int totalHarga(ArrayList<ArrayList<Object>> arList, int arrLength){
        int harTotal = 0;
        if(arrLength<=0){
            return 0;
        }
        return (totalHarga(arList,arrLength-1)+ ((Integer) arList.get(arrLength-1).get(1)*getHarga((produk) arList.get(arrLength-1).get(0))));
    }

    public static ArrayList<ArrayList<Object>> mapProduk(ArrayList<produk>list){
        Map<produk,Integer> mapedProduk=new HashMap<>();
        ArrayList<ArrayList<Object>> listProdukDanJumlah=new ArrayList<>();
        for(produk i:list){
            if(mapedProduk.containsKey(i)){
                mapedProduk.put(i, mapedProduk.get(i)+1);
            }
            else{
                mapedProduk.put(i,1);
            }
        }

        for (produk m:mapedProduk.keySet()){
            listProdukDanJumlah.add(new ArrayList<>(List.of(m,mapedProduk.get(m))));
        }
        return listProdukDanJumlah;

    }


    public static void main(String[] args) {
        ArrayList<produk> strukBelanja=new ArrayList<>();
        //Buat Arraylist strukbelanja 2d dengan isi { {produk, jumlah}, {produk, jumlah}}

        int id=0;
        int jumlah=0;
        System.out.println("-------Kasir Toko X ---------");
        while(true){
            System.out.println("1. Tambah Barang");
            System.out.println("2. Cetak Struk");
            System.out.println("3. Keluar");
            int choice= input.nextInt();
            if(choice==1){
                System.out.println("Masukan id : ");
                id=input.nextInt();
                System.out.println("Masukan Jumlah : ");
                jumlah= input.nextInt();
                tambahKeStruk(daftarProduk.listedProduct(),strukBelanja,id,jumlah);


            }
            else if(choice==2){
                int jumlahHarga=0;
                ArrayList<ArrayList<Object>> strukDanJumlah =mapProduk(strukBelanja);
                for(int i=0;i<strukDanJumlah.size();i++){
                    jumlahHarga=((produk)strukDanJumlah.get(i).get(0)).harga*(int) strukDanJumlah.get(i).get(1);
                    System.out.println(getNama((produk) strukDanJumlah.get(i).get(0))+" "+strukDanJumlah.get(i).get(1)+" "+jumlahHarga);

                }
                System.out.println(totalHarga(strukDanJumlah,strukDanJumlah.size()));

            }

        }

    }
}

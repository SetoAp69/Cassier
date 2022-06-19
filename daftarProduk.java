public class daftarProduk {
    public static linkedList list=new linkedList();
    public static linkedList listedProduct(){
        list.add(new produk(1,"Mie",2000));
        list.add(new produk(2,"Telur",1500));
        list.add(new produk(3,"Sauce",1000));
        list.add(new produk(1,"Kecap",2500));
        list.add(new produk(1,"Oreo",1500));

        return list;
    }
}

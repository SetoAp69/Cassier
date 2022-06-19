import java.util.ArrayList;

public class nyoba {
    public int hitungJumlah(ArrayList<Integer> ArList, int key){
        int jumlah=0;
        for(int i=0;i< ArList.size();i++){
            if(ArList.get(i)==key){
                jumlah++;
            }
        }

        return jumlah;
    }
    public static void printStruk(int id, String nama, int Harga,int jumlah, int HarTotal){


    }
    public static void main(String[] args) {
        ArrayList<Integer> x =new ArrayList<>();
        ArrayList<ArrayList<Object>> w = new ArrayList<>();
        w.add(new ArrayList<>());
        w.get(0).add(1);
        w.get(0).add("a");
        System.out.println(w.get(0).get(0) +" "+w.get(0).get(1) );
        x.add(1);
        x.add(1);
        x.add(2);
        x.add(4);
        x.add(4);
        x.add(4);


        int count=0;
        for(int i=0;i< x.size();i++){
            if(x.get(i)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}

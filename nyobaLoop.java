import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class nyobaLoop {
    public static void main(String[] args) {
        int item=0;
        int jumlah=0;
        ArrayList<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(1);
        x.add(2);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(5);
        x.add(5);
        /*for(int i=0;i<x.size();i++){
            if(x.get(i)==x.get(i+1)){
                item++;
            }
            if(x.get(i)!=x.get(i+1)){
                item=0;
            }

        }*/
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:x){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int sum=0;
        for(int amount: map.values()){
            System.out.println(amount);
        }
        System.out.println("");
        for(int key: map.keySet()){
            System.out.println(key);
        }
    }
}

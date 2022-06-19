import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String y ="go seattle";
        String x []={"go","seattle"};
        String hasil= Arrays.stream(x).map(n->n.substring(1,n.length())+"x"+n.substring(0,1)+"oy").reduce("",(a,b)->a+" "+b).trim();
        System.out.print(hasil);
        int i=1;
        while(i<=10){
            System.out.print(i);
            i++;
        }

    }
}

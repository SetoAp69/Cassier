import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("Ubuntu");
        while(true){
            System.out.println("Input : ");
            Scanner input=new Scanner(System.in);
            String num=input.next();
            if(num.equals("0")){
                break;
            }
            System.out.println(num);
        }
    }
}

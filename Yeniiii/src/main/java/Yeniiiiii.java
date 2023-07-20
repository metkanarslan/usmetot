import java.util.Scanner;
public class Yeniiiiii {
    static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Giriniz: ");
        a = inp.nextInt();
        System.out.print("Üs Giriniz: ");
        b = inp.nextInt();
        System.out.println(power(a,b));

    }
    }

//    247 742

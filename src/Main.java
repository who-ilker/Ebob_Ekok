import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int n1 = 18, n2 = 24;
        int ebob = 0, ekok = 0;

        for(int i=1; i <= n1; i++){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        System.out.println("Ebob("+n1+","+n2+"): "+ebob);

        int n3 = 6, n4 = 8;
        for(int i=1; i <= n1 * n2; i++){
            if (i % n3 == 0 && i % n4 == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok("+n3+","+n4+"): "+ekok);






    }
}
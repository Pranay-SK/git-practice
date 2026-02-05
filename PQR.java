import java.util.*;
public class PQR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of p:");
        int p=sc.nextInt(); 
        System.out.println("Enter the value of q:");
        int q=sc.nextInt();
        int r=p-q;
        int z=p*q;
        System.out.println(r); 
        System.out.println(z);       
    }
}
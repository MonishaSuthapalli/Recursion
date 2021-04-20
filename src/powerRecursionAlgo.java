import java.io.*;
import java.util.*;

public class powerRecursionAlgo {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(power(x,n));
    }

    public static int power(int x, int n){

        if(n==0)
            return 1;
        int xpowernby2=power(x,n/2);
        int res=xpowernby2*xpowernby2;
        if(n%2==1)
            res=x*res;

        return res;
    }

}
import java.io.*;
import java.util.*;

public class firstIndexFind {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x=sc.nextInt();
        firstIndex(arr,0,x);
    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(arr[idx]==x)
            return idx;

        if(idx==n-1&&arr[idx]!=x)
            return -1;

        firstIndex(arr,idx+1,x);



        return 0;
    }

}
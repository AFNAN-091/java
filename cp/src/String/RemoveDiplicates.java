package String;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDiplicates {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = cin.nextInt();
        }

        ArrayList<Integer>ans = new ArrayList<>();


      out:   for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    continue out;
                }

            }
            ans.add(arr[i]);

        }

       System.out.println(ans.size());
       for(int i:ans)
       {
           System.out.println(i+" ");
       }

    }

}

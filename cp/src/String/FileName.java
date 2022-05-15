package String;

import java.util.Arrays;
import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        char[] line;
        n = cin.nextInt();
        line = cin.next().toCharArray();

        int cnt =0;
        int pre =0;
        for(char ch: line)
        {
            if(ch=='x')
            {
                if(++pre>=3)
                {
                    cnt++;
                }
            }
            else
            {
                pre = 0;
            }
        }

       System.out.println(cnt);

    }
}

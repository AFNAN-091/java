import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] brr = new int[5];
		brr[0] = sc.nextInt();
		arr.add(10);
		arr.add(48);
		arr.add(47);
		arr.add(2);
		
		//brr[0] = 40;
		brr[1] = 1;
		brr[2] = 56;
		brr[3] = 39;
		brr[4] = 87;
		System.out.println(brr[0]);
		System.out.println(brr.length);
		Arrays.sort(brr);
		System.out.println(brr[1]);
		System.out.println(arr);
		
		System.out.println();
		System.out.println("size = "+ arr.size());
		arr.remove(0);
		System.out.println("size = "+arr.size());
		System.out.println(arr);
		//arr.removeAll(arr);
		System.out.println("size = "+arr.size());
		System.out.println(arr);
		Collections.sort(arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("sort "+ arr);
		sc.close();
		 
	}
}

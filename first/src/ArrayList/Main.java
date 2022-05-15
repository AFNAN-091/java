package ArrayList;
import java.util.ArrayList;;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>(5);
		array.add(58);
		array.add(34);
		array.add(67);
		
		for(Integer it:array)
			System.out.println(it);
		array.trimToSize();
		System.out.println();
		array.set(0, 300);
		//array.remove(0);
		for(Integer it:array)
			System.out.println(it);
	}

}

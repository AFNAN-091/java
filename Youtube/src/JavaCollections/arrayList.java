package JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        //num.
        num.add(38);
        num.add(49);
        num.add(48);
        num.add(32);
        num.add(28);
         System.out.println(num);

  //       Iterator it = num.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next());
//         }


//        int val = num.get(0);
//        System.out.println(val);
//        num.remove(2);
//        System.out.println(num);
//        System.out.println(num.size());

        num.set(2,34);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        ArrayList numbername = new ArrayList();
        numbername.addAll(num);
        numbername.add("AFnan");
        System.out.println(numbername);




    }
}

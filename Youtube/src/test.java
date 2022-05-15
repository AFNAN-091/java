import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.lang.Math;
public class test {

   // int data = 40; // instance variable
  //  static int val = 29; // static variable
    public static void main(String[] args) {
    /*    //System.out.println(val);
        int value = 59; // local variable
        System.out.println("local " + value);
        test obj = new test();
        System.out.println("static "+ val);
        System.out.println("instance "+ obj.data);
        System.out.println("AFnaN");
        byte  number = 10;
        byte  number2 = 40;
        byte ans = (byte) (number+number2);
        System.out.println(ans);
        System.out.println();
        int num = 10;
        byte num1 = (byte) num;
        System.out.println(num1);

//        left shift operator
        System.out.println(10 >> 2 ); // 10* 2^2 = 40
        System.out.println(20 >> 3); // 20 * 2^3 = 20*8 = 160
        //right shift operator
        System.out.println(10>>2); // 10/ 2^2 = 10/4 = 2
        System.out.println(10>>4); // 10/ 2^4 = 10/16 = 0
        System.out.println(-10>>6); // -10/ 2^4 = -10/16 = 0 */

//        Scanner input = new Scanner(System.in);
//        String name ;
//        name = input.next();
//        System.out.println(name);
//        name = input.nextLine();
//        System.out.println(name);
//        string build in funtion compare(), concat(), equals(),split(),
        // length(), repalce(),compareto(),intern(),substring()
//
        String name = "Afnan";
         String name2 = "AFnaN";
//        System.out.println(name.equals(name2));
//
//        String first_name = "Saied";
//        name = first_name.concat(name);
//        System.out.println(name);
        String s1 = "This is";
        String s2 = "magic";
        String sentence = s1.concat(" ").concat(name2).concat(" ").concat(s2);
//        System.out.println(sentence);
        //boolean flag = name.equalsIgnoreCase(name2);
      //  System.out.println(flag);

//        String[] word = sentence.split("\\s",3);
//        for (String s: word) {
//            System.out.println(s);
//        }
        System.out.println(sentence.indexOf("is",3));

    }
}

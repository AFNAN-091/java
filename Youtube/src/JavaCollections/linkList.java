package JavaCollections;

import java.util.LinkedList;

public class linkList {
    public static void main(String[] args) {
        LinkedList<Integer>link = new LinkedList<Integer>();
        link.add(83);
        link.add(48);
        link.add(42);
        link.add(1);
        link.add(34);
        System.out.println(link);
        // add at position

        link.add(0,93);
        System.out.println(link);
        link.addFirst(32);
        System.out.println(link);
        link.addLast(90);
        System.out.println(link);
        link.remove(4);
        System.out.println(link);
        link.remove(32);

    }
}

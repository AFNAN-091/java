package JavaCollections;

public class JavaArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 29;
        num[1] = 39;
        num[2] = 98;
//        for(int i:num)
//        {
//            System.out.println(i);
//        }
        //Array clone
        int newarr[] = num.clone();

//        for(int i:newarr)
//        {
//            System.out.println(i);
//        }

        /// Array copy
        int cpy[] = new int [5];
        System.arraycopy(num,0,cpy,0,5);
        for(int i:cpy)
        {
            System.out.println(i);
        }
     }
}

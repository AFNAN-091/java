package Array;

public class Main {
    public static void main(String[] args) {
        //JaggedArray arr = new JaggedArray();
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[4];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = cnt++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

}

package TrenLop;

public class Array {
    public static void main(String[] args) {
        //khai bao mang
        int[] arr = new int[4];
        int integers[] = new int[4];

        //duyet mang
        //cach 1
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
            System.out.println(integers[i]);
        }
//cach 2
        for (int element : integers
        ) {
            System.out.println(element);
        }

        //cach 3
        int n = integers.length - 1;
        while (n >= 0) {
            System.out.println(integers[integers[n]]);
            n--;
        }
    }
}

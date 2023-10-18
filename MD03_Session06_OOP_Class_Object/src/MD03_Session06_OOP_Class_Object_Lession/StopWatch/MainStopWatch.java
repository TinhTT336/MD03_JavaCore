package MD03_Session06_OOP_Class_Object_Lession.StopWatch;

import java.util.Arrays;

public class MainStopWatch {
    public static void main(String[] args) {
//        Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.

        StopWatch stopWatch = new StopWatch();
        //khai bao va khoi tao mang 100000 so bang phương thức generateNumbers()
        int[] numbers = generateNumbers(100000);

        //gọi phương thức selectionSort() để sắp xếp mảng numbers theo thuật toán sắp xếp chọn.
        selectionSort(numbers);

        //gọi phương thức stop() của đối tượng stopwatch để thiết lập endTime của nó với thời gian hiện tại của hệ thống.
        stopWatch.stop();

        //gọi phương thức getElapsedTime() để lấy thời gian đã trôi qua giữa startTime và endTime của đối tượng stopwatch
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Thoi gian thuc thi: " + elapsedTime + "ms");
    }

    //phuong thuc generateNumbers de tao mang
    public static int[] generateNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    //phuong thuc selectionSort de sap xep mang
    public static void selectionSort(int[] arr) {
        //cach 1
//        for (int i = 0; i < arr.length-1; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp=arr[minIndex];
//            arr[minIndex]=arr[i];
//            arr[i]=temp;

        //cach 2:
        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i; j < arr.length-1-i; j++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
        }


        }
    }
}

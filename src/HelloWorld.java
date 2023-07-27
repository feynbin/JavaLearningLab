/**
 * @name: hello-world
 * @author: feynb
 * @date: 2023-07-10 18:24
 * @description: my first java class
 **/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 9 + 90 * 2 + 302 * 3;
        System.out.println(a);
        //调用函数
        int b = sum(1, 2);
        System.out.println(b);
        //生成一个数组
        int[] arr = generateArray(10);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        //快速排序
        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //打印数组
        System.out.println();

    }
    //写一个统计函数
    public static int sum(int a, int b) {
        return a + b;
    }
    //生成一个数组
    public static int[] generateArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = i;
        }
        //打乱数组
        for (int i = 0; i < n; i ++) {
            int rand = (int) (Math.random() * n);
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        return arr;
    }
    //写一个快速排序并打印数组
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int i = left, j = right, temp = arr[left];
        while (i < j) {
            while (i < j && arr[j] >= temp) j --;
            if (i < j) arr[i ++] = arr[j];
            while (i < j && arr[i] <= temp) i ++;
            if (i < j) arr[j --] = arr[i];
        }
        arr[i] = temp;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
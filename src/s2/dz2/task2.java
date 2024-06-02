package s2.dz2;

/**
 *  Написать функцию, возвращающую разницу между самым большим
 *  и самым маленьким элементами переданного не пустого массива.
 */

public class task2 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,3,4};
        int[] arr2 = {2,2,0};
        int[] arr3 = {1,3,5};

        System.out.println(diffMaxAndMin(arr1));
        System.out.println(diffMaxAndMin(arr2));
        System.out.println(diffMaxAndMin(arr3));

    }

    public static int diffMaxAndMin(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(min + " " + max);

        return max-min;
    }
}

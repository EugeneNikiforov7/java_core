package s2.dz2;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве
 * есть два соседних элемента, с нулевым значением.
 */
public class task3 {

    public static void main(String[] args) {
        int[] arr1 = {2,1,0,2,3,4};
        int[] arr2 = {2,2,0,0};
        int[] arr3 = {1,3,0,5,0};

        System.out.println(func(arr1));
        System.out.println(func(arr2));
        System.out.println(func(arr3));

    }

    public static boolean func(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                if (arr[i+1] == 0) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}

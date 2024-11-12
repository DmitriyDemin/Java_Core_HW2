import java.beans.Introspector;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 0, 0};
        System.out.println(ReturnCountEvent(arr));
        System.out.println(ReturnDifferentMinMax(arr));
        System.out.println(IsTrue(arr));

    }
    /*
    * Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    * countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0*/
    public static int ReturnCountEvent(int[] inputArr){
        int countEvent = 0;
        for (int element: inputArr){
            if (element%2 == 0) countEvent++;
        }
        return countEvent;
    }

    /*
    * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.*/
    public static int ReturnDifferentMinMax (int [] inputArr){
        int differentMinMax = 0;
        int min = inputArr[0];
        int max = inputArr[0];
        for (int i = 0; i < inputArr.length; i++){
            if (max < min) min = max;
            if (inputArr[i] > max) max = inputArr[i];
        }
        differentMinMax = max - min;
        return differentMinMax;
    }

    /*
    * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    * */

    public static boolean IsTrue (int [] inputArr){
        boolean flag = false;
        for (int i = 0; i < inputArr.length-1; i++){
            if (inputArr[i] == 0 & inputArr[i+1] ==0)
                flag = true;
        }

        return flag;
    }

}

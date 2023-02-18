import java.util.Arrays;

public class CountDigits {

    public static int countAndReduce(int[] arr) {
        while (arr.length > 1) {
            int[] counts = new int[10];
            for (int num : arr) {
                counts[num]++;
            }
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = counts[arr[i]];
            }
            arr = newArr;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        // example usage
        int[] arr1 = {3, 7, 5};
        int[] arr2 = {0, 4, 6, 6, 6, 8, 8, 7};
        int[] arr3 = {1, 1, 3, 2, 1};
        System.out.println(countAndReduce(arr1)); // should output 1
        System.out.println(countAndReduce(arr2)); // should output 1
        System.out.println(countAndReduce(arr3)); // should output 1
    }

    // unit tests
    @org.junit.Test
    public void test1() {
        int[] arr = {3, 7, 5};
        assert countAndReduce(arr) == 1;
    }

    @org.junit.Test
    public void test2() {
        int[] arr = {0, 4, 6, 6, 6, 8, 8, 7};
        assert countAndReduce(arr) == 1;
    }

    @org.junit.Test
    public void test3() {
        int[] arr = {1, 1, 3, 2, 1};
        assert countAndReduce(arr) == 1;
    }

    @org.junit.Test
    public void test4() {
        int[] arr = {1, 1, 1};
        assert countAndReduce(arr) == 3;
    }

    @org.junit.Test
    public void test5() {
        int[] arr = {4, 3, 2, 1};
        assert countAndReduce(arr) == 4;
    }
}

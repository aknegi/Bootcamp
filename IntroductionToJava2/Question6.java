class LargestElement {
    int largestEle(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Question6 {
    public static void main(String[] args) {
        LargestElement le = new LargestElement();
        try {
            int arr2[] = {23, 45, 44, 244, 8, 7, 666, 75};
            int max = le.largestEle(arr2);
            System.out.println(max);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception caught");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught");
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative Array Size exception caught");
        } catch (Exception e) {
            System.out.println("There is some Exception please check");
        } finally {
            System.out.println("this is the example of finally block," +
                    "multiple catch blocks with try block");
        }
    }
}

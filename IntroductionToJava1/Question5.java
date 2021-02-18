import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,4,5,1,9,9};
        int[] arr2 = new int[]{1,15,9,17,9,3};

        System.out.println("array 1 elements");
        for(int i=0;i<arr1.length;i++)
            System.out.print( arr1[i]+" ");
        System.out.println();

        System.out.println("array 2 elements");
        for(int i=0;i<arr2.length;i++)
            System.out.print( arr2[i] +" ");
        System.out.println();

        Set<Integer> commonSet =new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            commonSet.add(arr1[i]);

        System.out.println("Common elements:");
        for(int i=0;i<arr2.length;i++)
            if(commonSet.contains(arr2[i]))
            {
                System.out.print(arr2[i] +" ");
                commonSet.remove(arr2[i]);
            }
    }

     /*https://www.udemy.com/course/functional-programming-with-java/
    username: nikhil.mittal@tothenew.com/igdefault
    or username: manoj.mohan@tothenew.com/igefault
    Nikhil Mittal11:12 AM
    abhinav.srivastava@tothenew.com/igdefault
*/
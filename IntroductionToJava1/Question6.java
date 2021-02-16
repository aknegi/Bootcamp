public class Question6 {
    public static void main(String[] args) {
        int[] twiceElementArray = {3,1,1,3,7,2,5,2,7};
        int result = twiceElementArray[0];
        for (int i = 1 ; i < twiceElementArray.length ; i++){
            result= result^twiceElementArray[i];
        }
        System.out.println("Odd Occuring Element is " + result);
    }
}

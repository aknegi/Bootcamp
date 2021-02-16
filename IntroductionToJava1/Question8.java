public class Question8   {
     static void revAndremove(String input){
         char[] arr = input.toCharArray();
         StringBuffer stringb = new StringBuffer();
         int i=0;
         for ( i=arr.length - 1 ; i > -1; i--) {
             stringb.append(arr[i] + " ");
         }
         stringb = stringb.replace(8,17,"");
         String s = stringb.toString();
         System.out.println(s);
     }
    public static void main(String[] args)
    {
        String input = "abcdefghijklmnopqrstuvwxyz";
        revAndremove(input);
    }
}

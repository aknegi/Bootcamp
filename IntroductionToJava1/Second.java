public class Second {
    public static void main(String[] args) {
        String givenString = "Big blaCk buG bit a big blaCk dog on his biG Black nose";
        givenString = givenString.toLowerCase();
        String[] words = givenString.split(" ");
        for (int current = 0 ; current < words.length ; current++){
            int count = 1;
            for(int next = current+1 ; next < words.length ; next++){
                if( words[current].equals(words[next]) ) {
                    count++;
                    words[next] = "0";
                }
            }
            if(count > 1 && words[current] != "0")
                System.out.println("count of " + words[current] + "=" + count);
        }
    }
}
public class Third {
    public static void main(String[] args)
    {
        String givenString = "java is a language and java is java";
        int count = givenString.length() - givenString.replace("a", "").length();
        System.out.println("occurence of 'a' char in '"+givenString+"' is = "+count);
    }
}


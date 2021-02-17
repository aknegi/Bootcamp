
class agenotvalidexception extends Exception {
    public agenotvalidexception(String message) {
        super(message);
    }
}

public class Question13 {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18)
                throw new agenotvalidexception("Exception: your age is not valid");
            else
                System.out.println("proceed");
        } catch (agenotvalidexception e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
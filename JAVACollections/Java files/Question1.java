import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> floatElementsList = new ArrayList<>();
        floatElementsList.add(3.5f);
        floatElementsList.add(5.2f);
        floatElementsList.add(9.2f);
        floatElementsList.add(8.1f);
        floatElementsList.add(4.6f);

        Iterator<Float> iterable = floatElementsList.iterator();
        float sum = 0;

        while (iterable.hasNext()) {
            sum = sum + iterable.next();
        }
        System.out.println("The sum of the elements is = " + sum);
    }
}

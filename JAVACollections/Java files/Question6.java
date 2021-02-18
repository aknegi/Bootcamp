import java.util.*;

public class Question6 {
    static void sortArrayElementsByFrequency(int[] inputArray) {
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (elementCountMap.containsKey(inputArray[i])) {
                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i]) + 1);
            } else {
                elementCountMap.put(inputArray[i], 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());
        Collections.sort(listOfEntry, new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }
        );
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
        System.out.print("[ ");

        for (Map.Entry<Integer, Integer> entry : listOfEntry) {
            int frequency = entry.getValue();
            while (frequency >= 1) {
                System.out.print(entry.getKey() + " ");
                frequency--;
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        sortArrayElementsByFrequency(new int[]{7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
    }
}

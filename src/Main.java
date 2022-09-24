import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 8, -4, 6, 7));
        List<String> words = new ArrayList<>(List.of("Book", "even", "Book", "string", "Sun", "notebook", "Sun"));
        System.out.println(outputsOddNumbers(nums));
        System.out.println(outputsEvenNumbers(nums));
        System.out.println(outputsUniqueWords(words));
        System.out.println(outputsNumberOfTakes(words));

    }

    public static List<Integer> outputsOddNumbers(List<Integer> integerList) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer integer : integerList) {
            if (integer % 2 == 1) {
                oddNumbers.add(integer);
            }
        }
        return oddNumbers;
    }

    public static List<Integer> outputsEvenNumbers(List<Integer> integerList) {
        Set<Integer> evenNumbersSet = new HashSet<>();
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                evenNumbersSet.add(integer);
            }
        }
        List<Integer> evenNumbersList = new ArrayList<>(evenNumbersSet);
        Collections.sort(evenNumbersList);
        return evenNumbersList;
    }

    public static Set<String> outputsUniqueWords(List<String> words) {
        return new HashSet<>(words);
    }

    public static HashMap<String, Integer> outputsNumberOfTakes(List<String> words) {
        HashMap<String, Integer> numbersOfTakes = new HashMap<>();
        for (String word : words) {
            if (numbersOfTakes.containsKey(word)) {
                int take = numbersOfTakes.get(word);
                numbersOfTakes.put(word, take + 1);
            } else {
                numbersOfTakes.put(word, 1);
            }
        }
        return numbersOfTakes;
    }


}
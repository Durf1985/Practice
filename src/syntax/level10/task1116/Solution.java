package syntax.level10.task1116;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов.
Нужно подсчитать сколько раз каждое слово встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово,
а второй - число, сколько раз данное слово встречалось в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.

Требования:
•	Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
•	Метод countWords должен возвращать созданный словарь.
•	Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам,
 отображающие сколько раз встречалось слово.
•	Программа должна выводить на экран полученный словарь.
•	Метод main должен вызывать метод countWords.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        ArrayList<String> words = new ArrayList<String>();
//        for (int i = 0; i < 20; i++) {
//            words.add(reader.readLine());
//        }
        ArrayList<String> words = new ArrayList<>();
        words.add("Машина");
        words.add("Перерыв");
        words.add("Скакун");
        words.add("Телефон");
        words.add("Игра");
        words.add("пророк");
        words.add("Яблоко");
        words.add("платок");
        words.add("дерево");
        words.add("уксус");
        words.add("уксус");
        words.add("Игра");
        words.add("пророк");
        words.add("Яблоко");
        words.add("пророк");
        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.get(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            result.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        // for (String x : list) {
        //            Integer count = result.get(x);
        // хм, вроде сам написал подобный способ, не похоже на чужой код.
        //            if (count == null) {
        //                count = 0;
        //            }
        //            result.put(x, count + 1);
        //        }


        return result;
    }

}

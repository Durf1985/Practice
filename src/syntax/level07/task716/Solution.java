package syntax.level07.task716;

import java.util.ArrayList;

/*
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод fix должен удалять из списка строк все слова, содержащие букву "р". И
сключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
•	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент
 с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
•	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
•	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            boolean add2word = false;
            boolean del = false;
            char[] set = strings.get(i).toCharArray();
            for (int j = 0; j < set.length; j++) {
                if (set[j] == 'р') del = true;
                else if (set[j] == 'л') add2word = true;
                if (del && add2word) {
                    break;
                }
            }
            if (del && add2word) {
                result.add(0, strings.get(i));
            } else if (add2word) {
                result.add(0, strings.get(i));
                result.add(0, strings.get(i));
            }
        }

        return result;
    }

}
// а вот тут прошлый раз я решил с помощью библиотек и не выдумывал велосипед
/*public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String ar = list.get(i);
            if (ar.contains("р") && ar.contains("л")) result.add(ar);
            else if (ar.contains("р")) {
            } else if (ar.contains("л")) {
                result.add(ar);
                result.add(ar);
            }

            else result.add(ar);
        }
        return result;
    }*/

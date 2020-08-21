package Core.level5.task1227;

/*
Порядок загрузки переменных
Разберись, что и в какой последовательности инициализируется. Поставь брейкпойнты и используй дебаггер.

Исправить порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name

Требования:
•	Программа должна выводить данные на экран.
•	Вывод на экран должен соответствовать условию задачи.
•	Результатом работы статического инициализатора класса Solution должен быть вывод на экран строк
"static void init()" и "Static block".
•	Программа не должна считывать данные с клавиатуры.
*/

public class Solution {
    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    public int i;

    public String name;

    { // возможно создавать не статичный блок, интересно зачем?
        System.out.println("Non-static block");
        printAllFields(this);
        this.i = 6;
        this.name = "First name";
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}

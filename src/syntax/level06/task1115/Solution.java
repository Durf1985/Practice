package syntax.level06.task1115;

/*
Феншуй и статики
Переставь один модификатор static, чтобы пример скомпилировался.

Требования:
•	Метод main менять нельзя.
•	Добавь модификатор static в нужное место.
•	Убери лишний модификатор static.
•	В программе должно быть только 2 модификатора static.
*/

public class Solution {

    static public int A = 5; // тут добавил, чтобы метод main мог обратиться к переменной
    public int B = 2;
    public int C = A * B;//тут убрал, чтобы можно было обратиться к B
    // вообще забавно, только сейчас обратил внимание, что можно из не статичного примитива обратиться к статичному примитиву
    // но наоборот нельзя.

    public static void main(String[] args) {
        A = 15;
    }
}

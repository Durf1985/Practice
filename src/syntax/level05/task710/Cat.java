package syntax.level05.task710;

/*
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
•	У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.

*/

public class Cat {
    String name;
    int age;
    int weight;
    String adress;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 10;
        this.weight = 1;
        this.color = "asdf";
        this.adress = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "asdf";
        this.adress = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "asdf";
        this.adress = null;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.adress = null;
    }

    public void initialize(int weight, String color, String adress) {
        this.name = null;
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    public static void main(String[] args) {

    }
}



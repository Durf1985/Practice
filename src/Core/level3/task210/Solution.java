package Core.level3.task210;

/*
Это кто там такой умный? ... походу это задание изменили, потому что оно вообще не соответствует решению, которое у меня
1. Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на каждый. Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential так,
чтобы все методы у классов Manager и Subordinate оказались объявленными в каком-то интерфейсе.

Требования:
•	Класс Manager должен реализовывать подходящий ему интерфейс(Secretary или Boss).
•	Класс Subordinate должен реализовывать подходящий ему интерфейс(Secretary или Boss).
•	Секретарь(Secretary) является человеком(Person).
•	Начальник(Boss) является человеком(Person), который может заставить других усердно работать(HasManagementPotential).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        CleverMan cm = new Solution().new CleverMan();
        cm.startToWork();
        Person person = new Solution().new CleverMan();
        person.startToWork();
        cm.use(person);
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, Workable {
    }

    class CleverMan implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
            System.out.println("asdf");
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}

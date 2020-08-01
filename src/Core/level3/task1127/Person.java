package Core.level3.task1127;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    } // этот метод необходимо реализовать из-за интерфейса

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(this.getName() + " за " + person.getNamePadezh());
        //вообще можно и без this, но так наглядней, какого объекта вызывается метод, так же здесь вызывается метод интерфейса
    }

}

/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Dog {
    public static void main(String[] args) {

        Dog Sharik = new Dog("Шарик", 10);
        System.out.println("Пес "+Sharik.getName());
        System.out.println("Ему "+Sharik.getAge()+" лет");

    }
}
class Dog{
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setName (String name){}
    void setAge (int age){}
    public String getName() {
        return this.name;    }
    public int getAge() {
        return this.age;    }
}

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

        N Sharik = new N("Шарик", 10);

                System.out.println("Кличка собаки: " + Sharik.getName()+" Ему " + Sharik.getAge() + " лет");
    }
}
class N{
    private String name;
    private int age;

    public N(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
        }

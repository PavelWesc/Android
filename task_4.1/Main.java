/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Cate {
    public int age;
    public int weight;
    public int strength;

    public Cate() {
    }

    public boolean fight(Cate anotherCat) {
        int win = 0;

        if (this.age > anotherCat.age) {
            win++;} else win--;

        if (this.weight > anotherCat.weight) {
            win++;
        }else win--;
        if (this.strength > anotherCat.strength) {
            win++;
        }else win--;
        if (win > 0) {
        return true;
    }else return false;
    }

    public static void main(String[] args) {
        Cate cat1 = new Cate();
        cat1.age = 5;
        cat1.weight = 9;
        cat1.strength = 1;

        Cate cat2 = new Cate();
        cat2.age = 4;
        cat2.weight = 4;
        cat2.strength = 6;

        cat1.fight(cat2);
        cat2.fight(cat1);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));






    }
}

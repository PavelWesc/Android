/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
public abstract class Animal {


    boolean vegetarian;
    String speak;
    byte paws;
    public Animal(boolean veg, String speak, byte paws){
        this.vegetarian = veg;
        this.speak = speak;
        this.paws = paws;
    }
    boolean getVegetarian () {return this.vegetarian;}
    String getSpeak () {return this.speak;}
    byte getPaws () {return this.paws;}

    void eat(){
        System.out.println("Я кушаю");
    }

}

public class Horse extends Animal {
    String breed;
    String color;

    public Horse(boolean veg, String speak, byte paws, String breed, String color) {
        super(veg, speak, paws);
        this.breed = breed;
        this.color = color;
    }
    void run() {
        System.out.println(speak+ "Я поскакал");
    }


}

public class Pegas extends Horse {
    public Pegas (boolean veg, String speak, byte paws, String breed, String color){
        super(veg, speak, paws, breed, color);
    }
    void fly (){
        System.out.println(speak+ "Я полетел");
    }

}



public class Main {
    public static void main (String [] args){
        Horse mustang = new Horse (true, "Ржет",  (byte)4, "Рысак", "Черный");
        Pegas ares = new Pegas(true, "Ржет",  (byte)4, "Рысак", "Черный");
        ares.fly();
        mustang.run();
        }
        }

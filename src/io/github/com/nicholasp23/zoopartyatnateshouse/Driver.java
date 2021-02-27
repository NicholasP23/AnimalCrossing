package io.github.com.nicholasp23.zoopartyatnateshouse;

public class Driver {

    public static void main(String[] args){
        Animal[] animals = new Animal[4];

        animals[0] = new Sparklemuffin();
        animals[1] = new NakedMoleRat();
        animals[2] = new TasmanianDevil();
        animals[3] = new VampireBat();

        for(Animal zoo : animals){
            System.out.println("Name of animal: " + zoo.getName() + " and the noice it makes is- ");
            zoo.speak();
            System.out.println("");
        }
    }

}

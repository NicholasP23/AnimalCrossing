package io.github.com.nicholasp23.zoopartyatnateshouse;

public abstract class Animal {

    private final String name;


    Animal(String name){
        this.name = name;
    }

    public abstract void speak();

    public String getName(){
        return name;
    }
}

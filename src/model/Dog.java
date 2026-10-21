package model;
public class Dog implements SpeakBehavior {
    String name;

    public Dog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String speak(){
        return "гав";
    }
}

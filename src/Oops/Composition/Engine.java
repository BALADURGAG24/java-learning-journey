package Oops.Composition;

public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}

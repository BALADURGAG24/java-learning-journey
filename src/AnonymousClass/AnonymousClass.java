package AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args){

     Dog dog1 = new Dog();
     dog1.speak();

     Dog dog2 = new Dog(){
         @Override
                 void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
     };
     dog2.speak();

        System.out.println();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();
    }
}

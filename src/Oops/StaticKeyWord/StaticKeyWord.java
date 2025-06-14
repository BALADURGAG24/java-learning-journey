package Oops.StaticKeyWord;

public class StaticKeyWord {
    public static void main(String[] args){

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Partha");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);

        System.out.println();

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);

        System.out.println();

        System.out.println(friend3.name);
        System.out.println(friend3.numOfFriends);

        System.out.println();

        System.out.println(friend4.name);
        System.out.println(friend4.numOfFriends);

        System.out.println();

        System.out.println(friend5.name);
        System.out.println(friend5.numOfFriends);

        System.out.println();

        System.out.println(Friend.numOfFriends);

        System.out.println();

        Friend.showFriends();

        Math.round(3.99);

    }
}

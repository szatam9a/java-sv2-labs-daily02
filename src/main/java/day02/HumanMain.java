package day02;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human( "Totoka", 16 );
        System.out.println("Az ember neve: "+ human.getName() + " az ember kora: " + human.getAge());
    }
}

public class PassingExample {
    public static void main(String[] args) {
        String hero = "Iron Man";
        System.out.println("Out of the function, before change: "+hero);
        changeNAme(hero);
        System.out.println("Out of the function, after change: "+hero);

    }

    static void changeNAme(String name) {
        name="Captain America";
        System.out.println("In the function: "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        String name = "Kye";
        int birthYear = 2002;
        System.out.printf("My name is %s, and my birth year is %d%n", name, birthYear);

        double pi = 3.14;

        String favFilm = "Finding Nemo";
        favFilm = "Hannah Montana: The Movie";
        System.out.printf("My favourite film is %s%n", favFilm);

        boolean isLearningJava = true;
        System.out.printf("Learning Java? %b%n", isLearningJava);

        printGreeting(name);

        int result = subtractTwoNumbers(10,5);
        System.out.println("subtractTwoNumbers(10,5) = " + result);

    }

    private static void printGreeting(String name) {
        System.out.printf("Hello %s!%n", name);
    }

    private static int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }
}

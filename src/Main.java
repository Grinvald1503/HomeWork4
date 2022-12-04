public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        byte age = 8;
        if (age >= 18) {
            System.out.println("Позравляем! Вы совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Вы ещё не достигли совершеннолетия, подождите немного");
        }
        System.out.println("Задача 2.");
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");

        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек может отправляться в университет");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
    }
}
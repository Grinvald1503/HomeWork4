public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Позравляем! Вы совершеннолетний!");
        }
        else {
            System.out.println("Вы ещё не достигли совершеннолетия, подождите немного");
        }
        System.out.println("Задача 2.");
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");

        }
        else if (age >= 18) {
            System.out.println("Человек может отправляться в университет");
        }
        else if (age >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }

        System.out.println("Задача 3.");
        byte place = 102;
        byte seats = 60;
        int noPass = 15;
        if (noPass <= seats) {
            System.out.println("Есть сидячие места!");
        }
        if (noPass <= place && noPass > seats)
        {
            System.out.println("Есть стоячие места");
        }
        if (noPass > place)
        {
            System.out.println("Мест больше нет!");
        }
    }
}
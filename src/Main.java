public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        byte age = 2;
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
        int noPass = 11;
        if (noPass <= seats) {
            System.out.println("Есть сидячие места!");
        }
        else if (noPass <= place)
        {
            System.out.println("Есть стоячие места");
        }
         else if (noPass > place)
        {
            System.out.println("Мест больше нет!");
        }
        System.out.println("Задача 1.3");
         if (age >= 2 && age <= 6) {
             System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
         }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
         else if (age > 18 && age < 24) {
             System.out.println("Если возраст человека равен " + age + ", то его место в университет");
         }
         else if (age > 24) {
             System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
         }
        System.out.println("Задание 2.3");
        if (age < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого");
        }
        else if (age >= 14) {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача 3.3");
        int one = 1;
        int tho = 2;
        int three = 3;
        if (one > tho && one > three) {
            System.out.println("наибольшее число " + one);
        }
        else if (tho > three) {
            System.out.println("наибольшее число " + tho);
        }
        else {
            System.out.println("наибольшее число " + three);
        }

    }
}
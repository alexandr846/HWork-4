public class Main {
    public static void main(String[] args) {
        System.out.println("Задача-1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 20, то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен 18 , " + " то он не достиг совершеннолетия , нужно немного подождать " + age);
        }
        System.out.println();
        System.out.println("Задача -2");
        int temperature = -5;
        if (temperature < 5) {
            System.out.println("На улице -5 градуса нужно надеть шапку");
        } else {
            // хотя можно и без шапки ходить все равно там пусто)))
            System.out.println("На улице 5 градусов можно идти без шапки" + temperature);
        }
        System.out.println();
        System.out.println("Задача-3");
        int highSpeed = 60;
        if (highSpeed > 60) {
            System.out.println("Если скорость 60 то можно ездить спокойно" + highSpeed);
        } else {
            System.out.println("Если скорость > 60 , то придется заплатить штраф ");

        }
        System.out.println();
        System.out.println("Задача-4");
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить в сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека " + age + " то его место в университете");
        } else if (age >= 24) {
            System.out.println("Если возраст человека " + age + "то ему пора ходить на работу");
        }
        System.out.println();
        System.out.println("Задача-5");
        if (age < 5) {
            System.out.println("Если ребенку меньше " + age + "то он не может кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + "то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        System.out.println("Задача-6");
        int trainСarriage = 102;
        int seating = 60;
        if (seating < 60 && trainСarriage < 102) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seating == 60 && trainСarriage < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

        System.out.println();
        System.out.println(" Задача-7");
        int one = 6;
        int two = 5;
        int three = 1;
        if (one > two && two > three) {
            System.out.println("Первый больше");
        }
        if (three > one && three < two)
        {
            System.out.println("Третий больше");
        }
        if (two > one && two > three)
        {
            System.out.println("Второй больше"); // Весь мозг сломал но уверен что не правельна 7 задача
        }

    }


}







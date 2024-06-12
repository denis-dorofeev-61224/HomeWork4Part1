import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaDeveloper!");

        //task1
        int age = 33;
        if (age < 18) {
            System.out.println("Совершеннолетие ещё не наступило,нужно немного подождать");
                      } else System.out.println("Тебе больше 18-ти. Ты совершеннлетний.");
        System.out.println("*****");

        //task2
        System.out.println("введите температуру которая сейчас на улице");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 5) {
            System.out.println("На улице холодно. Меньше 5ти градусов-оденьте шапку");
        } else if (temp>5)
            System.out.println("На улице тепло. Больше 5ти градусов- шапку можно не одевать.");
        else if (temp==5) {
            System.out.println("Температура на улице всего 5 градусов. Шапка по усмотрению.");
        }
        //согласно рекомендациям встроено дополнительное условие: температура ровно 5 градусов.

        //task3
        int speed = 93;
        if (speed > 60) {
            System.out.println("Скорость превышена " + speed + " придётся заплатить штраф.");
        } else {
            System.out.println("Скорость не превышена" + speed + " можно ездить спокойно.");
        }
        System.out.println("*****");

        //task4
        //Предлагаю в этой задаче использовать метод сканер, т.к.:
        //1.он уже подключен ранее
        //2.это наиболее очевидное и простое решение
        System.out.println("введите возраст человека и нажмите Enter");
        Scanner scanner2 = new Scanner(System.in);
        int ageOfPerson = scanner2.nextInt();
        if (ageOfPerson < 2) {
            System.out.println("Никуда ходить не нужно. Малыш сидит дома с мамой.");
        } else if (ageOfPerson >= 2 && ageOfPerson <= 6) {
            System.out.println("Нужно малышу ходить в детский сад.");
        } else if (ageOfPerson >= 7 && ageOfPerson <= 17) {
            System.out.println("Ребёнок должен ходить в школу.");
        } else if (ageOfPerson >= 18 && ageOfPerson <= 24) {
            System.out.println("Парень/девушка должны ходить в университет.");
        } else if (ageOfPerson > 24) {
            System.out.println("Человек должен ходить на работу.");
        }
        System.out.println("*****");

        //task5
        System.out.println("введите возраст ребёнка и нажмите Enter");
        Scanner scanner3 = new Scanner(System.in);
        int ageOfbaby = scanner3.nextInt();
        if (ageOfbaby < 5) {
            System.out.println("Ребёнку меньше 5-ти лет. Он Не может кататься на аттракционе.");
        } else if (ageOfbaby >= 5 && ageOfbaby <= 14) {
            System.out.println("Ребёнку можно кататься на аттракционе в сопровождению взрослого.");
        } else if (ageOfbaby >= 14) {
            System.out.println("Ребёнку можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("*****");


        //task6
        int personCuont = 11;
        int seats = 60;
        int capacity = 102;
        if (personCuont < 60) {
            System.out.println("В вагоне " + (seats - personCuont) + " сидячих мест." + (capacity - seats) + " стоячих");
        } else if (personCuont > 60 && personCuont < 102) {
            System.out.println("В вагоне " + (capacity - personCuont) + "  и   стоячих мест.");
        } else {
            System.out.println("Мест нет.");
        }
        System.out.println("*****");

        //task7
        int one = 2;
        int two = 3;
        int three = 7;
        if (one == two && one == three) {
            System.out.println("Числа равны " + one);
        } else if (one >= two && one >= three) {
            System.out.println(one + " самое большое");
        } else if (two >= one && two >= three) {
            System.out.println(two + " самое большое");
        } else {
            System.out.println(three + " самое большое");
            //согласно рекомендациям для лучшей читабельности кода добавлены пробелы после точек и запятых
        }
    }
}

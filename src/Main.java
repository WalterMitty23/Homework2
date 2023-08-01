public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        var dog = 8.0;
        System.out.println("task1 dog = " + dog);
        var cat = 3.6;
        System.out.println("task1 cat = " + cat);
        var paper = 763789;
        System.out.println("task1 paper = " + paper);

    }

    public static void task2() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println("task2 dog + 4 = " + dog);
        cat = cat + 4;
        System.out.println("task2 cat + 4 = " + cat);
        paper = paper + 4;
        System.out.println("task2 paper + 4 = " + paper);
    }

    public static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        System.out.println("task3 dog - 3.5 = " + dog);
        cat = cat - 1.6;
        System.out.println("task3 cat - 1.6 = " + cat);
        paper = paper - 7639;
        System.out.println("task3 paper - 7639 = " + paper);
    }
    public static void task4(){
        var friend = 19;
        System.out.println("task4 friend = " + friend);
        friend = friend + 2;
        System.out.println("task4 friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("task4 friend / 7 = " + friend);
    }
    public static void task5(){
        var frog = 3.5;
        System.out.println("test5 frog = " + frog);
        frog = frog * 10;
        System.out.println("test5 frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("test5 frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("test5 frog + 4 = " + frog);
    }
    public static void task6() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalBoxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("test6 total weight of both boxers = " + totalBoxersWeight + " kg");
        var differenceBoxersWeight = boxerWeight2 - boxerWeight1;
        System.out.println("test6 weight difference between both boxers = " + differenceBoxersWeight + " kg");
    }
    public static void task7() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceBySubtraction = boxerWeight2 - boxerWeight1;
        System.out.println("task7 substraction = " + differenceBySubtraction + " kg");
        var differenceByRemainder = boxerWeight2 % boxerWeight1;
        System.out.println("task7 remainder of division = " + differenceByRemainder + " kg");
    }
    public static void task8() {
        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalEmployees = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}

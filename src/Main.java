public class Main {
    public static void main(String[] args) {
        //Пример
        System.out.println("Example");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }

        //Задача 1
        System.out.println("Task 1");
        int salaryMe = 29000;
        int totalMe = 0;
        for (int i = 1; i <= 12; i++) {
            totalMe = totalMe + salaryMe;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMe + " рублей");
        }

        //Задача 2
        System.out.println("Task 2");
        int salaryMeAgain = 29000;
        int totalMeAgain = 0;
        for (int i = 1; i <= 12; i++) {
            totalMeAgain = totalMeAgain + totalMeAgain/100;
            totalMeAgain = totalMeAgain + salaryMeAgain;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMeAgain + " рублей");
        }
    }
}
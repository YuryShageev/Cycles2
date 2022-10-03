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
    }
}
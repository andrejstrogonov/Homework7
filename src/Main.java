public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");
        int desiredSum = 2459000;
        int sum = 0;
        int amount = 15000;
        double percent = 12 / 100;
        int monthCount = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum += (int) (sum * (1 + percent));
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sum + " рублей");
        }
        // задача 2
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        //задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year <= currentYear + 10; year++) {
            population += population * (fertilityRate - mortalityRate) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }
        //задача 4
        System.out.println("Задача 4");
        percent = 70 / 100;
        desiredSum = 12_000_000;
        sum = amount;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum += (int) (sum * (1 + percent));
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sum + " рублей");
        }
        //задача 5
        System.out.println("Задача 5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum += (int) (sum * (1 + percent));
            monthCount++;
            if(month%6==0){
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //задача 6
        System.out.println("Задача 6");
        sum = amount;
        month = 0;
        int months = 12*9;
        while (sum < desiredSum) {
            sum += amount;
            sum += (int) (sum * (1 + percent));
            monthCount++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //задача 7
        System.out.println("Задача 7");
        int firstFriday = 7;
        for(int day = firstFriday;day<=31;day+=7){
            System.out.println("Сегодня пятницв, "+day+" -е число. Необходимо подготовить отчет");
        }
        //задача 8
        System.out.println("Задача 8");
        int period = 79;
        int startSeeding = 0;
        int start = currentYear-200;
        int end = currentYear+100;
        for(int year = startSeeding;year<end;year+=period){
            if (year> start){
                System.out.println(year);
            }
        }
    }
}
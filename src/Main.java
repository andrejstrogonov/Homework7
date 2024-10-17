public class Main {
    public static void main(String[] args) {
        //задача 1
        int desiredSum = 2459000;
        int sum = 0;
        int amount = 15000;
        double percent = 12/100;
        int monthCount = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum += (int) (sum * (1 + percent));
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sum + " рублей");
        }
        // задача 2
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number+" ");
        }
        System.out.println();
        for(; number>=1;number--){
            System.out.print(number+" ");
        }
        System.out.println();
        //задача 3
        int population = 12_000_000;
        int fertilityRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for(int year=currentYear;year<=currentYear+10;year++){
            population+=population*(fertilityRate-mortalityRate)/1000;
            System.out.println("Год "+year+", численность населения составляет "+population+".");
        }
        //задача 4
        //задача 5
        //задача 6
        //задача 7
        //задача 8
    }
}
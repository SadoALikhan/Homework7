public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int deposit = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total/100 + deposit;
            month++;
            System.out.println("Месяц " + month +
                    ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задание 2:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Задание 3:");
        int people = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            people = people + (17 * (people/1000) - 8 * (people/1000));
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("Задание 4 ");
        int investment = 15000;
        int totalInvestment = 0;
        int totalMonth = 0;
        while (totalInvestment <= 12_000_000) {
            totalInvestment = totalInvestment + totalInvestment * 7/100 + investment;
            totalMonth++;
            System.out.println("В " + totalMonth +
                    " месяц, сумма накоплений составляет " + totalInvestment + " рублей.");
        }

        System.out.println("Задание 5:");
        int newInvestment = 15000;
        int totalInvestmentNew = 0;
        int newMonth = 0;
        while (totalInvestmentNew <= 12_000_000) {
            totalInvestmentNew = totalInvestmentNew + totalInvestmentNew * 7/100 + newInvestment;
            newMonth++;
            if (newMonth % 6 == 0) {
                System.out.println("В " + newMonth +
                        " месяц, сумма накоплений составляет " + totalInvestmentNew + " рублей.");
            }
        }

        System.out.println("Задание 6:");
        int vasiliyInvestment = 15000;
        int totalVasiliyInvestment = 0;
        int totalYear = 9;
        int allMonth = totalYear * 12;
        int investmentMonth = 0;
        while (investmentMonth <= allMonth) {
            totalVasiliyInvestment = totalVasiliyInvestment + totalVasiliyInvestment * 7/100 + vasiliyInvestment;
            investmentMonth++;
            if (investmentMonth % 6 == 0) {
                System.out.println("В " + investmentMonth +
                        " месяц, сумма накоплений составляет " + totalVasiliyInvestment + " рублей.");
            }
        }

        System.out.println("Задание 7:");
        int friday = 3;
        int day = 0;
        while (day <= 31) {
             day++;
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println("Задание 8:");
        int thisYear = 2024;
        int lastYears = thisYear - 200;
        int nextYears = thisYear + 100;
        int allYear = 0;
        while (allYear <= nextYears) {
            allYear++;
            if (allYear >= lastYears && allYear <= thisYear && allYear % 79 == 0) {
                System.out.println(allYear);
            }
            else if (allYear >= thisYear && allYear <= nextYears && allYear % 79 == 0){
                System.out.println(allYear);
            }
        }
    }
}
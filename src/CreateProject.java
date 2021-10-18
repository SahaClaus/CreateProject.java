public class CreateProject {
    public static void main(String[] args) {
        double interestRate = 4.5;
        double initialInvestmentAmount = 55000.90;
        int reinvestmentPeriodsCount = 9;

        // размер капитала в конце срока инвестирования
        double capitalAtEndPeriodInvestment = Math.pow(1 + interestRate / 100, reinvestmentPeriodsCount) * initialInvestmentAmount;
        System.out.printf("Размер капитала в конце срока инвестирования с капитализацией процентов на вклад составит: %.2f руб.", capitalAtEndPeriodInvestment);
    }
}

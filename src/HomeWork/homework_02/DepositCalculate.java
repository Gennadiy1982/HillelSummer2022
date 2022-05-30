package HomeWork.homework_02;

public class DepositCalculate {
    public static void main(String[] args) {
        double depositAmount = Double.parseDouble(args[0]);
        double taxRate = Double.parseDouble(args[1]);
        int year = Integer.parseInt(args[2]);
        for (int i = 1; i <= year; i++) {
            double compoundInterest = depositAmount * (Math.pow((1 + taxRate / 100), (i * 12))) - depositAmount;
            double sumToPayment = depositAmount + compoundInterest;
            System.out.printf(i + "-й год.Начислено процентов: %.2f грн.\n", compoundInterest);
            System.out.printf("Сумма на депозите: %.2f грн.\n", sumToPayment);
        }
    }
}
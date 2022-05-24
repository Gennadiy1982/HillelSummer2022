package homework_02;

public class DepositCalculate {
    public static void main(String[] args) {
        double depositAmount = Double.parseDouble(args[0]);
        double taxRate = Double.parseDouble(args[1]);
        int year = Integer.parseInt(args[2]);
        double compoundInterest;
        double sumToPayment;

        compoundInterest = depositAmount * (Math.pow((1 + taxRate / 100), (year * 12))) - depositAmount;
        sumToPayment = depositAmount + compoundInterest;
        System.out.printf("Проценты: %.2f грн.\n", compoundInterest);
        System.out.printf("Сумма к выплате: %.2f грн.", sumToPayment);
    }
}

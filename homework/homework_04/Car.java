package homework_04;

public class Car {

    double volumeFuelTank;
    private double remindFuel;
    private final double fuelConsumption;

    public Car(double volumeFuelTank, double fuelConsumption) {
        this.volumeFuelTank = volumeFuelTank;
        this.fuelConsumption = fuelConsumption;
    }

    double fillTank() {
        double rest =  volumeFuelTank - remindFuel;
        return rest + remindFuel;
    }

    double calculateRemindFuel(int distance) {
        remindFuel = fillTank() - (distance * fuelConsumption) / 100;
        return remindFuel;
    }

    double calculateSendFuel() {
        return volumeFuelTank - remindFuel;
    }
}

class Run {
    public static void main(String[] args) {

        int fuelCost = Integer.parseInt(args[0]);

        Car car = new Car(20,10);
        car.fillTank();
        car.calculateRemindFuel(178);
        car.calculateSendFuel();

        Car car1 = new Car(20, 10);
        car1.fillTank();
        car1.calculateRemindFuel(156);
        car1.calculateSendFuel();

        Car car2 = new Car(20, 10);
        car2.fillTank();
        car2.calculateRemindFuel(150);
        car2.calculateSendFuel();

        System.out.println("Маршрут Одесса - Киев");
        System.out.println("-----------------------------");

        System.out.println("Цена топлива за литр: " + fuelCost + " грн.");

        double totalCalcFuel = (car.calculateSendFuel() + car1.calculateSendFuel() + car2.calculateSendFuel());
        System.out.println("Количество долитого топлива: " + totalCalcFuel + " л");
        double totalCalcRemind = (car.calculateRemindFuel(178)
                + car1.calculateRemindFuel(156) + car2.calculateRemindFuel(150));
        System.out.println("Остаток топлива в пункте назначения: " + totalCalcRemind + " л");

        double sum = totalCalcFuel * fuelCost;
        System.out.println("Стоимость долитого топлива: " + sum + " грн.");
        double totalSum = (car.volumeFuelTank + totalCalcFuel) * fuelCost;
        System.out.printf("Общая стоимость поездки: %.2f грн.", totalSum );
    }
}

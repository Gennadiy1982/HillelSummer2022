package homework_06;

public class Run {

    static int limit;
    static int time = 0;
    static double balance = 0.00;
    static int total = 0;
    static char firstLiter = 'Б';

    public static void main(String[] args) {

        SubscriberServiceImpl ssi = new SubscriberServiceImpl();

        ssi.outOfLimitsDurationCityCall(DataGeneration.getSubscriberArray(),limit);
        ssi.useLongDistanceCall(DataGeneration.getSubscriberArray(),time);
        ssi.negativeBalance(DataGeneration.getSubscriberArray(),balance);
        ssi.totalTraffic(DataGeneration.getSubscriberArray(),total);
        ssi.firstLiterOfSurname(DataGeneration.getSubscriberArray(),firstLiter);
    }
}

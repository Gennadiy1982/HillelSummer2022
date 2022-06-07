package homework_06;

public class Run {
    public static void main(String[] args) {

        SubscriberServiceImpl ssi = new SubscriberServiceImpl();

        ssi.outOfLimitsDurationCityCall(DataGeneration.getSubscriberArray());
        ssi.useLongDistanceCall(DataGeneration.getSubscriberArray());
        ssi.negativeBalance(DataGeneration.getSubscriberArray());
        ssi.totalTraffic(DataGeneration.getSubscriberArray());
        ssi.firstLiterOfSurname(DataGeneration.getSubscriberArray());
    }
}

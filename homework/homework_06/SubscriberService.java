package homework_06;

public interface SubscriberService {

    void outOfLimitsDurationCityCall(Subscriber[] subscribers,int limit);

    void useLongDistanceCall(Subscriber[] subscribers,int time);

    void negativeBalance(Subscriber[] subscribers,double balance);

    void totalTraffic(Subscriber[] subscribers,int total);

    void firstLiterOfSurname(Subscriber[] subscribers,char firstLiter);
}

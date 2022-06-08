package homework_06;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void outOfLimitsDurationCityCall(Subscriber [] subscribers,int limit) {
        System.out.println("Абоненты,которые превысили лимит междугородних разговоров (свыше 50 минут): ");
        System.out.println("------------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getDurationCityCall() > limit) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void useLongDistanceCall(Subscriber[] subscribers,int time) {
        System.out.println();
        System.out.println("Абоненты,которые пользовались междугородней связью: ");
        System.out.println("------------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getDurationLongDistanceCall() != time) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void negativeBalance(Subscriber[] subscribers,double balance) {
        System.out.println();
        System.out.println("Количество абонентов с отрицательным балансом: ");
        System.out.println("---------------------------------------------------");
        int count = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < balance) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Override
    public void totalTraffic(Subscriber[] subscribers,int total) {
        System.out.println();
        System.out.println("Общий объем траффика ");
        System.out.println("-----------------------------------------------------");
        for (Subscriber s : subscribers) {
            total += s.getInternetTraffic();
        }
        System.out.println(total + " Гб");
    }

    @Override
    public void firstLiterOfSurname(Subscriber[] subscribers,char firstLiter) {
        System.out.println();
        System.out.println("Сведения об абонентах,фамилия которых начинается на букву 'Б' ");
        System.out.println("------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getSurname().charAt(0) == firstLiter) {
                System.out.println(s.getSurname() + " " +
                        s.getName() + " "
                        + s.getPatronymicName() + "."
                        + "Номер телефона: " + s.getPhone() + " "
                        + "Баланс: " + s.getBalance() + " грн.");
            }
        }
    }
}
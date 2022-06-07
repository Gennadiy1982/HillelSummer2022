package homework_06;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void outOfLimitsDurationCityCall(Subscriber[] subscribers) {
        System.out.println("Абоненты,которые превысили лимит междугородних разговоров (свыше 50 минут): ");
        System.out.println("------------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getDurationCityCall() > 50) {

                System.out.println(s);
            }
        }
    }

    @Override
    public void useLongDistanceCall(Subscriber[] subscribers) {
        System.out.println();
        System.out.println("Абоненты,которые пользовались междугородней связью: ");
        System.out.println("------------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getDurationLongDistanceCall() != 0) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void negativeBalance(Subscriber[] subscribers) {
        System.out.println();
        System.out.println("Количество абонентов с отрицательным балансом: ");
        System.out.println("---------------------------------------------------");
        int count = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Override
    public void totalTraffic(Subscriber[] subscribers) {
        System.out.println();
        System.out.println("Общий объем траффика ");
        System.out.println("-----------------------------------------------------");
        int total = 0;
        for (Subscriber s : subscribers) {
            total += s.getInternetTraffic();
        }
        System.out.println(total + " Гб");
    }

    @Override
    public void firstLiterOfSurname(Subscriber[] subscribers) {
        System.out.println();
        System.out.println("Сведения об абонентах,фамилия которых начинается на букву 'Б' ");
        System.out.println("------------------------------------------------------");
        for (Subscriber s : subscribers) {
            if (s.getSurname().charAt(0) == 'Б') {
                System.out.println(s.getSurname() + " " +
                        s.getName() + " "
                        + s.getPatronymicName() + "."
                        + "Номер телефона: " + s.getPhone() + " "
                        + "Баланс: " + s.getBalance() + " грн.");
            }
        }
    }
}
package homework_05.homework_06;

public class DataGeneration {
    public static Subscriber[] getSubscriberArray() {

        Subscriber[] subscribers = new Subscriber[10];

        subscribers[0] = new Subscriber(1, "Иванов", "Геннадий", "Сергеевич",
                "Харьков", "099876", "00777", -250.00,
                30, 45, 10);
        subscribers[1] = new Subscriber(2, "Петров", "Олег", "Николаевич",
                "Харьков", "099123", "56789", 300,
                23, 10, 50);
        subscribers[2] = new Subscriber(3, "Брежнев", "Леонид", "Ильич", "Харьков",
                "068754", "00067", 45, 47, 0, 20);
        subscribers[3] = new Subscriber(4, "Хрущев", "Никита", "Сергеевич", "Харьков",
                "067890", "01020", 500, 34, 0, 34);
        subscribers[4] = new Subscriber(5, "Андропов", "Юрий", "Владимирович",
                "Харьков", "099111", "564738", 340, 45, 0, 30);
        subscribers[5] = new Subscriber(6, "Горбачев", "Михаил", "Сергеевич",
                "Харьков", "01234", "87960", 230, 70, 23, 56);
        subscribers[6] = new Subscriber(7, "Воробьянинов", "Ипполит", "Матвеевич",
                "Старгород", "122332", "89898",
                340, 20, 0, 12);
        subscribers[7] = new Subscriber(8, "Булгаков", "Михаил", "Афанасьевич",
                "Харьков", "099333", "555555", 450,
                45, 45, 10);
        subscribers[8] = new Subscriber(9, "Гоголь", "Николай", "Васильевич",
                "Полтава", "099999", "453627", 500,
                45, 90, 40);
        subscribers[9] = new Subscriber(10, "Маяковский", "Владимир", "Владимирович",
                "Москва", "0008706", "095876", -200,
                30, 35, 50);
        return subscribers;
    }
}

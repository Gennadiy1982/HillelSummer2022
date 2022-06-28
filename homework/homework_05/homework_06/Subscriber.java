package homework_05.homework_06;

import java.util.Objects;

public class Subscriber {

    private int id;
    private String surname;
    private String name;
    private String patronymicName;
    private String city;
    private String phone;
    private String contractNumber;
    private double balance;
    private int durationCityCall;
    private int durationLongDistanceCall;
    private int internetTraffic;

    public Subscriber() {

    }

    public Subscriber(int id, String surname, String name, String patronymicName, String city, String phone,
                      String contractNumber, double balance, int durationCityCall,
                      int durationLongDistanceCall, int internetTraffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.city = city;
        this.phone = phone;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.durationCityCall = durationCityCall;
        this.durationLongDistanceCall = durationLongDistanceCall;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDurationCityCall() {
        return durationCityCall;
    }

    public void setDurationCityCall(int durationCityCall) {
        this.durationCityCall = durationCityCall;
    }

    public int getDurationLongDistanceCall() {
        return durationLongDistanceCall;
    }

    public void setDurationLongDistanceCall(int durationLongDistanceCall) {
        this.durationLongDistanceCall = durationLongDistanceCall;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return id == that.id && Double.compare(that.balance, balance) == 0 && durationCityCall == that.durationCityCall && durationLongDistanceCall == that.durationLongDistanceCall && internetTraffic == that.internetTraffic && Objects.equals(surname, that.surname) && Objects.equals(name, that.name) && Objects.equals(patronymicName, that.patronymicName) && Objects.equals(city, that.city) && Objects.equals(phone, that.phone) && Objects.equals(contractNumber, that.contractNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymicName, city, phone, contractNumber, balance, durationCityCall, durationLongDistanceCall, internetTraffic);
    }

    @Override
    public String toString() {
        return
                id + " " +
                        surname + " " +
                        name + " " +
                        patronymicName + " " +
                        city + " " +
                        "Тел." + phone + " " +
                        "Номер договора: " + contractNumber + " " +
                        "Баланс: " + balance + " грн." +
                        "Продолжительность городских звонков: " + durationCityCall + " мин." +
                        "Продолжительность междугородних звонков: " + durationLongDistanceCall + " мин." +
                        "Объем траффика: " + internetTraffic + " Гб";
    }
}

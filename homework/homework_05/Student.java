package homework_05;

public class Student {

    private int id;
    private String surname;
    private String name;
    private String patronymicName;
    private String yearOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student() {

    }

    public Student(int id, String surname, String name, String patronymic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymic;
    }

    public Student(int id, String surname, String name, String patronymic, String dateOfBirth, String address,
                   String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymic;
        this.yearOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return
                id +
                        " " + surname +
                        " " + name +
                        " " + patronymicName +
                        " " + yearOfBirth + " г.р." +
                        " " + address +
                        " тел.: " + phone + ";" +
                        " факультет: " + faculty + ";" +
                        " курс: " + course + ";" +
                        " номер группы: " + group;

    }

}

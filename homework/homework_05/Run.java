package homework_05;

public class Run {

    static Student[] student = new Student[10];

    public static void main(String[] args) {

        student[0] = new Student(1, "Иванов", "Геннадий", "Сергеевич", "1982",
                "Харьков", "099479", "Юридический", 1, "Б - 52");
        student[1] = new Student(2, "Петров", "Алексей", "Николаевич", "1982",
                "Харьков", "067546", "Экономический", 1, "Б - 12");
        student[2] = new Student(3, "Кашпировский", "Анатолий", "Петрович", "1983",
                "Харьков", "099234", "Юридический", 2, "Б - 52");
        student[3] = new Student(4, "Сидоров", "Егор", "Алексеевич", "1978",
                "Харьков", "099876", "Юридический", 1, "Б - 35");
        student[4] = new Student(5, "Никитин", "Роман", "Леонидович", "1979",
                "Харьков", "067859", "Педагогический", 1, "Б - 12");
        student[5] = new Student(6, "Еременко", "Петр", "Егорович", "1981",
                "Харьков", "0999877", "Экономический", 1, "Б - 12");
        student[6] = new Student(7, "Яковенко", "Олег", "Федорович", "1984",
                "Харьков", "067854", "Юридический", 4, "Б - 52");
        student[7] = new Student(8, "Чумак", "Алан", "Олегович", "1985",
                "Харьков", "099456", "Педагогический", 1, "Б - 52");
        student[8] = new Student(9, "Тихонов", "Анатолий", "Григорьевич", "1979",
                "Харьков", "09945", "Юридический", 5, "Б - 12");
        student[9] = new Student(10, "Горбачев", "Михаил", "Сергеевич", "1980",
                "Харьков", "099345", "Экономический", 1, "Б - 35");

        showFaculty();
        showFacultyAndCourse();
        showYear();
        showGroup();
    }

    private static void showFaculty() {
        System.out.println("Список студентов юридического факультета:");
        System.out.println("-----------------------------------------");
        for (Student s : student) {
            if (s.getFaculty().equals("Юридический")) {
                System.out.println(s);
            }
        }
    }

    private static void showFacultyAndCourse() {
        System.out.println();
        System.out.println("Список студентов 2-го курса юридического факультета");
        System.out.println("---------------------------------------------------");
        for (Student s : student) {
            if (s.getFaculty().equals("Юридический") && s.getCourse() == 2) {
                System.out.println(s);
            }
        }
    }

    private static void showYear() {
        System.out.println();
        System.out.println("Список студентов,родившихся после 1980 года: ");
        System.out.println("----------------------------------------------");
        for (Student s : student) {
            if (Integer.parseInt(s.getYearOfBirth()) > 1980) {
                System.out.println(s);
            }
        }
    }

    private static void showGroup() {
        System.out.println();
        System.out.println("Список студентов группы Б - 12");
        System.out.println("------------------------------");
        for (Student s : student) {
            if (s.getGroup().equals("Б - 12")) {
                System.out.println(s);
            }
        }
    }
}

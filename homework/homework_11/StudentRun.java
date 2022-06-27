package homework_11;

public class StudentRun {
    public static void main(String[] args) {
        Student st = new Student();

        st.setId(1);
        st.setName("Gennadiy");
        st.setAge(40);

        Student st1 = new Student().setId(2).setName("John").setAge(23);

        System.out.println(st);
        System.out.println(st1);
    }
}

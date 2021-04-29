public class Student extends  User{
    private int grade;

    public Student(int id, String name, String surname, String email, String password, String type, int grade) {
        super(id, name, surname, email, password, type);
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

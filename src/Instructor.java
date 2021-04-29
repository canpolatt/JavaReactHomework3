public class Instructor extends User{
    private double score;

    public Instructor(int id, String name, String surname, String email, String password, String type, double score) {
        super(id, name, surname, email, password, type);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}

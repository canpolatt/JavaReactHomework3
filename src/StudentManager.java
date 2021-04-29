public class StudentManager extends UserManager{

    public StudentManager(BaseLogger baseLogger) {
        super(baseLogger);
    }

    @Override
    public void addUser(User user) {
        super.addUser(user);
        System.out.println("Öğrenci eklendi");
        System.out.println();
    }

    @Override
    public void deleteUser(User user) {
        super.deleteUser(user);
        System.out.println("Öğrenci silindi");
        System.out.println();
    }

    @Override
    public void updateUser(User user) {
        super.updateUser(user);
        System.out.println("Öğrenci güncellendi");
        System.out.println();
    }

    @Override
    public void listUsers(User[] users) {
        super.listUsers(users);
        System.out.println("Öğrenciler listelendi.");
        System.out.println();
    }
}

public class InstructorManager extends UserManager{

    public InstructorManager(BaseLogger baseLogger) {
        super(baseLogger);
    }

    @Override
    public void addUser(User user) {
        super.addUser(user);
        System.out.println("Öğretmen eklendi.");
        System.out.println();
    }

    @Override
    public void deleteUser(User user) {
        super.deleteUser(user);
        System.out.println("Öğretmen silindi.");
        System.out.println();
    }

    @Override
    public void updateUser(User user) {
        super.updateUser(user);
        System.out.println("Öğretmen güncellendi.");
        System.out.println();
    }

    @Override
    public void listUsers(User[] users) {
        super.listUsers(users);
        System.out.println("Öğretmenler listelendi.");
        System.out.println();
    }
}

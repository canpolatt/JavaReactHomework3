public class UserManager {
    private BaseLogger baseLogger;

    public UserManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void addUser(User user) {
        System.out.println();
        System.out.println("Sisteme eklenecek kullanıcı bilgileri: ");
        System.out.println("Ad Soyad: " + user.getName() + " " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Şifre: "+user.getPassword());
        System.out.println("Tipi: "+user.getType());
        this.baseLogger.log();
    }

    public void deleteUser(User user) {
        System.out.println("Sistemden silinecek kullanıcı bilgileri: ");
        System.out.println("Ad Soyad: " + user.getName() + " " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Şifre: "+user.getPassword());
        System.out.println("Tipi: "+user.getType());
        this.baseLogger.log();
    }

    public void updateUser(User user) {
        System.out.println("Güncellenecek kullanıcı bilgileri: ");
        System.out.println("Ad Soyad: " + user.getName() + " " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Şifre: "+user.getPassword());
        System.out.println("Tipi: "+user.getType());
        this.baseLogger.log();
    }

    public void listUsers(User[] users) {
        System.out.println();
        System.out.println("Tüm kullanıcıların listesi: ");
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getSurname()+" ("+user.getType()+")");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentManager studentManager=new StudentManager(new EmailLogger());
        Student student1=new Student(1,"Can","Polat","canpolat@example.com","1234"
        ,"Student",100);
        studentManager.addUser(student1);
        studentManager.updateUser(student1);
        studentManager.deleteUser(student1);

        InstructorManager instructorManager= new InstructorManager(new DatabaseLogger());
        Instructor instructor1= new Instructor(2,"Engin","Demiroğ","engindemirog@example.com"
                ,"5678","Instructor",5.0);
        instructorManager.addUser(instructor1);
        instructorManager.updateUser(instructor1);
        instructorManager.deleteUser(instructor1);

        User[] users=new User[]{student1,instructor1};
        UserManager userManager=new UserManager(new DatabaseLogger());
        userManager.listUsers(users);

    }
}

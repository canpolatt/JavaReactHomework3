**JAVA & REACT Kampı  - 3. Gün Ödev**
- Kodlama.io projesini yazdığınızı düşünelim.
- User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
- UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

Özellik nesnesi olarak **Student** ve **Instructor** tanımlandı. Bu sınıflara base class olarak **User** class'ı tanımlandı. 
İş sınıfı olarak ise **StudentManager** ve **InstructorManager** tanımlandı ve bu sınıflara base class olarak **UserManager** class'ı tanımlandı. Bu sınıfların içerisinde kullanıcı ekleme, silme, güncelleme, listeleme metotları bulunmaktadır. 
Loglama işlemleri için ise **Database, Email ve File** Logger classları bulunmaktadır. Bu sınıflara base class olarak **BaseLogger** class'ı tanımlandı. Bu class loglama işlemleri yapıldığında ekrana bilgilendirici mesaj basmaktadır.

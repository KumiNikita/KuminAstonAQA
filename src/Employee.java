package src;

public class Employee {
    public String Fullname;
    public String email;
    public String position;
    public String phone;
    public double salary;
    public int age;

    public Employee(String Fullname,String email, String position, String phone, double salary, int age)
    {
        this.Fullname= Fullname;
        this.email = email;
        this.position= position;
        this.phone=phone;
        this.salary= salary;
        this.age= age;

    }

    public void Info()
{
System.out.println("ФИО сотрудника " + Fullname );
    System.out.println("Email сотрудника " + email );
    System.out.println("Должность сотрудника " + position );
    System.out.println("Телефон сотрудника " + phone );
    System.out.println("Зарплата сотрудника " + salary );
    System.out.println("Возраст сотрудника " + age );
}
        }
package src;

public class Array {
    public static void main(String[] args){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Semenov Semen", "QA Engineer",
                "semsan@mailbox.com", "8954675542", 20000, 20);
        employees[2] = new Employee("Samuk Anna ", "Dev",
                "AnnS@mailbox.com", "89233662", 15000, 25);
        employees[3] = new Employee("Petrov Petr", "Designer",
                "PetrPetr@mailbox.com", "43585838", 17000, 28);
        employees[4] = new Employee("Georgiev Maksim", "BA",
                "Gmax@mailbox.com", "892312312", 50000, 19);

        for (Employee employee: employees ) {
            System.out.println("Игнформация о сотрудниках:");
            System.out.println("ФИО сотрудника " + employee.Fullname );
            System.out.println("Email сотрудника " + employee.email );
            System.out.println("Должность сотрудника " + employee.position );
            System.out.println("Телефон сотрудника " + employee.phone );
            System.out.println("Зарплата сотрудника " + employee.salary );
            System.out.println("Возраст сотрудника " + employee.age );
            System.out.println();
        }
    }

}


    public class Main{
        public static void main(String[] args) {

            Employee[] employees = new Employee[]{
                    new Employee("Vasya", "2", "42000"),
                    new Employee("Olya", "1", "50000"),
                    new Employee("Kolya", "3", "20000"),
                    new Employee("Vanya", "2", "2000000"),
                    null,
                    new Employee("Misha", "1", "23500"),
                    new Employee("Petya", "2", "44000"),
                    null,
                    new Employee("Vlad", "3", "90000"),

            };
            EmployeeService.printListEmployee(employees);
            System.out.println(employees);

            EmployeeService.addEmployee(new Employee("Alisa", "5", "100000"), employees);
            EmployeeService.printListEmployee(employees);
            EmployeeService.printMaxSalary(employees);
            EmployeeService.printMinSalary(employees);
        }



    }




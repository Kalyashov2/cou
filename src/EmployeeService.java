
public class EmployeeService {
    public EmployeeService(String name, String department, String sallary) {
    }

    /**
     * Выведение списка работников
     *
     * @param employees
     */
    public static void printListEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee[] addEmployee(Employee employee, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                continue;
            }
            employees[i] = employee;
            return employees;
        }
        System.out.println("Нет вакансий");
        return employees;

    }

    public static Employee[] removeEmployee(int number, Employee[] employeese) {
        if (number > employeese.length) {
            System.out.println("Нет столько сотрудников");
        } else if (employeese[number - 1] == null) {
            System.out.println("Нельзя удалить человека, не приняв на работу");
        } else {
            employeese[number - 1] = null;
            System.out.println("Уволилил");
        }
        return employeese;
    }

    public static double minSallary(Employee[] employees) {
        int count = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double min = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (employees[count] != null && min > employees[count].getSalary()) {
                min = employees[count].getSalary();
            }
        }
        return min;
    }

    public static void printMinSalary(Employee[] employees) {
        System.out.println("минимальная зарплата" + minSallary(employees));
    }

    public static double maxSallary(Employee[] employees) {
        int count = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double max = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (employees[count] != null && max < employees[count].getSalary()) {
                max = employees[count].getSalary();
            }
        }
        return max;
    }

    public static void printMaxSalary(Employee[] employees) {
        System.out.println("максимальная зарплата" + maxSallary(employees));


    }
}
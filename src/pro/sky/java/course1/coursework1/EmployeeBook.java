package pro.sky.java.course1.coursework1;

public class EmployeeBook {
    private Employee[] empl = new Employee[10];

    public EmployeeBook() {
        empl[0] = new Employee("Иван", "Иванович", "Иванов", 1, 25500);
        empl[1] = new Employee("Петр", "Петрович", "Петров", 2, 31450);
        empl[2] = new Employee("Михаил", "Иванович", "Сидоров", 3, 40200);
        empl[3] = new Employee("Ярослав", "Маркович", "Гольштейн", 4, 38950);
        empl[4] = new Employee("Виктор", "Викторович", "Пантюков", 5, 55210);
        empl[5] = new Employee("Анна", "Вячеславовна", "Сидорова", 3, 37200);
        empl[6] = new Employee("Антон", "Иванович", "Марков", 1, 55350);
        empl[7] = new Employee("Виктория", "Павловна", "Рассвет", 2, 39540);
        empl[8] = new Employee("Артем", "Михайлович", "Рогов", 4, 65410);
        empl[9] = new Employee("Виктор", "Петрович", "Леончук", 5, 65200);
    }

    public void printAllEmpl() {
        for (Employee employee : empl) {
            System.out.println(employee);
        }
    }

    public int calculateAllSallaries() {
        int salaries = 0;
        for (Employee employee : empl) {
            salaries += employee.getSalary();
        }
        return salaries;
    }

    public Employee calculateMinEmpl() {
        Employee calculateMinEmpl = empl[0];
        for (Employee employee : empl) {
            if (employee.getSalary() < calculateMinEmpl.getSalary()) {
                calculateMinEmpl = employee;
            }
        }
        return calculateMinEmpl;
    }

    public Employee calculateMaxEmpl() {
        Employee calculateMaxEmpl = empl[0];
        for (Employee employee : empl) {
            if (employee.getSalary() > calculateMaxEmpl.getSalary()) {
                calculateMaxEmpl = employee;
            }
        }
        return calculateMaxEmpl;
    }

    public double calculateMediumSallaries() {
        double allSal = calculateAllSallaries();
        return allSal / empl.length;
    }

    public void printFullName() {
        for (Employee employee : empl) {
            System.out.println(employee.printFullName());
        }
    }
    public void indexSalaryByPercent(double percent){
        percent = 0.01 * percent;
        for (Employee employee : empl){
            employee.setSalary(employee.getSalary() * (1 + percent));
        }
    }
    public Employee findEmployeeWithMaxSalaryInDepartment(int departmentNumber){
        double maxSalary = Integer.MIN_VALUE;
        Employee maxEmployeeDepartment = empl[0];
        for (Employee employee : empl) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                if (employee.getSalary() > maxSalary) {
                    maxEmployeeDepartment = employee;
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxEmployeeDepartment;
    }
    public void printEmployeeWithMaxSalaryInDepartment(int departmentNumber){
        Employee name = findEmployeeWithMaxSalaryInDepartment(departmentNumber);
        System.out.printf("В отделе %d сотрудник %s %s %s с максимальной зарплатой %.2f рублей%n", name.getDepartmentNumber(), name.getLastName(), name.getFirstName(), name.getMiddleName(), name.getSalary());
    }
    public Employee findEmployeeWithMinSalaryInDepartment(int departmentNumber){
        double minSalary = Integer.MAX_VALUE;
        Employee minEmployeeDepartment = empl[0];
        for (Employee employee : empl) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                if (employee.getSalary() < minSalary) {
                    minEmployeeDepartment = employee;
                    minSalary = employee.getSalary();
                }
            }
        }
        return minEmployeeDepartment;
    }
    public void printEmployeeWithMinSalaryInDepartment(int departmentNumber){
        Employee name = findEmployeeWithMinSalaryInDepartment(departmentNumber);
        System.out.printf("В отделе %d сотрудник %s %s %s с минимальной зарплатой %.2f рублей%n", name.getDepartmentNumber(), name.getLastName(), name.getFirstName(), name.getMiddleName(), name.getSalary());
    }
    public double calculateSalariesOfDepartment(int departmentNumber){
        double sum = 0;
        for (Employee employee : empl){
            if (employee.getDepartmentNumber() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public void printSalariesOfDepartment(int departmentNumber){
        System.out.printf("Сумма затрат на зарплату по отделу %d составила %.2f рублей%n", departmentNumber, calculateSalariesOfDepartment(departmentNumber));
    }
    public double calculateMiddleSalariesOfDepartment(int departmentNumber) {
        double sum = calculateSalariesOfDepartment(departmentNumber);
        int numbers = 0;
        for (Employee employee : empl){
            if (employee.getDepartmentNumber() == departmentNumber) {
                numbers++;
            }
        }
        return sum/numbers;
    }
    public void printMiddleSalariesOfDepartment(int departmentNumber){
        System.out.printf("Средняя зарплата по отделу %d составила %.2f рублей%n", departmentNumber, calculateMiddleSalariesOfDepartment(departmentNumber));
    }
    public void indexSalaryByPercentInDepartment(double percent, int departmentNumber){
        percent = 1+ 0.01 * percent;
        for (Employee employee : empl){
            if (employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary(employee.getSalary() * percent);
            }
        }
    }
    public void printEmployeesOneDepartment(int departmentNumber){
        System.out.println("Сотрудники отдела " + departmentNumber);
        for (Employee employee : empl) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println("Id: "+ employee.getId()+", " +employee.getLastName() +" " + employee.getFirstName()+ " "+ employee.getMiddleName()+ ", зарплата " + employee.getSalary()+" рублей");
            }
        }
    }
    public void printEmployeesSalaryIsLessThan (int sal){
        System.out.println("Сотрудники с зарплатой меньше " + sal + " рублей:");
        for (Employee employee : empl) {
            if(employee.getSalary() < sal){
                System.out.println("Id: "+ employee.getId()+", " +employee.getLastName() +" " + employee.getFirstName()+ " "+ employee.getMiddleName()+ ", зарплата " + employee.getSalary()+" рублей");
            }
        }
    }
    public void printEmployeesSalaryIsMoreThan (int sal){
        System.out.println("Сотрудники с зарплатой больше (или равной) " + sal + " рублей:");
        for (Employee employee : empl) {
            if(employee.getSalary() >= sal){
                System.out.println("Id: "+ employee.getId()+", " +employee.getLastName() +" " + employee.getFirstName()+ " "+ employee.getMiddleName()+ ", зарплата " + employee.getSalary()+" рублей");
            }
        }
    }
}

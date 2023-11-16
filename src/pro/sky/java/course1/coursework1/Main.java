package pro.sky.java.course1.coursework1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printAllEmpl();
        System.out.println();
        System.out.println("Месячный фонд отплаты труда: " + employeeBook.calculateAllSallaries());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.calculateMinEmpl());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.calculateMaxEmpl());
        System.out.println();
        System.out.println("Средняя зарплата офиса: " + employeeBook.calculateMediumSallaries());
        System.out.println();
        employeeBook.printFullName();
        System.out.println();
        //индексация зарплат на 3 %
        employeeBook.indexSalaryByPercent(3);
        employeeBook.printAllEmpl();
        System.out.println();
        employeeBook.printEmployeeWithMaxSalaryInDepartment(3);
        employeeBook.printEmployeeWithMinSalaryInDepartment(5);
        employeeBook.printSalariesOfDepartment(2);
        employeeBook.printMiddleSalariesOfDepartment(2);
        employeeBook.indexSalaryByPercentInDepartment(3,2);
        employeeBook.printEmployeesOneDepartment(2);
        employeeBook.printEmployeesSalaryIsLessThan(45000);
        employeeBook.printEmployeesSalaryIsMoreThan(34000);

    }


}

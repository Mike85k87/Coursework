package pro.sky.java.course1.coursework1;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int departmentNumber;
    private double salary;
    private static int counter;
    private int id;

    public Employee(String firstName, String middleName, String lastName, int departmentNumber, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Id: " + this.id + " Фамилия: " + this.lastName + " Имя: "+ this.firstName+" Отчество: "+this.middleName+ " Отдел: " + this.departmentNumber + " Зарплата: " + this.salary;
    }
    public String printFullName() {
        return " Фамилия: " + this.lastName + " Имя: "+ this.firstName+" Отчество: "+this.middleName;
    }
}

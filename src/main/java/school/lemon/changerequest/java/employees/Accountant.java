package school.lemon.changerequest.java.employees;

public interface Accountant extends Employee {

    /**
     * Add employee to the list of accountable employees
     * @param employee which will be added
     */
    void addEmployee(Employee employee);

    /**
     * Calculates salary for all accountable employees plus Accountant salary.
     * @return total salary for all accountable employees including Accountant
     */
    double calculateEmployeesSalary();

}

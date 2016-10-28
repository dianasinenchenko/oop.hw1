package school.lemon.changerequest.java.hw3.employees

import spock.lang.Specification
import spock.lang.Unroll

import static school.lemon.changerequest.java.hw3.employees.Employee.DEFAULT_SALARY
import static school.lemon.changerequest.java.hw3.employees.Employee.WORKING_HOURS_PER_MONTH
import static school.lemon.changerequest.java.hw3.employees.EmployeesFactory.*

class TestEmployees extends Specification {

    @Unroll
    def "#employee.getClass().getSimpleName() worked #hours hours"() {
        expect:
        employee.work((int) hours)
        employee.getWorkedRatio() == (double) workedPercentage

        where:
        employee               | hours                       | workedPercentage
        createAccountant(1000) | 0                           | 0.0
        createAccountant(1000) | WORKING_HOURS_PER_MONTH     | 1.0
        createAccountant(1000) | WORKING_HOURS_PER_MONTH / 2 | 0.5
        createAccountant(1000) | WORKING_HOURS_PER_MONTH * 2 | 2.0
        createAccountant(1000) | -1                          | 0.0

        createProgrammer(1000) | 0                           | 0.0
        createProgrammer(1000) | WORKING_HOURS_PER_MONTH     | 1.0
        createProgrammer(1000) | WORKING_HOURS_PER_MONTH / 2 | 0.5
        createProgrammer(1000) | WORKING_HOURS_PER_MONTH * 2 | 2.0
        createProgrammer(1000) | -1                          | 0.0

        createManager(1000)    | 0                           | 0.0
        createManager(1000)    | WORKING_HOURS_PER_MONTH     | 1.0
        createManager(1000)    | WORKING_HOURS_PER_MONTH / 2 | 0.5
        createManager(1000)    | WORKING_HOURS_PER_MONTH * 2 | 2.0
        createManager(1000)    | -1                          | 0.0
    }

    @Unroll
    def "#employee.getClass().getSimpleName() salary for #hours hours"() {
        expect:
        employee.work((int) hours)
        employee.calculateCurrentMonthSalary() == (double) salary

        where:
        employee                | hours                       | salary
        createAccountant(100)   | 0                           | 0.0
        createAccountant(100)   | WORKING_HOURS_PER_MONTH     | 100.0
        createAccountant(-1)    | WORKING_HOURS_PER_MONTH     | DEFAULT_SALARY
        createAccountant(100)   | WORKING_HOURS_PER_MONTH / 2 | 50.0
        createAccountant(100)   | WORKING_HOURS_PER_MONTH * 2 | 100.0
        createAccountant(100)   | -1                          | 0.0
        createAccountant(0)     | WORKING_HOURS_PER_MONTH     | 0.0

        createManager(100)      | 0                           | 0.0
        createManager(100)      | WORKING_HOURS_PER_MONTH     | 100.0
        createManager(-1)       | WORKING_HOURS_PER_MONTH     | DEFAULT_SALARY
        createManager(100)      | WORKING_HOURS_PER_MONTH / 2 | 50.0
        createManager(100)      | WORKING_HOURS_PER_MONTH * 2 | 100.0
        createManager(100)      | -1                          | 0.0
        createManager(0)        | WORKING_HOURS_PER_MONTH     | 0.0

        createProgrammer(10000) | 0                           | 0.0
        createProgrammer(10000) | WORKING_HOURS_PER_MONTH     | 10000.0
        createProgrammer(-1)    | WORKING_HOURS_PER_MONTH     | DEFAULT_SALARY
        createProgrammer(10000) | WORKING_HOURS_PER_MONTH / 2 | 5000.0
        createProgrammer(10000) | WORKING_HOURS_PER_MONTH * 2 | 20000.0
        createProgrammer(10000) | -1                          | 0.0
        createProgrammer(0)     | WORKING_HOURS_PER_MONTH     | 0.0
    }

    def "Accountant calculates employees salary"() {
        def accountant = createAccountant(500)
        def manager = createManager(1000)
        def programmer = createProgrammer(2000)

        when:
        accountant.work WORKING_HOURS_PER_MONTH * 2
        programmer.work WORKING_HOURS_PER_MONTH * 2
        manager.work WORKING_HOURS_PER_MONTH * 2
        accountant.addEmployee programmer
        accountant.addEmployee manager

        then:
        accountant.calculateEmployeesSalary() == 5500
    }

    @Unroll
    def "#employee.getClass().getSimpleName() working hours are summed up"() {
        expect:
        employee.work((int) hours)
        employee.work((int) hours)
        employee.getWorkedRatio() == (double) workedPercentage

        where:
        employee               | hours                       | workedPercentage
        createAccountant(1000) | WORKING_HOURS_PER_MONTH / 2 | 1.0
        createProgrammer(1000) | WORKING_HOURS_PER_MONTH / 2 | 1.0
        createManager(1000)    | WORKING_HOURS_PER_MONTH / 2 | 1.0
    }

}

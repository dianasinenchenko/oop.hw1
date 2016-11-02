package school.lemon.changerequest.java.oop.hw1.employees;

public interface Employee {

    /**
     * Employees working hours per month
     */
    int WORKING_HOURS_PER_MONTH = 8 * 5 * 4; // 8 hours per day, 5 days in a week, 4 weeks in a month
    /**
     * Default employees salary, if no other salary specified
     */
    int DEFAULT_SALARY = 1000;

    /**
     * Add worked hours to current month
     * @param hours amount of worked hours
     */
    void work(int hours);

    /**
     * Get salary for current month
     * @return salary for current month
     */
    double calculateCurrentMonthSalary();

    /**
     * How much hours employee worked in current month in percents.
     * Each employee should work 160 hours per month.
     * In case employee worked 80 hours this method should return 0,5. In case 320h - 2. In case 160h - 1. And so on.
     * @return the ratio of worked hours to the total working hours per month
     */
    double getWorkedRatio();

}


import java.util.*;
class SalaryCalculation
{
    void calculatePay(double salary)
    {
        System.out.println(salary*12);
    }
    void calculatePay(double hourlyRate,double hoursWorked)
    {
        System.out.println(hourlyRate*hoursWorked*12);
    }
}
class SalariedEmployee
{
    String name;
    double salary;
}
class HourlyEmployee
{
    String name;
    double hourlyRate;
    double hoursWorked;
}
public class Payroll
{
    public static void main(String[] args)
    {
        SalariedEmployee s=new SalariedEmployee();
        HourlyEmployee h=new HourlyEmployee();
        SalaryCalculation sc=new SalaryCalculation();
        s.salary=12000l;
        h.hourlyRate=1000l;
        h.hoursWorked=8l;
        sc.calculatePay(s.salary);
        sc.calculatePay(h.hourlyRate,h.hoursWorked);
    }
}

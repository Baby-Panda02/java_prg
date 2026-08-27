class Supervisor
{
    void supervisorWork()
    {
        System.out.println("Supervisor manages the team");
    }
}

class Employee extends Supervisor
{
    void employeeWork()
    {
        System.out.println("Employee does the work");
    }
}

class Subordinate extends Employee
{
    void subordinateWork()
    {
        System.out.println("Subordinate follows instructions");
    }
}

public class Company
{
    public static void main(String[] args)
    {
        Subordinate s = new Subordinate();

        s.supervisorWork();
        s.employeeWork();
        s.subordinateWork();
    }
}

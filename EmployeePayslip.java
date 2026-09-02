import java.util.Scanner;

class Employee
{
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    String mob_number;

    Employee(String emp_name, int emp_id, String address, String mail_id, String mob_number)
    {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mob_number = mob_number;
    }

    void display()
    {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mail_id);
        System.out.println("Mobile Number: " + mob_number);
    }
}

class Programmer extends Employee
{
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    Programmer(String emp_name, int emp_id, String address, String mail_id, String mob_number, double bp)
    {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip()
    {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp()
    {
        System.out.println("\nName of The Employee: " + emp_name + " ***** Payslip *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class AssistantProfessor extends Employee
{
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    AssistantProfessor(String emp_name, int emp_id, String address, String mail_id, String mob_number, double bp)
    {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip()
    {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp()
    {
        System.out.println("\nName of The Employee: " + emp_name + " ***** Payslip *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class AssociateProfessor extends Employee
{
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    AssociateProfessor(String emp_name, int emp_id, String address, String mail_id, String mob_number, double bp)
    {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip()
    {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp()
    {
        System.out.println("\nName of The Employee: " + emp_name + " ***** Payslip *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class Professor extends Employee
{
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    Professor(String emp_name, int emp_id, String address, String mail_id, String mob_number, double bp)
    {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip()
    {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp()
    {
        System.out.println("\nName of The Employee: " + emp_name + " ***** Payslip *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

public class EmployeePayslip
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name, add, mail, mob;
        int id, desg;
        double bp;

        System.out.println("Enter Name of Employee:");
        name = sc.nextLine();

        System.out.println("Enter ID of Employee:");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Address of Employee:");
        add = sc.nextLine();

        System.out.println("Enter Mail ID of Employee:");
        mail = sc.nextLine();

        System.out.println("Enter Mobile Number of Employee:");
        mob = sc.nextLine();

        System.out.println("Enter the Basic Pay:");
        bp = sc.nextDouble();

        System.out.println("Enter the Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. Exit");

        desg = sc.nextInt();

        switch (desg)
        {
            case 1:
                Programmer p = new Programmer(name, id, add, mail, mob, bp);
                p.getPaySlip();
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(name, id, add, mail, mob, bp);
                ap.getPaySlip();
                ap.disp();
                break;

            case 3:
                AssociateProfessor assp = new AssociateProfessor(name, id, add, mail, mob, bp);
                assp.getPaySlip();
                assp.disp();
                break;

            case 4:
                Professor prof = new Professor(name, id, add, mail, mob, bp);
                prof.getPaySlip();
                prof.disp();
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid designation");
        }

        sc.close();
    }
}


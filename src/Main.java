public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "Ali Erdem",
                20000,
                50,
                2012
        );

        Employee.toString(employee);


        double bonus = employee.bonus(employee.workHours);
        double vergi = employee.tax(employee.salary );
        double raiseSalary = employee.raiseSalary(employee.hireYear, employee.salary);
        double toplamMaaş = employee.salary + bonus + raiseSalary-vergi;

        System.out.println("\nVergi: " + vergi + "\nBonus: " + bonus + "\nMaaş Artışı:" + raiseSalary + "\nToplam Maaş: "+toplamMaaş);


    }
}


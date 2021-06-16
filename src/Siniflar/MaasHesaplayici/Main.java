package Siniflar.MaasHesaplayici;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000,45,1985);

        employee.raiseSalary();

        employee.bonus(150);

        employee.tax();

        System.out.println(employee);

    }

}

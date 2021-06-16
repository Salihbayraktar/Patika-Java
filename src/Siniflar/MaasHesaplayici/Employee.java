package Siniflar.MaasHesaplayici;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if(salary < 1000){
            System.out.println("Vergi dilimi içerisinde değilsiniz.\n");
        }
        else {
            System.out.printf("Maaşınızdan %.2f TL vergi kesintisi yapildi.\n", 0.03*salary);
            salary *= 0.97;
        }
    }

    void bonus(int quantity){
        System.out.printf("Tebrikler %d TL ikramiye aldınız.\n",quantity);
        salary+= quantity;  //?????
    }

    void raiseSalary(){
        int workingYear = LocalDate.now().getYear() - hireYear;

        if(workingYear > 19){
            System.out.printf("20 Yıldan fazla bir süredir calistiginiz için maaşınıza %.2f TL zam yapildi.\n", salary*0.15);
            salary *= 1.15;
        }
        else if(workingYear > 9){
            System.out.printf("10 Yıldan fazla bir süredir calistiginiz için maaşınıza %.2f TL zam yapildi.\n", salary*0.1);
            salary *= 1.10;
        }
        else {
            System.out.printf("Bizimle bir süredir calistiginiz için maaşınıza %.2f TL zam yapildi.\n", salary*0.05);
            salary *= 1.05;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}

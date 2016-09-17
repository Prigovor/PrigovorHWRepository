package homeWork1.Firm;

import java.util.Date;

import static java.time.Month.SEPTEMBER;

/**
 * Created by Prigovor on 12.09.2016.
 */
public class Add {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergey", "Doroshenko", 80_000, 02, 2015, "мужчина", "технический отдел");
        Employee employee2 = new Employee("Alina", "Sivoha", 50_000, 05, 2015, "женщина", "финансовый отдел");
        Employee employee3 = new Employee("Vasiliy", "Terkin", 30_000, 02, 2016 , "мужчина", "акустический отдел");
        Employee employee4 = new Employee("Pavel", "Volia", 40_000, 01, 2016, "мужчина", "маркетинговый отдел");

        Firm firm = new Firm();
        firm.addEmployees(employee1);
//        firm.printAllEmployees();

        firm.addEmployees(employee2);
//        firm.printAllEmployees();

        firm.addEmployees(employee3);


        firm.addEmployees(employee4);
        firm.printSortAllEmp();
        firm.printAllEmployees();

    }
}

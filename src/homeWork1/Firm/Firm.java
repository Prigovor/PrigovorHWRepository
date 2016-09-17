package homeWork1.Firm;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prigovor on 10.09.2016.
 */
public class Firm {
    private String nameFirm;
    private String address;
    private Integer salaryAccount;//зарплатный счет
    private List<Employee> employee;

    public Firm(String nameFirm, String address, Integer salaryAccount) {
        this.nameFirm = nameFirm;
        this.address = address;
        this.salaryAccount = salaryAccount;
        employee = new ArrayList<>();
    }

    Firm() {
        employee = new ArrayList<>();
    }

    void printAllEmployees() {
        for (Employee employeeVar : employee) {
            System.out.println(employeeVar);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
//        for (int i = 0; i < employee.size(); i++) {
//            System.out.println(employee.get(i));
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        }
    }

    void printSortAllEmp() {
        int left = 0, right = employee.size() - 1;
        Employee tmp = null;

        do {
            for (int i = left; i < right; i++) {
                if (employee.get(i).getRate() > employee.get((i + 1)).getRate()) {
                    tmp = employee.get(i);
                    employee.set(i, employee.get((i + 1)));
                    employee.set((i + 1), tmp);
                }
            }
            right--;
            for (int j = right; j > left; j--) {
                if (employee.get(j).getRate() < employee.get((j - 1)).getRate()) {
                    tmp = employee.get(j);
                    employee.set(j, employee.get((j - 1)));
                    employee.set((j - 1), tmp);
                }
            }
            left++;
        } while (left <= right);
    }

    void addEmployees(Employee emp) {
        employee.add(emp);
    }

    void giveSalaryForAll() {
        for (Employee empVar : employee) {
            empVar.setCardAccount(empVar.getCardAccount() + empVar.getRate());
            System.out.println("Сотруднику " + empVar.getNameEmployee() + " начислено " + empVar.getRate() + "$");
            System.out.println("На счету " + empVar.getCardAccount() + "$");

            salaryAccount -= empVar.getRate();
            System.out.println("На счету фирмы осталось " + salaryAccount + "$");
        }
    }

    void calcVocations() {
        Long vocation ;
        LocalDate date = LocalDate.now();

        for (Employee empVar : employee) {
            Period period = Period.between(empVar.getJoining(), date);
            if (period.toTotalMonths() > 6) {
                System.out.println("Колличество отпускных дней: " + empVar.getNameEmployee() + " - " + (vocation = period.toTotalMonths() * 2));
            } else {
                System.out.println("Колличество отпускных дней: " + empVar.getNameEmployee() + " - 0");
            }
        }
    }
}

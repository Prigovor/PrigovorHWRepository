package homeWork1.Firm;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

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
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    void printSortAllEmp() {
        int left = 0, right = employee.size() - 1;
        Employee tmp;

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
}

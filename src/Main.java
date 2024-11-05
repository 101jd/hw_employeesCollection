import employees.Employee;
import handbook.EmployeesHandBook;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeesHandBook book = new EmployeesHandBook(
                new HashSet<>(
                        Set.of(
                                new Employee("a", 1, 1, "314"),
                                new Employee("b", 1, 2, "271")
                        )
                )
        );

        System.out.println(book.findPhoneByName("b"));
        System.out.println(book.findByTable(1));
    }
}
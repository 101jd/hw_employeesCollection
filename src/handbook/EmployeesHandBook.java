package handbook;

import employees.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeesHandBook {
    Set<Employee> employees;

    public EmployeesHandBook(){
        employees = new HashSet<>();
    }

    public EmployeesHandBook(Set<Employee> employees){
        this.employees = employees;
    }

    public boolean addEmployee(Employee employee){
        return employees.add(employee);
    }

    public Set<Employee> findByStage(int stage){
        return employees.stream()
                .filter(employee -> employee.getStage() == stage)
                .collect(Collectors.toSet());
    }

    public Set<String> findPhoneByName(String name){
        return employees.stream().filter(employee -> employee.getName().equals(name))
                .map(employee -> employee.getPhoneNumber()).collect(Collectors.toSet());
    }

    public Employee findByTable(int table){
        return employees.stream().filter(employee -> employee.getTable() == table).findAny().orElse(null);
    }
}

package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainMethod {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sai", "IT", 80000),
                new Employee("Ravi", "HR", 50000),
                new Employee("John", "IT", 90000),
                new Employee("Priya", "Finance", 70000),
                new Employee("Kiran", "HR", 60000)
        );

        System.out.println("Group Employees by Department");
        System.out.println("-------------------------------");

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        grouped.forEach((dept, empList) -> {
            System.out.println(dept + " -> " +
                    empList.stream().map(Employee::getName).toList());
        });
        System.out.println();
        System.out.println("Sort Employees by Salary");
        System.out.println("-------------------------");

        List<Employee> sortedAscending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(sortedAscending);

        List<Employee> sortedDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();

        System.out.println(sortedDescending);

        System.out.println();
        System.out.println("Group by department AND sort each group by salary");
        System.out.println("---------------------------------------------------");

        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary)).toList()
                        )));

        System.out.println(result);

        System.out.println();
        System.out.println("Sort employees by salary descending and name ascending");
        System.out.println("-------------------------------------------------------");

        List<Employee> answer = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(answer);
    }
}

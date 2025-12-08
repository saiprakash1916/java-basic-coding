package exceptions;

import java.util.Scanner;

class EmployeeNotFoundException extends Exception{
    private final int employeeID;

    public EmployeeNotFoundException(int employeeID, String message){
        super(message);
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}

class EmployeeService{
    public void findEmployee(int id) throws EmployeeNotFoundException{
        if (id != 1001){
            throw new EmployeeNotFoundException(id, "Employee not found in DB");
        }
        System.out.println("Employee found in DB..");
    }
}
public class customExceptionWithExtraFields {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee Id: ");
        int employeeID = scanner.nextInt();
        EmployeeService employeeService = new EmployeeService();
        try {
            employeeService.findEmployee(employeeID);
        }catch (EmployeeNotFoundException e){
            System.out.println(e.getMessage() + " ID = " + e.getEmployeeID());
        }
    }
}

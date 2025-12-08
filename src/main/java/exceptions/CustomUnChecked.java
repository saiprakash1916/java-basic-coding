package exceptions;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}

class VotingSystem{
    public void validateAge(int age){
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote!");
        }
        System.out.println("Eligible to vote!");
    }
}

public class CustomUnChecked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.validateAge(age);
    }
}

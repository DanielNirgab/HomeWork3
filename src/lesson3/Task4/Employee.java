package lesson3.Task4;

public class Employee {
    String firstName;
    String secondName;

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void getItem (int countOfItem) {
        if (VodkaHouse.issueItem(countOfItem)) {
            System.out.println("Ура я испортил водку!");
        }
    }


}

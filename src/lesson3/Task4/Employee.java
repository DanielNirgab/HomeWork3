package lesson3.Task4;

public class Employee {
    private String firstName;
   private String secondName;
  private int employeeItem = 0;

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

    public int getItem (int countOfItem) {
        if (VodkaHouse.issueItem(countOfItem)) {
            System.out.println("Ура я испортил водку!");
            employeeItem += countOfItem;
        }
        System.out.println("У работника в журнале " + employeeItem + " водки");
        System.out.println("--------------------------------------------------");
        return employeeItem;
    }


}

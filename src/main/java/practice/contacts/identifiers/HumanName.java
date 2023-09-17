package practice.contacts.identifiers;

public class HumanName {
    private String firstName, lastName;

    public HumanName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHumanName(){
        return firstName + " " + lastName;
    }
}

package Inheritance.mankind;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
       this.setFirstName(firstName);
       this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalStateException("Expected upper case letter!Argument: firstName");
        }
        if (firstName.length() < 4) {
            throw new IllegalStateException("Expected length at least 4 symbols!Argument: firstName");
        }
        
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalStateException("Expected upper case letter!Argument: lastName");
        }
        if (lastName.length() < 4) {
            throw new IllegalStateException("Expected length at least 4 symbols!Argument: lastName");
        }

        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s",this.firstName)).append(System.lineSeparator());
        sb.append(String.format("Last Name: %s",this.lastName)).append(System.lineSeparator());
        return sb.toString();
    }
}

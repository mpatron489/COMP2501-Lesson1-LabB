package comp2501.lesson1.lab1b;

public class Name {

    private String firstName;
    private String lastName;

    public Name(final String firstName, final String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateFirstName(String firstNameUpdate){
        this.firstName = firstNameUpdate;
    }

    public void updateLastName(String lastNameUpdate){
        this.lastName = lastNameUpdate;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return firstName;
    }

    public String getFullName(){
        return (firstName  + ' ' + lastName);
    }

    public String getInitials(){
        return (firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".");
    }
}

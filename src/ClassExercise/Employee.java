package ClassExercise;

public class Employee {
    private String firstname;
    private String lastname;
    private String salary;
    private Address homeaddress;
    private Address workaddress;


    public Employee(String firstname, String lastname, Address homeaddress, Address workaddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homeaddress = homeaddress ;
        this.workaddress = workaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Address getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(Address homeaddress) {
        this.homeaddress = homeaddress;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

//    @Override
//    public String toString (){
//        return "Employee Name:" this.firstname + " " + this.lastname + "\nsalary" + this.salary +
//                "\n workaddress " + getWorkaddress().getStreet() + " " + getWorkaddress().getZip();
    }




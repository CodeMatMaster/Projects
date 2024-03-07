public class Employee extends Person {
private double salary;
private Date employmentDate;

public Employee (String firstName, String lastName, Date birthplace, double salary, Date employmentDate) {

super(lastName, firstName, birthplace);
this.salary = salary;
this.employmentDate = employmentDate;


}



public void setSalary(double salary){

this.salary = salary;

}




public double getSalary(){

return salary;
}




public Date getEmploymentDate(){

return employmentDate;

}



public void setEmploymentDate(Date employmentDate){
        this.employmentDate = employmentDate;


}



public String toString(){

return          "\nsalary = " + salary +
                "\nbirth = " + getBirthDate() +
                "\nhired = " + employmentDate;



}





}


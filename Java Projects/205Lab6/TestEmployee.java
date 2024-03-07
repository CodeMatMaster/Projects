public class TestEmployee {
    public static void main(String[] args) {
        Date hireDate = new Date(); //Default Contructor Feb. 5, 2021
        Date birthDate = new Date(80, 2, 8); // March 8, 1980

        Employee newEmployee = new Employee("Morris", "Brown", birthDate, 40000.0, hireDate);

        System.out.println(newEmployee);
    }
}


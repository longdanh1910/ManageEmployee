public class Company {
    public Employee[] employees;
    public int numberOfEmployees;

    public Company(int MaxNumberOfEmployees) {
        employees = new Employee[MaxNumberOfEmployees];
        numberOfEmployees = 0;
    }

    public void addEmployee(Employee employee) {
        if (numberOfEmployees < employees.length) {
            employees[numberOfEmployees] = employee;
            numberOfEmployees++;
        } else {
            System.out.println("Company is full");
        }
    }

    public double calculateAverageSalary() {
        double totalSalary = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            totalSalary += employees[i].calculateSalary();
        }
        return totalSalary / numberOfEmployees;
    }

    public void FullTimeEmployHasLowSalary() {
        double averageSal = calculateAverageSalary();

        for (int i = 0; i < numberOfEmployees; i++) {
            if (employees[i] instanceof FullTimeEmployee && employees[i].calculateSalary() < averageSal) {
                System.out.println(employees[i].getInfo()+" with salary: " +employees[i].calculateSalary());
            }
        }
    }
    public double sumPTEmployeeSalary(){
        double sumPTEmploySalary = 0;
        for(int i=0; i<numberOfEmployees; i++){
            if(employees[i] instanceof PartTimeEmployee){
                sumPTEmploySalary += employees[i].calculateSalary();
            }
        }
        return sumPTEmploySalary;
    }

    public void arrangeFTEmploySalary(){
        for(int i=0; i<numberOfEmployees-1; i++){
            for(int j=i+1; j<numberOfEmployees; j++){
                if(employees[i].calculateSalary() > employees[j].calculateSalary()){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Full Time Employee sorted by Salary: ");
        for(int i=0; i<numberOfEmployees; i++){
            if(employees[i] instanceof FullTimeEmployee){
                System.out.println(employees[i].getInfo()+" with salary: "+employees[i].calculateSalary());
            }
        }
    }



}

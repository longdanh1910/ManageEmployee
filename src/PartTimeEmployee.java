public class PartTimeEmployee extends Employee{
    private double workingHours;
    public PartTimeEmployee(String ID, String name, int age, String phone, String email, double workingHours){
        super(ID, name, age, phone, email);
        this.workingHours = workingHours;
    }
    public double getWorkingHours(){
        return workingHours;
    }
    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    }
    public double calculateSalary(){
        return workingHours * 100000;
    }
}

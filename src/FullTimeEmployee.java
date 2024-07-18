public class FullTimeEmployee extends Employee {
    private double bonus;
    private double fine;
    private double salary;
    public FullTimeEmployee(String ID, String name, int age, String phone, String email, double salary, double bonus, double fine){
        super(ID, name, age, phone, email);
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateSalary() {
        return salary + bonus - fine;
    }
}

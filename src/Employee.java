public class Employee {
    private String ID;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Employee(String ID, String name, int age, String phone, String email){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double calculateSalary(){
        return 0;
    }
    public String getInfo(){
        return "ID: " + ID + ", Name: " + name + ", Age: " + age + ", Phone: " + phone + ", Email: " + email;
    }
}

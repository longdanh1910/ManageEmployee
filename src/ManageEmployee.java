public class ManageEmployee {
    public static void main(String[] args) {
        FullTimeEmployee FTEmploy1 = new FullTimeEmployee("001", "Vu Phuc Ky", 24, "012345678", "kycucvl@gmail.com", 5000000, 1000000, 500000);
        FullTimeEmployee FTEmploy2 = new FullTimeEmployee("002", "Nguyen Danh Long", 24, "0347021887", "longpro@gmail.com", 5000000, 1000000, 0);
        FullTimeEmployee FTEmploy3 = new FullTimeEmployee("003", "Nguyen Minh Tuan", 22, "0987382019", "tuantaitu@gmail.com", 5000000, 1000000, 300000);

        PartTimeEmployee PTEmploy1 = new PartTimeEmployee("004", "Nguyen Duc Duy", 24, "0945382019", "duyiphone@gmail.com", 100);
        PartTimeEmployee PTEmploy2 = new PartTimeEmployee("005", "Le Van Chuyen", 21, "0125382019", "chuyensegay@gmail.com", 50);

        Company company = new Company(10);
        company.addEmployee(FTEmploy1);
        company.addEmployee(FTEmploy2);
        company.addEmployee(FTEmploy3);
        company.addEmployee(PTEmploy1);
        company.addEmployee(PTEmploy2);

        System.out.println("Average Salary: " + company.calculateAverageSalary() + "đ");
        System.out.println("FullTime Employees has salary lower than average salary: " );
        company.FullTimeEmployHasLowSalary();
        System.out.println("Sum of Partime Employees: "+company.sumPTEmployeeSalary());
        company.arrangeFTEmploySalary();

    }

}
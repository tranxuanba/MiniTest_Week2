package demoStaff;

public class FullTimeEmployee extends Staff {
    private int bonus;
    private int fines;
    private int hardSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int bonus, int fines, int hardSalary) {
        this.bonus = bonus;
        this.fines = fines;
        this.hardSalary = hardSalary;
    }

    public FullTimeEmployee(int employeeCode, String name, int age, int phoneNumber, String email, int bonus, int fines, int hardSalary) {
        super(employeeCode, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fines = fines;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "demoStaff.FullTimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", hardSalary=" + hardSalary +
                '}' + super.toString();
    }
}

package demoStaff;

public class PartTime extends Staff{
    private int workingHours;

    public PartTime() {
    }

    public PartTime(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTime(int employeeCode, String name, int age, int phoneNumber, String email, int workingHours) {
        super(employeeCode, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "demoStaff.PartTime{" +
                "workingHours=" + workingHours +
                '}' + super.toString();
    }
}

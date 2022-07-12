import demoStaff.FullTimeEmployee;
import demoStaff.PartTime;
import demoStaff.Staff;

public class StaffManager {
    public static void main(String[] args) {
        Staff[] staff = new Staff[9];
        staff[0] = new FullTimeEmployee(1, "ba", 27, 1234454, "thoitran23", 120, 10, 300000);
        staff[1] = new FullTimeEmployee(2, "ba", 25, 123454, "thoitran434", 124, 14, 303244);
        staff[2] = new FullTimeEmployee(3, "ba", 26, 1234435, "thoitran534245", 124, 16, 300230);
        staff[3] = new FullTimeEmployee(4, "ba", 28, 1234254, "thoitran5234", 126, 18, 302540);

        staff[4] = new PartTime(5, "chim", 22, 132314, "thoitran", 12);
        staff[5] = new PartTime(6, "chim", 22, 132314, "thoitran", 13);
        staff[6] = new PartTime(7, "chim", 22, 132314, "thoitran", 10);
        staff[7] = new PartTime(8, "chim", 22, 132314, "thoitran", 8);
        staff[8] = new PartTime(9, "chim", 22, 132314, "thoitran", 9);

        // tính lương thực lĩnh của nhân viên fullTime;
        checkMoneyReceivedFullTime(staff);

        // tinh lương thực lĩnh của nhân viên passTime;
        checkMoneyReceivedPassTime(staff);

        // liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
        //System.out.println(getAverage(staff));
        thanAverage(staff);

        // số lương phải trả cho tất cả các nhân viên bán thời gian.
        System.out.println(sumMoneyReceivedPassTime(staff));

        //sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
        System.out.println(sortFullTime(staff));
    }

    public static void checkMoneyReceivedFullTime(Staff staff[]) {
        for (int i = 0; i < staff.length; i++) {
           if (staff[i] instanceof FullTimeEmployee) {
              double bonus1 = ((FullTimeEmployee)staff[i]).getBonus();
              double fines1 = ((FullTimeEmployee)staff[i]).getFines();
              double hardSalary1 = ((FullTimeEmployee)staff[i]).getHardSalary();
               System.out.println(hardSalary1 + (bonus1 - fines1));
           }
        }
    }

    public static void checkMoneyReceivedPassTime(Staff staff[]) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof PartTime) {
                double workingHours1 = ((PartTime)staff[i]).getWorkingHours();
                System.out.println(workingHours1 * 100000);
            }
        }
    }

    public static double getAverage(Staff staff[]) {
        double sumHardSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof FullTimeEmployee) {
                double hardSalary1 = ((FullTimeEmployee)staff[i]).getHardSalary();
                sumHardSalary += hardSalary1;
            }
        }
        return sumHardSalary / 4;
    }

    public static void thanAverage(Staff staff[]) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof FullTimeEmployee) {
                if (((FullTimeEmployee)staff[i]).getHardSalary() < getAverage(staff)) {
                    System.out.println(((FullTimeEmployee)staff[i]).toString());
                }
            }
        }
    }

    public static double sumMoneyReceivedPassTime(Staff staff[]) {
        double sumMoneyReceived = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof PartTime) {
                double workingHours1 = ((PartTime)staff[i]).getWorkingHours();
                sumMoneyReceived += workingHours1 * 100000;
            }
        }
        return sumMoneyReceived;
    }

    public static Staff[] sortFullTime(Staff staff[]) {
        double temp = ((FullTimeEmployee)staff[0]).getHardSalary();
        for (int i = 0; i < staff.length - 1; i++) {
            if (staff[i] instanceof FullTimeEmployee) {
                if (((FullTimeEmployee)staff[i]).getHardSalary() < getAverage(staff)) {
                    for (int j = i + 1; j < staff.length; j++) {
                        if (((FullTimeEmployee)staff[i]).getHardSalary() < ((FullTimeEmployee)staff[j]).getHardSalary()) {
                            temp = ((FullTimeEmployee)staff[j]).getHardSalary();
                            //((demoStaff.FullTimeEmployee)staff[j]).getHardSalary() = ((demoStaff.FullTimeEmployee)staff[i]).getHardSalary();
                           // ((demoStaff.FullTimeEmployee)staff[i]).getHardSalary() = temp;
                        }
                    }
                }
            }
        }
        return staff;
    }
}


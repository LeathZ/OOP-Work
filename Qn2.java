class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing HR tasks");
    }
}

public class Qn2 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: $" + hr.getSalary());
    }
}
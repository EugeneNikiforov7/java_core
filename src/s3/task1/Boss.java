package s3.task1;

public class Boss extends Employee {
    public int isBoss;

    public Boss(String name, String midName, String surName, String position, String phone, int salary, int birth, int isBoss) {
        super(name, midName, surName, position, phone, salary, birth);
        this.isBoss = isBoss;
    }


    public static void incSalary(Employee[] emp, int age, int amount) {
        for (int i = 0; i < emp.length; i++) {
            if (!emp[i].getClass().getSimpleName().equals("Boss")) {
                if (emp[i].getAge() > age) {
                    emp[i].setSalary(emp[i].getSalary() + amount);
                }
            }
        }
    }
}

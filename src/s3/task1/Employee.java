package s3.task1;

public class Employee {
    private static int CURRENT_YEAR = 2024;
    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private int salary;
    private int birth;

    public Employee(String name, String midName, String surName, String position, String phone, int salary, int birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

//    public static void incSalary(Employee[] emp, int age, int amount){
//        for (int i = 0; i < emp.length; i++) {
//            if (emp[i].getAge() > age) {
//                emp[i].setSalary(emp[i].getSalary()+amount);
//            }
//        }
//    }

    public static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++) {
            result += emp[i].getSalary();
        }
        return result / emp.length;
    }

    public static float averageAge(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++) {
            result += emp[i].getAge();
        }
        return result / emp.length;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void info() {

        System.out.printf("Employee {name='%s', midName='%s', surName='%s', " +
                        "position='%s', phone='%s', salary='%d', age='%d'}",
                name, midName, surName, position, phone, salary, getAge());
        System.out.println();
//        System.out.println("Employee{" +
//                "name='" + getName() + '\'' +
//                ", midName='" + midName + '\'' +
//                ", surName='" + surName + '\'' +
//                ", position='" + position + '\'' +
//                ", phone='" + phone + '\'' +
//                ", salary='" + salary + '\'' +
//                ", age='" + getAge() + '\'' +
//                '}');
    }
//    public String info(Employee eee) {
//        String str = String.format("Employee {name='%s', midName='%s', surName='%s', " +
//                        "position='%s', phone='%s', salary='%d', age='%d'}",
//                name, midName, surName, position, phone, salary, getAge());
//        //System.out.println(str);
//        return str;
//}
//public void incSalary(Employee[] emp, int age, int amount){
//    for (int i = 0; i < emp.length; i++) {
//        if (emp[i].getAge() > age) {
//            emp[i].setSalary(emp[i].getSalary()+amount);
//        }
//    }
//}

}
package s3.task1;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("qwe", "asd", "zxc", "pos1", "123", 110000, 1991);
        Employee emp2 = new Employee("rty", "asd", "zxc", "pos2", "223", 120000, 1972);
        Employee emp3 = new Employee("fgh", "asd", "zxc", "pos3", "323", 130000, 1993);
        Employee emp4 = new Employee("uio", "asd", "zxc", "pos4", "423", 140000, 1974);
        Employee emp5 = new Employee("jkl", "asd", "zxc", "pos5", "523", 150000, 1995);
        Boss boss1 = new Boss("zxc", "zxc", "zxc", "boss", "787", 250000, 1985, 1);

        Employee[] company = new Employee[] {emp1, emp2, emp3, emp4, emp5, boss1};
        //Employee[] company = new Employee[] {new Employee("qwe", "asd", "zxc", "pos1", "123", 110000, 1991),
                //new Employee("rty", "asd", "zxc", "pos2", "223", 120000, 1992)};
    //    System.out.println(company[1].info(company[1]));
//        for (Employee value : company) {
//            value.info();
//        }
        Boss.incSalary(company, 33, 7000);

        for (Employee employee : company) {
            System.out.println(employee.getClass()+ " " + employee.getClass().getSimpleName());
            employee.info();
        }

        System.out.println("average age: " +Employee.averageAge(company) + ", average salary: " + Employee.averageSalary(company));

    }

//    public void incSalary(Employee[] emp){
//        for (int i = 0; i < emp.length; i++) {
//            if (emp[i].getAge() > 45) {
//                emp[i].setSalary(emp[i].getSalary()+5000);
//            }
//        }
//    }


}

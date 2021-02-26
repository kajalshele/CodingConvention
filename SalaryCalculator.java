import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> employeeList=new LinkedList<>();
        for(int index=0;index<3;index++){
            int id=sc.nextInt();
            double salary=sc.nextDouble();
            employeeList.add(new Employee(id,salary));
        }
        employeeList.stream()
                .forEach(object-> System.out.println(object.calculateTax()));
    }

}

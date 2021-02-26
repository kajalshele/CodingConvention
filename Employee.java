public class Employee
{
    int id;
    double salary=0.0;

    public Employee(int Id, double salary) {
        this.id = Id;
        this.salary=salary;
    }

    public Employee() { }

    double calculateTax(){
           if(this.salary > 500000.00 && this.salary < 1000000)
               return this.salary*0.1;
           else if(this.salary >1000000.00 && this.salary < 1500000)
               return this.salary*0.2;
           else
               return this.salary*0.3;
    }

}

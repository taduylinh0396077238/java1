import javax.lang.model.element.Name;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;

    public Employee(){
        id = 10;
        lastName = "Tạ";
        firstName = "Duy Linh";
        salary = 50000000;

    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getName() {
        return lastName + firstName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary1){
        this.salary = salary1;
    }
    public int getAnnuaSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
         salary+= (salary*percent)/100;
         return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ']';
    }

    public static void main(String[] args) {
        Employee luong = new Employee();
        System.out.println("Mã của bạn " + luong.id);
        System.out.println("Họ" + luong.firstName);
        System.out.println("Tên" + luong.lastName);
        System.out.println("Lương" + luong.salary);
    }
}

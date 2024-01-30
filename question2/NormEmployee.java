import java.util.ArrayList;
import java.util.List;

public class NormEmployee extends EmployeeAbs{
    private String name;
    private String position;
    private int salary;
    private List<EmployeeAbs> childEmp;
    
    public NormEmployee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.childEmp = new ArrayList<>();
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String dept) {
        this.position = dept;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
	public List<EmployeeAbs> getChildrenEmp(){
		return childEmp;
	}

    @Override
    public String toString() {
        return ("       Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    @Override
	public void generateTree() {
        System.out.println(toString());
	}
}
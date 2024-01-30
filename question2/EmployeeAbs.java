import java.util.List;

public abstract class EmployeeAbs {
	public abstract String getName();
	public abstract String getPosition();
    public abstract int getSalary();

	public abstract void setName(String tanameg);
    public abstract void setPosition(String dept);
    public abstract void setSalary(int salary);

	public void addChildEmp(EmployeeAbs emp){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void removeChildEmp(EmployeeAbs emp){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	public List<EmployeeAbs> getChildrenEmp(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	//operation for both individual and composite
	public abstract String toString();
    public void generateTree(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
}

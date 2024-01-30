public class App {
    public static void main(String[] args) {
        EmployeeAbs settha = new CEOEmployee("Settha", "CEO", 500000);
        EmployeeAbs kamphaka = new HeadEmployee("Kamphaka", "Head Sales", 300000);
        EmployeeAbs ungink = new HeadEmployee("UngInk", "Head Marketing", 300000);
        EmployeeAbs wiroj = new NormEmployee("Wiroj", "Sales", 150000);
        EmployeeAbs weeranan = new NormEmployee("Weeranan", "Sales", 150000);
        EmployeeAbs oak = new NormEmployee("oak", "Marketing", 200000);
        EmployeeAbs aem = new NormEmployee("aem", "Marketing", 200000);

        settha.addChildEmp(kamphaka);  
        settha.addChildEmp(ungink);   
        kamphaka.addChildEmp(wiroj);
        kamphaka.addChildEmp(weeranan);
        ungink.addChildEmp(oak);
        ungink.addChildEmp(aem);

        printAllEmployee(settha);
    }
    public static void printAllEmployee(EmployeeAbs ceo) {
        ceo.generateTree();
    }
}

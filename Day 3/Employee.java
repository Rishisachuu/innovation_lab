class Employee{
    private int id;
    private int salary;
    private static int min_salary=30000;
    public Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int newSalary){
        if(newSalary>=min_salary){
            this.salary=newSalary;
        }
        else{
            System.out.println("error"+min_salary);
        }
    }
    public int getid(){
        return id;
    }
    public static void main(String[] args){
        Employee emp=new Employee(107,100000);
        System.out.println("Current Salary:"+ emp.getSalary());
        emp.setSalary(60000);
        System.out.println("Updated Salary:"+ emp.getSalary());
        emp.setSalary(25000);
    }
}

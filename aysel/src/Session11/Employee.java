package Session11;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary * 12;
    }
    public void updateSalary(double newSalary){
        this.salary=newSalary;
    }
    public void increasedSalary(double percentage){
        if(percentage>0){
            this.salary+=this.salary*(percentage/100);
        }

    }
    public  void  showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Monthly salary: "+salary);
        System.out.println("Annual salary: "+ calculateSalary());
    }

}

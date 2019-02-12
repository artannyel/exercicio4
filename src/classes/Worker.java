package classes;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private ArrayList <HourContract> contract;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public Worker() {
        this.name = null;
        this.level = null;
        this.baseSalary = 0.0;
        this.contract = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void addContract(HourContract contract){
        this.contract.add(contract);
    }
    
    public void removeContract(HourContract contract){
        this.contract.remove(contract);
    }
    
    public double income(Integer year, Integer month){
        double valor = 0.0;
        
        return valor;
    }
}

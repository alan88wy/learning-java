package com.demo.data;

import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;
    
    public Manager() {}
    
    public Manager(String name, double salary, String department, LocalDate startDate) {
    	super(name, salary, department, startDate);
    	bonus = 0.00;
    }
    
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
}

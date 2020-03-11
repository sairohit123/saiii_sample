package sai11;

public class FullTime extends CalculateSalary {

	@Override
	double SalaryCalculation(double salary) {
		salary=salary*0.02;
		return salary;
	}
	

}

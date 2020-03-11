package sai11;

public class PartTime extends CalculateSalary{

	@Override
	double SalaryCalculation(double salary) {
		salary=salary*0.5;
		return salary;
	}
	

}

package comm.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private double Salary;

	



	public String displayEmpD() {
		return EmployeeId+EmployeeName+Salary;
	}
}

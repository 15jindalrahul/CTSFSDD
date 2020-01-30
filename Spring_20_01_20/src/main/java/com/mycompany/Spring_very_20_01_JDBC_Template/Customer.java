package com.mycompany.Spring_very_20_01_JDBC_Template;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Component
public class Customer {

	private int customerId;
	private String firstName;
	private int salary;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

package com.abc.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.abc.entity.Employees;

@Component
public class EmployeeDao {
	private static List<Employees> employee;

	static {
		employee = new ArrayList() {
			{
				add(new Employees("23", "James", "Male"));
				add(new Employees("2", "Emily", "Female"));
				add(new Employees("24", "Kobe", "Male"));
			}
		};
	}

	public static List<Employees> getEmployee() {
		return employee;
	}

}

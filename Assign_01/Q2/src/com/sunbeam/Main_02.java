
package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Main_02 {

	public static void main(String[] args) {
		Employee_02[] e = new Employee_02[10];

		e[0] = new Employee_02(1, "name1", 1000);
		e[1] = new Employee_02(2, "name2", 2000);
		e[2] = new Employee_02(3, "name3", 3000);
		e[3] = new Employee_02(4, "name4", 4000);
		e[4] = new Employee_02(5, "name5", 5000);
		e[5] = new Employee_02(6, "name6", 6000);
		e[6] = new Employee_02(7, "name7", 7000);
		e[7] = new Employee_02(8, "name8", 8000);
		e[8] = new Employee_02(9, "name9", 9000);
		e[9] = new Employee_02(10, "name10", 10000);

		for (Employee_02 ele : e) {
			System.out.println(ele);

		}

		System.out.println("enter id=");
		int id = new Scanner(System.in).nextInt();
		int i = (searchById(id, e));
		if (i >= 0) {
			System.out.println("id is found \n" + e[i]);
		} else {
			System.out.println("id is not found");
		}
		System.out.println("-----------------------------------------");
		System.out.println("enter name=");
		String name = new Scanner(System.in).next();

		int j = searchByName(name, e);
		if (j >= 0) {
			System.out.println("name  is found \n" + e[j]);
		} else {
			System.out.println("name is not found");
		}
		System.out.println("-----------------------------------------");

		System.out.println("enter salry=");
		int salary = new Scanner(System.in).nextInt();
		int z = searchBySalary(salary, e);
		if (z >= 0) {
			System.out.println("salary  is found \n" + e[z]);
		} else {
			System.out.println("salary is not found");
		}

	}

	public static int searchById(int id, Employee_02[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getId() == id) {
				return i;
			}
		}
		return -1;

	}

	public static int searchByName(String name, Employee_02[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;

	}

	public static int searchBySalary(int salary, Employee_02[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getSalary() == salary) {
				return i;
			}
		}
		return -1;

	}

}

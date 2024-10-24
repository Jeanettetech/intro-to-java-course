package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class InterfacesAssignment {
	// 1.Whimsical Toys Inc (WTI) needs to record the names of all its employees.
	// Every month, an employee will be chosen at random from these records to
	// receive a free toy.

	// Best-suited interface: List
	// can grow in size
	// uses index which can be used to select a name at random

	public static String getRandomEmployeeName() {
		List<String> employeeNames = new ArrayList<>();
		// Add employee names
		employeeNames.add("Hannah");
		employeeNames.add("Bill");
		employeeNames.add("Jeanette");
		employeeNames.add("Bill");

		// Random employee
		Random rand = new Random();
		String randomEmployee = employeeNames.get(rand.nextInt(employeeNames.size()));
		// System.out.println(randomEmployee);
		return randomEmployee;

	}

	// WTI has decided that each new product will be named after an employee but
	// only first names will be used,
	// each name will be used only once. Prepare a list of unique first names

	// Best-suited interface: Set
	// Set ensures that all elements are unique, can be used to store first names
	// without duplicates.

	public static Set<String> getFirstNames(List<String> employeeNames) {
		// Add first names from the provided list
		Set<String> firstNames = new HashSet<>(employeeNames);
		System.out.println(firstNames);
		return firstNames;
	}

	// WTI decides that it only wants to use the most popular names for its toys.
	// Count up the number of employees who have each first name.
	//
	// Best-suited interface: Map
	// Map allows key value pairs.
	// using HashMap where the key is the first name and the value is the count.

	public static Map<String, Integer> countEmployeeNames(List<String> employeeNames) {
		Map<String, Integer> nameCounts = new HashMap<>();

		// Count names
		for (String name : employeeNames) {
			nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
		}
		System.out.println(nameCounts);
		return nameCounts;
	}

	// WTI acquires season tickets for the local lacrosse team, to be shared by
	// employees.
	// Create a waiting list for this popular sport.

	// Best-suited interface: Queue
	// Queue usesFIFO (First-In-First-Out) principle so is suitable for waiting list

	private static Queue<String> waitingList = new LinkedList<>();

	public static void addToWaitingList(String employee) {
		waitingList.add(employee);
	}

	public static String nextInLine() {
		return waitingList.poll(); // Retrieves and removes the head
	}

}

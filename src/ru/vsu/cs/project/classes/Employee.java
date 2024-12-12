package ru.vsu.cs.project.classes;

public abstract class Employee {
	protected String name;
	protected String email;
	protected int counter;
	protected int ssNo;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getSsNo() {
		throw new UnsupportedOperationException();
	}
}
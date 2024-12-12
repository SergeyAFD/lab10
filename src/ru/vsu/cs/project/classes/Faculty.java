package ru.vsu.cs.project.classes;

public class Faculty {

	private String name;
	private Institute[] institutes;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

	public void addInstitute(Institute institute) {
		throw new UnsupportedOperationException();
	}

	public void removeInstitute(Institute institute) {
		throw new UnsupportedOperationException();
	}

	public Faculty(String name) {
		this.name = name;
	}


}
package ru.vsu.cs.project.classes;

public class ResearchAssociate extends Employee {

	protected String fieldOfStudy;
	protected Project[] projects;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public Project[] getProjects() {
		return this.projects;
	}

	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	public void startProject(Project project) {
		throw new UnsupportedOperationException();
	}

	public void finishProject(Project project) {
		throw new UnsupportedOperationException();
	}

	public ResearchAssociate(int ssNo, String name, String fieldOfStudy) {
		this.ssNo = ssNo;
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
	}


}
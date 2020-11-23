package model;

import java.util.*;

public class FootballClub {

	private ArrayList<Employee> employees;
	private Team aTeam;
	private Team bTeam;
	private Coach[][] officines;
	private String name;
	private String NIT;
	private String fundationDate;

	public FootballClub(String name, String NIT, String fun, Team aTeam, Team bTeam) {
		this.name = name;
		this.NIT = NIT;
		fundationDate = fun;
		this.aTeam = aTeam;
		this.bTeam = bTeam;
		officines = new Coach[6][6];
		employees = new ArrayList<Employee>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNIT() {
		return NIT;

	}

	public void setNIT(String NIT) {
		this.NIT = NIT;
	}

	public String getFundationDate() {
		return fundationDate;
	}

	public void setFundationDate(String fundationDate) {
		this.fundationDate = fundationDate;
	}

	public Coach[][] getOfficines() {
		return officines;
	}

	public void setOfficines(Coach[][] officines) {
		this.officines = officines;
	}

	public Team getaTeam() {
		return aTeam;
	}

	public void setaTeam(Team aTeam) {
		this.aTeam = aTeam;
	}

	public Team getbTeam() {
		return bTeam;
	}

	public void setbTeam(Team bTeam) {
		this.bTeam = bTeam;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

}
package model;

import java.util.*;

public class Team {

	public final static int SIZE = 7;
	private String name;
	private AssistantCoach[] assistants;
	private HeadCoach headCoach;
	private Player[][] players;
	private ArrayList<LineUp> lineUps;

	public Team(String name, int dressingRoom) {
		this.name = name;
		assistants = new AssistantCoach[3];
		players=new Player[SIZE][dressingRoom];
		lineUps=new ArrayList<LineUp>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AssistantCoach[] getAssistants() {
		return assistants;
	}

	public void setAssistants(AssistantCoach[] assistants) {
		this.assistants = assistants;
	}

	public HeadCoach getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(HeadCoach headCoach) {
		this.headCoach = headCoach;
	}

	public Player[][] getPlayers() {
		return players;
	}

	public void setPlayers(Player[][] players) {
		this.players = players;
	}

	public ArrayList<LineUp> getLineUps() {
		return lineUps;
	}

	public void setLineUps(ArrayList<LineUp> lineUps) {
		this.lineUps = lineUps;
	}

}
package model;

public enum Tactic {
	POSSESION(1), COUNTERATTACK(2), HIGH_PRESSURE(3), DEFAULT(4);

	private int tactic;

	Tactic(int t) {
		tactic = t;
	}

	public int getTactic() {
		return tactic;
	}

}
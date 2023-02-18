package _03_Intro_to_Enums;

public enum StatesOfMatter {

	SOLID(0), LIQUID(25.55), GAS(100);
	
	

	double celciousTemp;
	
	private StatesOfMatter(double celciousTemp) {
		this.celciousTemp = celciousTemp;
}
	
	public double degF() {
		double f = (celciousTemp * 1.8) + 32;
		return f;
	}
	
}

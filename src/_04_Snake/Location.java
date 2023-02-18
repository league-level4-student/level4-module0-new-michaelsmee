package _04_Snake;

public class Location {

	int xpos;
	int ypos;
	
	public Location(int X, int Y) {

	}

	public boolean equals(int x, int y) {
		if(xpos == x && ypos == y) {
			return true;
	}
		else {
		return false;
	}
	
}
	
	enum Directions {
		
		LEFT, RIGHT, UP, DOWN;
		
	}
	
}

package _04_Snake;

public class Location {

	private int xpos;
	private int ypos;
	
	public Location(int X, int Y) {
		this.xpos = X;
		this.ypos = Y;
	}

	public boolean equals(Location location) {
		if(xpos == location.getX() && ypos == location.getY()) {
			return true;
	}
		else {
		return false;
	}
	
}
	
	
	
	public int getX() {
	return xpos;
	}
	
	public int getY() {
	return ypos;
	}
}

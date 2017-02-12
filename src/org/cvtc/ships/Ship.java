/**
 * 
 */
package org.cvtc.ships;

/**
 * @author wlarrabee
 *
 */
public abstract class Ship {
	
	int length = 0;
	
	String direction = "";
	
	int startX = 0;
	
	int startY = 0;
	
	boolean isDestroyed = false;
	
	public boolean getIsDestroyed(){
		return isDestroyed;
	}
	
	//create a generic function for ship
	public Ship(int length, String direction, int startX, int startY) throws IllegalArgumentException {
		
		direction = direction.toUpperCase();
		
		if(direction != "UP" && direction != "DOWN" && direction != "RIGHT" && direction != "LEFT"){
			throw new IllegalArgumentException("Please enter the direction either UP, DOWN, LEFT, or RIGHT");
		}
		
		setLength(length);
		
		setDirection(direction);
		
		setStartX(startX);
		
		setStartY(startY);
		
	}

	public int getLength() {
		return length;
	}

	private void setLength(int length) {
		this.length = length;
	}

	public String getDirection() {
		return direction;
	}

	private void setDirection(String direction) {
		this.direction = direction;
	}

	public int getStartX() {
		return startX;
	}

	private void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	private void setStartY(int startY) {
		this.startY = startY;
	}
		
}

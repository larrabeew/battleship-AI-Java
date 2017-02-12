/**
 * 
 */
package org.cvtc.ships;

/**
 * @author wlarrabee
 *
 */
public class PBShip extends Ship {
	
	int hits = 0;
	
	public int getHits() {
		return hits;
	}

	private void setHits(int hits) {
		this.hits = hits;
	}
	
	public PBShip(String direction, int startX, int startY) {
		super(2, direction, startX, startY);
	}
	
	//function for getting the hits left
	public int getHitsLeft(){
		return length - hits;
	}
	
	public void hitShip(){
		setHits(hits + 1);
		if(hits == length){
			isDestroyed = true;
		}
	}

}

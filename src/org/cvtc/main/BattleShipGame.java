package org.cvtc.main;

import org.cvtc.ships.BattleShip;
import org.cvtc.ships.CarrierShip;
import org.cvtc.ships.DestroyerShip;
import org.cvtc.ships.PBShip;
import org.cvtc.ships.SubShip;

/**
 * @author wlarrabee
 *
 */
public class BattleShipGame {

	public static void main(String[] args) {
		
		CarrierShip carrierShip = new CarrierShip("UP",9,2);
		
		BattleShip battleShip = new BattleShip("DOWN", 4,3);
		
		SubShip subShip = new SubShip("LEFT", 8,9);
		
		DestroyerShip destroyerShip = new DestroyerShip("RIGTH", 5,5);
		
		PBShip pbShip = new PBShip("UP", 1,3);
		
	}

}

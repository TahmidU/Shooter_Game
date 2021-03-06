/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package shootergame.weapon.gun;

import city.cs.engine.UserView;
import city.cs.engine.World;
import shootergame.interactor.Player;
import shootergame.weapon.Weapon;

/**
 * Pistol Weapon. Parent Class Weapon. 
 * 
 * @author Tahmid
 */
public class Pistol extends Weapon{
    
    /**
     * Constructor for Weapon.
     * @param world
     * World in which the weapon will spawn in.
     * @param view
     * Userview used for mapping.
     * @param player
     * Player using the weapon.
     */
    public Pistol(World world, UserView view, Player player) {
        super(world, view, player, 600, 30,5,30,1,"data/Sound/Pistol.wav");
    }
      
}

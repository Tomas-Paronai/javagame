/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.test;

import javagame.lib.handlers.entity.Animated;
import javagame.lib.handlers.entity.Entity;

/**
 *
 * @author tomas
 */
public class Player extends Entity implements Animated{

    public Player(String name) {
        super(name);
    }    

    @Override
    public void update() {
        
    }
}

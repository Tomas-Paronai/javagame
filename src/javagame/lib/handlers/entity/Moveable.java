/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers.entity;

import org.newdawn.slick.Input;

/**
 *
 * @author tomas
 */
public interface Moveable {
    public void move(Input input);
    public int getWidth();
    public int getHeight();
}

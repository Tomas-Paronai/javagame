/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.test;

import javagame.lib.handlers.entity.Animated;
import javagame.lib.handlers.entity.Entity;
import javagame.lib.handlers.entity.Moveable;
import org.newdawn.slick.Input;

/**
 *
 * @author tomas
 */
public class Dummy extends Entity implements Animated,Moveable{
    
    private int x,y;
    private int width, height;
    
    public Dummy(String name) {
        super(name);
    }

    @Override
    public void update() {
        move(getInput());
        
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void move(Input input) {
        System.out.println("Dummy");
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    
}

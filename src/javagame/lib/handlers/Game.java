/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import javagame.lib.handlers.entity.Animated;
import javagame.lib.handlers.entity.Entity;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author tomas
 */
public class Game  extends BasicGame{
    
    private ArrayList<Entity> actingObjects;
    
    public Game(String title) {
        super(title);
        try{
            AppGameContainer appgc;
            appgc = new AppGameContainer(this);
            appgc.setDisplayMode(800, 640, false);
            appgc.setSmoothDeltas(true);
            appgc.setTargetFrameRate(60);
            appgc.start();
        }
        catch (SlickException ex){
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        actingObjects = new ArrayList<>();
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        if(actingObjects != null){
            for(Entity object : actingObjects){
                if(object instanceof Animated){
                    object.update();
                }                
            }
        }        
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        if(actingObjects != null){
            for (Entity object : actingObjects) {
                object.render(gc, grphcs);
            }
        }   
    }
    
    public void addEntity(Entity actor){
        actingObjects.add(actor);
    }
}

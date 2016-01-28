/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers;

import java.util.ArrayList;
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
    
    private ArrayList<Object> actingObjects;
    private AppGameContainer appgc;
    private GameContainer gc;
    
    public Game(String title) {
        super(title);
        try{            
            appgc = new AppGameContainer(this);
            appgc.setDisplayMode(800, 640, false);
            appgc.setSmoothDeltas(true);
            appgc.setTargetFrameRate(60); 
            
            actingObjects = new ArrayList<>();
            
        }
        catch (SlickException ex){
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.gc = gc;
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        if(actingObjects != null){
            for(Object object : actingObjects){
                if(object instanceof Animated){
                    Animated anObj = (Animated) object;
                    anObj.update();
                }                
            }
        }        
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        if(actingObjects != null){
            for (Object object : actingObjects) {
                if(object instanceof Entity && object instanceof Animated){
                    Entity enObj = (Entity) object;                    
                    Animated anObj = (Animated) enObj;
                    Animated.render(enObj.getAnimation(), enObj.getImage(), grphcs, anObj.getX(), anObj.getY());
                }
            }
        }   
    }
    
    public void start(){
        try {
            appgc.start();
        } catch (SlickException ex) {
        }
    }
    
    public void addEntity(Object actor){
        if(actor instanceof Entity){
            Entity enObj = (Entity) actor;
            enObj.setGameWorld(this);
        }
        actingObjects.add(actor);
    }
    
    public GameContainer getContainer(){
        return gc;
    }
}

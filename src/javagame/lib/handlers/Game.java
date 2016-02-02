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
    protected GameHelper helper;
    private GameContainer gc;
    
    public Game(String title, GameHelper helper) {
        super(title);
        this.helper = helper;
        try{            
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
        this.gc = gc;
        actingObjects = new ArrayList<>();
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {  
        checkForImports();
        if(actingObjects != null){
            //System.out.println(actingObjects.size());
            for(Object obj : actingObjects){
                if(obj instanceof Animated){                    
                    Animated animObj = (Animated) obj;
                    animObj.update();
                    //System.out.println(animObj.getClass());
                }
            }
        }
    }
    
    private void checkForImports(){
        if(helper.newImports != null && helper.newImports.size() > 0){
            for(Object obj : helper.newImports){
                addEntity(obj);
            }
            helper.newImports.clear();
            chechQueue();
        }        
    }
    
    private void chechQueue(){
        for(Object obj : actingObjects){
            if(obj instanceof Entity){
                Entity ent = (Entity) obj;
                ent.loadGraphics();
            }
        }
    }
    
    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {        
         for(Object obj : actingObjects){
            if(obj instanceof Entity && obj instanceof Animated){
                Entity ent = (Entity) obj;
                Animated.render(null, ent.getImage(), grphcs, ent.getX(), ent.getY());
            }
        }
    }
    
    public void start(){
        try {
            appgc.start();
        } catch (SlickException ex) {
        }
    }
    
    private void addEntity(Object actor){
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

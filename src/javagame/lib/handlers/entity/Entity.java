/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import javagame.lib.handlers.Game;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author tomas
 */
public abstract class Entity{
    
    private String entityName;
    private Animation animation;
    private int x,y;
    private Game game;
    private String imgPath;
    private Image img;
    
    public Entity(String name){
        entityName = name;
        init();
    }
    
    public void init() {
        
    }    
    
    public void render(Graphics g){
        
    }
    
    public void loadGraphics(){
        if(imgPath != null){
            try {
                img = new Image(imgPath);
            } catch (SlickException ex) {
                Logger.getLogger(Entity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void setAnimation(Image image, int w, int h){
        SpriteSheet sprite = new SpriteSheet(image, w, h);
        animation = new Animation(sprite, 100);
    }
    
    public Animation getAnimation(){
        return animation;
    }
    
    public void setImage(Image image){
        img = image;
    }
    
    public void setImage(String path){
        imgPath = path;
    }
    
    public Image getImage(){
        return img;
    }
    
    public void setName(String name){
        entityName = name;
    }
    
    public String getName(){
        return entityName;
    }
    
    public void setGameWorld(Game game){
        this.game = game;
    }    
    
    public Input getInput(){
        return game.getContainer().getInput();
    }
    

    public int getX() {
        return x;
    }
    
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

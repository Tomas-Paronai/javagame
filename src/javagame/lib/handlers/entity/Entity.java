/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers.entity;

import javagame.lib.handlers.Game;
import javagame.lib.handlers.GameHelper;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author tomas
 */
public abstract class Entity implements Animated{
    
    private String entityName;
    private String animationPath;
    private int animDims[];
    private Animation animation;
    private int x,y;
    private Game game;
    private String imgPath;
    private Image img;
    
    public Entity(String name){
        entityName = name;
    }   
    
    public void loadGraphics(){
        if(animationPath != null){
            try {
                setAnimation(new Image(animationPath),animDims[0],animDims[1]);
            } catch (SlickException ex) {}
        }
        if(imgPath != null){
            try {
                img = new Image(imgPath);
            } catch (SlickException ex) {}
        }
    }
    
    public void setAnimation(Image image, int w, int h){
        SpriteSheet sprite = new SpriteSheet(image, w, h);
        animation = new Animation(sprite, 100);
        animation.stop();
    }
    
    public void setAnimation(String path, int w, int h){
        animationPath = path;
        animDims = new int[2];
        animDims[0] = w;
        animDims[1] = h;
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
    
    public GameHelper getHelper(){
        return game.getHelper();
    }
    
    public Input getInput(){
        return game.getContainer().getInput();
    }
    

    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }
}

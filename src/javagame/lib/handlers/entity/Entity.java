/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers.entity;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 *
 * @author tomas
 */
public abstract class Entity{
    
    private String entityName;
    private Animation animation;
    private Image img;
    
    public Entity(String name){
        entityName = name;
        init();
    }
    
    public void init() {
        
    }    

    public void render(GameContainer gc, Graphics g) {
        if(animation != null){
            //TODO draw animation
        }
        else if(img != null){
            //TODO draw image
        }
    }
    
    public void setAnimation(Animation anim){
        animation = anim;
    }
    
    public Animation getAnimation(){
        return animation;
    }
    
    public void setImage(Image image){
        img = image;
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
    
}

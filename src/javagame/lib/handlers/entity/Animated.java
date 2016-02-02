/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers.entity;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;



/**
 *
 * @author tomas
 */
public interface Animated {
    public void update();
    public void setPosition(int x, int y);
    public int getX();
    public int getY();
    static void render(Animation anim, Image img, Graphics g, int x, int y)
    {
        if(anim != null){            
            g.drawAnimation(anim,(float) x,(float) y);
        }
        else if(img != null){
            g.drawImage(img,(float) x,(float) y);
        }
    }
}

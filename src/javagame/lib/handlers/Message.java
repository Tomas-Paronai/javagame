/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers;

import org.newdawn.slick.Graphics;

/**
 *
 * @author tomas
 */
public class Message {
    
    private String string;
    private boolean display = false;
    private int x,y;
    
    public Message(String string){
        this.string = string;
    }
    
    public void displayMessage(int x, int y){
        display = true;
        this.x = x;
        this.y = y;
    }
    
    public void hideMessage(){
        display = false;
    }
    
    public void render(Graphics g){
        if(string != null && display){
            g.drawString(string, x, y);
        }        
    }
    
    public void updateMessage(String updMes){
        string = updMes;
    }
}

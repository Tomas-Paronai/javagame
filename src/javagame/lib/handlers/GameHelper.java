/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame.lib.handlers;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class GameHelper {
    protected ArrayList<Object> newImports;
    
    public GameHelper(){
        newImports = new ArrayList<>();
    }
    
    public void addObject(Object object){
        newImports.add(object);
    }
    
    public void message(String msg){
        newImports.add(new Message(msg));
    }
}

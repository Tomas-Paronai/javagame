package javagame;

import javagame.lib.handlers.Game;
import javagame.lib.handlers.GameHelper;
import javagame.test.Dummy;


public class Main{
        
    public static void main(String[] args) {
       GameHelper helper = new GameHelper();
       
       helper.addObject(new Dummy("dummy"));
       
       Game javagame = new Game("GAME",helper);
       
    }
    
}

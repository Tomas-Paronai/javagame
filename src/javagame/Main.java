package javagame;

import javagame.lib.handlers.Game;
import javagame.test.Dummy;


public class Main{
    
    private static Game javagame;
    
    public static void main(String[] args) {
       javagame = new Game("GAME");
       javagame.addEntity(new Dummy("dummy"));
       javagame.start();
    }
    
}

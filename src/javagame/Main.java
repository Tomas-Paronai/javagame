package javagame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame{

    public static void main(String[] args) {
         try{
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Main("GAME"));
            appgc.setDisplayMode(800, 640, false);
            appgc.setSmoothDeltas(true);
            appgc.setTargetFrameRate(60);
            appgc.start();
        }
        catch (SlickException ex){
        }
    }

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
    }

    
}

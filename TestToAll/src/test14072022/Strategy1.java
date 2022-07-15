package test14072022;

import java.util.Scanner;

public class Strategy1 {
	
	public static void main(String[] args) {
		
		//BadGame game=new BadGame();
		
		GoodGame game=new GoodGame();
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Start Process.........");
			
			s.next();
			
			game.play();
			
		}
		
	}

}

class BadGame{
	
	int level;
	
	void play() {
		
		if(level==0) {
			
			System.out.println("New Level Started..........");
			
			level=1;
			
		}
		
		else if(level==1) {
			
			System.out.println("New First Process Completed..........");
			
			level=2;
			
		}
		
		else if(level==2) {
			
			System.out.println("New Second Process Completed..........");
			
			level=3;
			
		}
		
		else {
			
			System.out.println("Go to Next Level..........");
			
			level=0;
			
		}
		
	}
	
}

class GoodGame{
	
	Play p=new StartGame();
	
	public void play() {
		
		p.play(this);
		
	}
	
}

abstract class Play{
	
	public abstract void play(GoodGame gd);
	
}

class StartGame extends Play{

	@Override
	public void play(GoodGame gd) {
		
		System.out.println("New Level Started..........");
		
		gd.p=new FirstLevel();
		
	}
	
}

class FirstLevel extends Play{

	@Override
	public void play(GoodGame gd) {
		
		System.out.println("New First Process Completed..........");
		
		gd.p=new ScenodLevel();
		
	}
	
}

class ScenodLevel extends Play{

	@Override
	public void play(GoodGame gd) {
		
		System.out.println("New Second Process Completed..........");
		
		gd.p=new FinalLevel();
		
	}
	
}

class FinalLevel extends Play{

	@Override
	public void play(GoodGame gd) {
		
		System.out.println("Go to Next Level..........");
		
		gd.p=new StartGame();
		
	}
	
}

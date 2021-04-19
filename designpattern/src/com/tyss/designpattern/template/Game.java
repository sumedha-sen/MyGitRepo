package com.tyss.designpattern.template;

public abstract class Game {
	
	public abstract void init();
	public abstract void start();
	public abstract void end();
	
	public void play() {
		init();
		start();
		end();
		
	}
	

}

package com.tyss.designpattern.template;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		String game=sc.nextLine();
		if(game=="ludo") {
			Ludo ludo=new Ludo();
			ludo.play();


		}else if(game=="pubg") {

			Pubg pubg=new Pubg();
			pubg.play();

		}
	}
		

	


}


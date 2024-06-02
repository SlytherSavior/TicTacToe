package com.slyther.TicTacToe;

import java.util.Scanner;

public class TicTacToeRunner {


	public static void main(String[] args) {

		System.out.println("Please enter which one among 'X' and 'O' would be the first to play!");

		// Define the input scanner here !
		Scanner inputScan = new Scanner(System.in);
		Character starter = inputScan.next().charAt(0);

		if(!checkChar(starter)) {
			System.out.println("Please enter a valid character to begin with");
			starter = inputScan.next().charAt(0);
		} else {
		// running the program goes here
		TicTacToe game = new TicTacToe();
		game.gamePlay('X');
		// TODO Auto-generated method stub
	}
	}

	// Check if they have entered valid char or not
	public static boolean checkChar(Character a) {
		Character b = Character.toUpperCase(a);
		return b == 'X' || b == 'O' ? true : false;

	}
}



package com.slyther.TicTacToe;

import java.util.Arrays;

public class TicTacToe {

	private int[] gameArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private String gameDisplay = " " + gameArray;
	private Character currentChar;
	private String displayFormat = "+---+---+---+\n-        -\n+        +";

	// set a method to display the game !
	public void gamePlay(char startPlayer) {

		System.out.println(Arrays.toString(gameArray));
		System.out.println(displayFormat);

		currentChar = startPlayer;

	}

	// set a method to take in the value added and continue the game
	public void gamePlay(int pos) {


	}

	// methods to check rows columns and diagonals
	private boolean checkRows(String[] game) {

		return true;
	}

	private boolean checkCols(String[] game) {

		return true;
	}

	private boolean checkDiag(String[] game) {

		return true;
	}

}
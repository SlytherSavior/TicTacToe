package com.slyther.TicTacToe;

public class TicTacToe {

	private char[] gameArray = new char[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private String gameDisplay = " " + gameArray;
	private Character currentChar;
	private String displayFormat = "+---+---+---+\n-        -\n+        +";

	// set a method to display the game !
	public void gamePlay(char startPlayer) {

		System.out.println(getGameDisplayString(gameArray));

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

	public static String getGameDisplayString(char[] gameArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < gameArray.length; i++) {
			sb.append(gameArray[i]);
			if ((i + 1) % 3 == 0 && i != gameArray.length - 1) {
				sb.append("\n---------\n");
			} else if ((i + 1) % 3 != 0) {
				sb.append(" | ");
			}
		}
		return sb.toString();
	}

}
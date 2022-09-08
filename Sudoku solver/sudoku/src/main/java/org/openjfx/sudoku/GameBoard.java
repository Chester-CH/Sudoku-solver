package org.openjfx.sudoku;

public class GameBoard {

	private Integer[][] board = new Integer[9][9];
	
	public GameBoard() {	
	}
	
	public GameBoard(GameBoard apu) {
		for(int y=0;y<9;y++) {
			for(int x=0;x<9;x++) {
				board[y][x]= apu.get(y,x);
			}
		}
	}
	
	public Integer get(int y, int x) {
		return board[y][x];
	}
	
	public void set(int y, int x, Integer index) {
		board[y][x]=index;
	}
}

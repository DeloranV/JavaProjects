package Misc;

class area {

	static private final int gridSize = 8;

	static String[][] board = new String[gridSize][gridSize];

	static public void areaGenerate() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "O";
			}
		}
	}

	static public void areaDisplay() {
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("  " + board[i][j]);
			}
		}
	}

}

interface pieceInitialize { // MAKING A CLASS WOULD BE BETTER SINCE BOTH METHODS ARE UNIFIED BETWEEN PIECE
							// TYPES
	void changePos(int y, int x);

	void pieceRender();

}

class piece implements pieceInitialize {

	private String icon = "P";
	private int xRange = 0;
	private int yRange = 2;
	private int xPos = 0;
	private int yPos = 6;

	piece(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class king implements pieceInitialize {

	private String icon = "K";
	private int xRange = 7;
	private int yRange = 7;
	private int xPos = 4;
	private int yPos = 7;

	king(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class bishop implements pieceInitialize {
	private String icon = "B";
	private int xRange = 0;
	private int yRange = 0;
	private int xPos = 0;
	private int yPos = 0;

	bishop(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class knight implements pieceInitialize {
	private String icon = "k";
	private int xRange = 0;
	private int yRange = 0;
	private int xPos = 0;
	private int yPos = 0;

	knight(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class rook implements pieceInitialize {
	private String icon = "R";
	private int xRange = 0;
	private int yRange = 0;
	private int xPos = 0;
	private int yPos = 0;

	rook(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class queen implements pieceInitialize {
	private String icon = "Q";
	private int xRange = 0;
	private int yRange = 0;
	private int xPos = 0;
	private int yPos = 0;

	queen(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void changePos(int y, int x) {
		yPos -= y;
		xPos += x;
	}

	public void pieceRender() {
		area.board[yPos][xPos] = icon;
	}

}

class playerInitialize {
	static void p1Init() {
		piece pionekA1 = new piece(7, 6);
		pionekA1.pieceRender();
		piece pionekB1 = new piece(6, 6);
		pionekB1.pieceRender();
		piece pionekC1 = new piece(5, 6);
		pionekC1.pieceRender();
		piece pionekD1 = new piece(4, 6);
		pionekD1.pieceRender();
		piece pionekE1 = new piece(3, 6);
		pionekE1.pieceRender();
		piece pionekF1 = new piece(2, 6);
		pionekF1.pieceRender();
		piece pionekG1 = new piece(1, 6);
		pionekG1.pieceRender();
		piece pionekH1 = new piece(0, 6);
		pionekH1.pieceRender();
		king krolA1 = new king(3, 0);
		krolA1.pieceRender();
		bishop tenA1 = new bishop(2, 0);
		tenA1.pieceRender();
		bishop tenB1 = new bishop(5, 0);
		tenB1.pieceRender();
		knight rycerzA1 = new knight(1, 0);
		rycerzA1.pieceRender();
		knight rycerzB1 = new knight(6, 0);
		rycerzB1.pieceRender();
		rook wiezaA1 = new rook(0, 0);
		wiezaA1.pieceRender();
		rook wiezaB1 = new rook(7, 0);
		wiezaB1.pieceRender();
		queen hetmanA1 = new queen(4, 0);
		hetmanA1.pieceRender();
	}

	static void p2Init() {
		piece pionekA2 = new piece(0, 1);
		pionekA2.pieceRender();
		piece pionekB2 = new piece(1, 1);
		pionekB2.pieceRender();
		piece pionekC2 = new piece(2, 1);
		pionekC2.pieceRender();
		piece pionekD2 = new piece(3, 1);
		pionekD2.pieceRender();
		piece pionekE2 = new piece(4, 1);
		pionekE2.pieceRender();
		piece pionekF2 = new piece(5, 1);
		pionekF2.pieceRender();
		piece pionekG2 = new piece(6, 1);
		pionekG2.pieceRender();
		piece pionekH2 = new piece(7, 1);
		pionekH2.pieceRender();
		king krolA2 = new king(4, 7);
		krolA2.pieceRender();
		bishop tenA2 = new bishop(2, 7);
		tenA2.pieceRender();
		bishop tenB2 = new bishop(5, 7);
		tenB2.pieceRender();
		knight rycerzA2 = new knight(1, 7);
		rycerzA2.pieceRender();
		knight rycerzB2 = new knight(6, 7);
		rycerzB2.pieceRender();
		rook wiezaA1 = new rook(0, 7);
		wiezaA1.pieceRender();
		rook wiezaB2 = new rook(7, 7);
		wiezaB2.pieceRender();
		queen hetmanA1 = new queen(3, 7);
		hetmanA1.pieceRender();
	}
}

public class ChessGame {

	public static void main(String[] args) {

		area.areaGenerate();
		playerInitialize.p1Init();
		playerInitialize.p2Init();
		area.areaDisplay();

	}

}

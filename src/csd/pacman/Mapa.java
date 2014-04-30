package csd.pacman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mapa {

	public static final char NULO = 'N';//FIXME nao eh valido, excluir
	public static final char VAZIO = 'V';
	public static final char GHOST = 'G';
	public static final char PACMAN = 'P';
	public static final char WALL = 'W';

	private static final int TAMANHO_LINHAS = 11;
	private static final int TAMANHO_COLUNAS = 14;

	char[][] mapa = new char[TAMANHO_LINHAS][TAMANHO_COLUNAS];

	public Mapa() {
		zerarMapa();
		carregarMapa();
	}

	private void carregarMapa() {
		mapa[0][0] = WALL;
		mapa[0][1] = WALL;
		mapa[0][2] = WALL;
		mapa[0][3] = WALL;
		mapa[0][4] = WALL;
		mapa[0][5] = WALL;
		mapa[0][6] = WALL;
		mapa[0][7] = WALL;
		mapa[0][8] = WALL;
		mapa[0][9] = WALL;
		mapa[0][10] = WALL;
		mapa[0][11] = WALL;
		mapa[0][12] = WALL;
		mapa[0][13] = WALL;
		mapa[1][0] = WALL;
		mapa[1][1] = PACMAN;
		mapa[1][2] = VAZIO;
		mapa[1][3] = VAZIO;
		mapa[1][4] = VAZIO;
		mapa[1][5] = VAZIO;
		mapa[1][6] = VAZIO;
		mapa[1][7] = VAZIO;
		mapa[1][8] = VAZIO;
		mapa[1][9] = VAZIO;
		mapa[1][10] = VAZIO;
		mapa[1][11] = VAZIO;
		mapa[1][12] = VAZIO;
		mapa[1][13] = WALL;
		mapa[2][0] = WALL;
		mapa[2][1] = VAZIO;
		mapa[2][2] = WALL;
		mapa[2][3] = WALL;
		mapa[2][4] = WALL;
		mapa[2][5] = WALL;
		mapa[2][6] = WALL;
		mapa[2][7] = WALL;
		mapa[2][8] = VAZIO;
		mapa[2][9] = WALL;
		mapa[2][10] = WALL;
		mapa[2][11] = WALL;
		mapa[2][12] = VAZIO;
		mapa[2][13] = WALL;
		mapa[3][0] = WALL;
		mapa[3][1] = VAZIO;
		mapa[3][2] = WALL;
		mapa[3][3] = VAZIO;
		mapa[3][4] = VAZIO;
		mapa[3][5] = VAZIO;
		mapa[3][6] = VAZIO;
		mapa[3][7] = VAZIO;
		mapa[3][8] = VAZIO;
		mapa[3][9] = VAZIO;
		mapa[3][10] = VAZIO;
		mapa[3][11] = WALL;
		mapa[3][12] = VAZIO;
		mapa[3][13] = WALL;
		mapa[4][0] = WALL;
		mapa[4][1] = VAZIO;
		mapa[4][2] = WALL;
		mapa[4][3] = VAZIO;
		mapa[4][4] = WALL;
		mapa[4][5] = VAZIO;
		mapa[4][6] = WALL;
		mapa[4][7] = WALL;
		mapa[4][8] = WALL;
		mapa[4][9] = WALL;
		mapa[4][10] = VAZIO;
		mapa[4][11] = WALL;
		mapa[4][12] = VAZIO;
		mapa[4][13] = WALL;
		mapa[5][0] = WALL;
		mapa[5][1] = VAZIO;
		mapa[5][2] = WALL;
		mapa[5][3] = VAZIO;
		mapa[5][4] = WALL;
		mapa[5][5] = VAZIO;
		mapa[5][6] = VAZIO;
		mapa[5][7] = VAZIO;
		mapa[5][8] = VAZIO;
		mapa[5][9] = WALL;
		mapa[5][10] = VAZIO;
		mapa[5][11] = VAZIO;
		mapa[5][12] = VAZIO;
		mapa[5][13] = WALL;
		mapa[6][0] = WALL;
		mapa[6][1] = VAZIO;
		mapa[6][2] = WALL;
		mapa[6][3] = VAZIO;
		mapa[6][4] = WALL;
		mapa[6][5] = WALL;
		mapa[6][6] = WALL;
		mapa[6][7] = WALL;
		mapa[6][8] = VAZIO;
		mapa[6][9] = WALL;
		mapa[6][10] = VAZIO;
		mapa[6][11] = WALL;
		mapa[6][12] = VAZIO;
		mapa[6][13] = WALL;
		mapa[7][0] = WALL;
		mapa[7][1] = VAZIO;
		mapa[7][2] = WALL;
		mapa[7][3] = VAZIO;
		mapa[7][4] = VAZIO;
		mapa[7][5] = VAZIO;
		mapa[7][6] = VAZIO;
		mapa[7][7] = VAZIO;
		mapa[7][8] = VAZIO;
		mapa[7][9] = VAZIO;
		mapa[7][10] = VAZIO;
		mapa[7][11] = WALL;
		mapa[7][12] = VAZIO;
		mapa[7][13] = WALL;
		mapa[8][0] = WALL;
		mapa[8][1] = VAZIO;
		mapa[8][2] = WALL;
		mapa[8][3] = WALL;
		mapa[8][4] = WALL;
		mapa[8][5] = WALL;
		mapa[8][6] = WALL;
		mapa[8][7] = VAZIO;
		mapa[8][8] = WALL;
		mapa[8][9] = WALL;
		mapa[8][10] = WALL;
		mapa[8][11] = WALL;
		mapa[8][12] = VAZIO;
		mapa[8][13] = WALL;
		mapa[9][0] = WALL;
		mapa[9][1] = VAZIO;
		mapa[9][2] = VAZIO;
		mapa[9][3] = VAZIO;
		mapa[9][4] = VAZIO;
		mapa[9][5] = VAZIO;
		mapa[9][6] = VAZIO;
		mapa[9][7] = VAZIO;
		mapa[9][8] = VAZIO;
		mapa[9][9] = VAZIO;
		mapa[9][10] = VAZIO;
		mapa[9][11] = VAZIO;
		mapa[9][12] = GHOST;
		mapa[9][13] = WALL;
		mapa[10][0] = WALL;
		mapa[10][1] = WALL;
		mapa[10][2] = WALL;
		mapa[10][3] = WALL;
		mapa[10][4] = WALL;
		mapa[10][5] = WALL;
		mapa[10][6] = WALL;
		mapa[10][7] = WALL;
		mapa[10][8] = WALL;
		mapa[10][9] = WALL;
		mapa[10][10] = WALL;
		mapa[10][11] = WALL;
		mapa[10][12] = WALL;
		mapa[10][13] = WALL;
	}

	private void zerarMapa() {
		for (int linha = 0; linha < TAMANHO_LINHAS; linha++) {
			for (int coluna = 0; coluna < TAMANHO_COLUNAS; coluna++) {
				mapa[linha][coluna] = VAZIO;
			}
		}
	}

	public char getPosicao(int linha, int coluna) {
		if ((linha >= TAMANHO_LINHAS) || (coluna >= TAMANHO_COLUNAS)) {
			/*FIXME throws*/
			return NULO;
		}
		return mapa[linha][coluna];
	}

	public int[] getPosicaoPacman() {
		for (int linha = 0; linha < TAMANHO_LINHAS; linha++) {
			for (int coluna = 0; coluna < TAMANHO_COLUNAS; coluna++) {
				if (mapa[linha][coluna] == 'P') {
					return new int[] { linha, coluna };
				}
			}
		}
		throw new RuntimeException("pacman nao encontrado");
	}
	
	public void setPosicaoPacman(int[] de, int[] para) {
		mapa[de[0]][de[1]] = VAZIO;
		mapa[para[0]][para[1]] = PACMAN;
	}

	public void imprimir() {
		for (int linha = 0; linha < 11; linha++) {
			for (int coluna = 0; coluna < 14; coluna++) {
				char posicao = getPosicao(linha, coluna);
				switch (posicao) {
				case WALL:
					System.out.print("###");
					break;
				case VAZIO:
					System.out.print("   ");
					break;
				case PACMAN:
					System.out.print(" @ ");
					break;
				case GHOST:
					System.out.print(" & ");
					break;
				default:
					throw new RuntimeException("mapa incorreto");
				}
			}
			System.out.println();
		}
	}

	public char getKey() {
		System.out.println("Play : ");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			return bufferRead.readLine().toCharArray()[0];
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void moverPacman(Movimento movimento) {
		if (movimento == Movimento.DOWN) {
			int[] p = getPosicaoPacman();
			//TODO validar movimento
			mapa[p[0]][p[1]] = VAZIO;
			mapa[p[0]+1][p[1]] = PACMAN;
		}
		if (movimento == Movimento.UP) {
			int[] p = getPosicaoPacman();
			//TODO validar movimento
			mapa[p[0]][p[1]] = VAZIO;
			mapa[p[0]-1][p[1]] = PACMAN;
		}
	}
	
	public void jogar() {
		char key = this.getKey();
		while (key != 'q') {
			Movimento m = fromCharToMovimento(key);
			this.moverPacman(m);
			this.imprimir();
			key = this.getKey();
		}
	}
	
	private Movimento fromCharToMovimento(char key) {
		if (key == 'w') {
			return Movimento.UP;
		}
		if (key == 's') {
			return Movimento.DOWN;
		}
		if (key == 'a') {
			return Movimento.LEFT;
		}
		if (key == 'd') {
			return Movimento.RIGHT;
		}
		return null;
	}

}
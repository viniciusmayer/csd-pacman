package csd.pacman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mapa {
	
	public static final char NULO = 'N';
	public static final char VAZIO = 'V';
	public static final char GHOST = 'G';
	public static final char PACMAN = 'P';
	public static final char WALL = 'W';
	
	private static final int TAMANHO_COLUNAS = 14;
	private static final int TAMANHO_LINHAS = 11;
	
	char[][] mapa = new char[TAMANHO_LINHAS][TAMANHO_COLUNAS];
	
	public Mapa() {
		zerarMapa();
		carregarMapa();
	}

	private void carregarMapa() {
//		mapa[9][12] = GHOST;
			mapa[0][0] = 'W';
			mapa[0][1] = 'W';
			mapa[0][2] = 'W';
			mapa[0][3] = 'W';
			mapa[0][4] = 'W';
			mapa[0][5] = 'W';
			mapa[0][6] = 'W';
			mapa[0][7] = 'W';
			mapa[0][8] = 'W';
			mapa[0][9] = 'W';
			mapa[0][10] = 'W';
			mapa[0][11] = 'W';
			mapa[0][12] = 'W';
			mapa[0][13] = 'W';
			mapa[1][0] = 'W';
			mapa[1][1] = 'P';
			mapa[1][2] = 'V';
			mapa[1][3] = 'V';
			mapa[1][4] = 'V';
			mapa[1][5] = 'V';
			mapa[1][6] = 'V';
			mapa[1][7] = 'V';
			mapa[1][8] = 'V';
			mapa[1][9] = 'V';
			mapa[1][10] = 'V';
			mapa[1][11] = 'V';
			mapa[1][12] = 'V';
			mapa[1][13] = 'W';
			mapa[2][0] = 'W';
			mapa[2][1] = 'V';
			mapa[2][2] = 'W';
			mapa[2][3] = 'W';
			mapa[2][4] = 'W';
			mapa[2][5] = 'W';
			mapa[2][6] = 'W';
			mapa[2][7] = 'W';
			mapa[2][8] = 'V';
			mapa[2][9] = 'W';
			mapa[2][10] = 'W';
			mapa[2][11] = 'W';
			mapa[2][12] = 'V';
			mapa[2][13] = 'W';
			mapa[3][0] = 'W';
			mapa[3][1] = 'V';
			mapa[3][2] = 'W';
			mapa[3][3] = 'V';
			mapa[3][4] = 'V';
			mapa[3][5] = 'V';
			mapa[3][6] = 'V';
			mapa[3][7] = 'V';
			mapa[3][8] = 'V';
			mapa[3][9] = 'V';
			mapa[3][10] = 'V';
			mapa[3][11] = 'W';
			mapa[3][12] = 'V';
			mapa[3][13] = 'W';
			mapa[4][0] = 'W';
			mapa[4][1] = 'V';
			mapa[4][2] = 'W';
			mapa[4][3] = 'V';
			mapa[4][4] = 'W';
			mapa[4][5] = 'V';
			mapa[4][6] = 'W';
			mapa[4][7] = 'W';
			mapa[4][8] = 'W';
			mapa[4][9] = 'W';
			mapa[4][10] = 'V';
			mapa[4][11] = 'W';
			mapa[4][12] = 'V';
			mapa[4][13] = 'W';
			mapa[5][0] = 'W';
			mapa[5][1] = 'V';
			mapa[5][2] = 'W';
			mapa[5][3] = 'V';
			mapa[5][4] = 'W';
			mapa[5][5] = 'V';
			mapa[5][6] = 'V';
			mapa[5][7] = 'V';
			mapa[5][8] = 'V';
			mapa[5][9] = 'W';
			mapa[5][10] = 'V';
			mapa[5][11] = 'V';
			mapa[5][12] = 'V';
			mapa[5][13] = 'W';
			mapa[6][0] = 'W';
			mapa[6][1] = 'V';
			mapa[6][2] = 'W';
			mapa[6][3] = 'V';
			mapa[6][4] = 'W';
			mapa[6][5] = 'W';
			mapa[6][6] = 'W';
			mapa[6][7] = 'W';
			mapa[6][8] = 'V';
			mapa[6][9] = 'W';
			mapa[6][10] = 'V';
			mapa[6][11] = 'W';
			mapa[6][12] = 'V';
			mapa[6][13] = 'W';
			mapa[7][0] = 'W';
			mapa[7][1] = 'V';
			mapa[7][2] = 'W';
			mapa[7][3] = 'V';
			mapa[7][4] = 'V';
			mapa[7][5] = 'V';
			mapa[7][6] = 'V';
			mapa[7][7] = 'V';
			mapa[7][8] = 'V';
			mapa[7][9] = 'V';
			mapa[7][10] = 'V';
			mapa[7][11] = 'W';
			mapa[7][12] = 'V';
			mapa[7][13] = 'W';
			mapa[8][0] = 'W';
			mapa[8][1] = 'V';
			mapa[8][2] = 'W';
			mapa[8][3] = 'W';
			mapa[8][4] = 'W';
			mapa[8][5] = 'W';
			mapa[8][6] = 'W';
			mapa[8][7] = 'V';
			mapa[8][8] = 'W';
			mapa[8][9] = 'W';
			mapa[8][10] = 'W';
			mapa[8][11] = 'W';
			mapa[8][12] = 'V';
			mapa[8][13] = 'W';
			mapa[9][0] = 'W';
			mapa[9][1] = 'V';
			mapa[9][2] = 'V';
			mapa[9][3] = 'V';
			mapa[9][4] = 'V';
			mapa[9][5] = 'V';
			mapa[9][6] = 'V';
			mapa[9][7] = 'V';
			mapa[9][8] = 'V';
			mapa[9][9] = 'V';
			mapa[9][10] = 'V';
			mapa[9][11] = 'V';
			mapa[9][12] = 'G';
			mapa[9][13] = 'W';
			mapa[10][0] = 'W';
			mapa[10][1] = 'W';
			mapa[10][2] = 'W';
			mapa[10][3] = 'W';
			mapa[10][4] = 'W';
			mapa[10][5] = 'W';
			mapa[10][6] = 'W';
			mapa[10][7] = 'W';
			mapa[10][8] = 'W';
			mapa[10][9] = 'W';
			mapa[10][10] = 'W';
			mapa[10][11] = 'W';
			mapa[10][12] = 'W';
			mapa[10][13] = 'W';
	}

	private void zerarMapa() {
		for (int linha = 0; linha < TAMANHO_LINHAS; linha++) {
			for (int coluna = 0; coluna < TAMANHO_COLUNAS; coluna++) {
				mapa[linha][coluna] = VAZIO;
			}
		}
	}

	public char getPosicao(int i, int j) {
		if ((i >= TAMANHO_LINHAS) ||
				(j >= TAMANHO_COLUNAS)) {
			return NULO;
		}
		return mapa[i][j];
	}

	public int[] getPosicaoPacman() throws Exception {
		for (int linha = 0; linha < TAMANHO_LINHAS; linha++) {
			for (int coluna = 0; coluna < TAMANHO_COLUNAS; coluna++) {
				if (mapa[linha][coluna] == 'P'){
					return new int[]{linha, coluna}; 
				}
			}
		}
		throw new Exception("pacman nao encontrado");
	}

	public void setPosicaoPacman(int[] de, int[] para) {
		mapa[de[0]][de[1]] = 'V';
		mapa[para[0]][para[1]] = 'P';
	}

	public void imprimir() {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 14; j++) {
				char posicao = getPosicao(i, j);
				switch (posicao) {
				case 'W':
					System.out.print("###");
					break;
				case 'V':
					System.out.print("   ");
					break;
				case 'P':
					System.out.print(" @ ");
					break;
				case 'G':
					System.out.print(" & ");
					break;

				default:
					assertTrue(false);
					break;
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
		}
		catch(IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void moverPacman(Movimento movimento) {
	}
}

package csd.pacman.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import csd.pacman.Mapa;

public class MapaTest {

	@Test
	public void testImprimirMapa() {
		Mapa mapa = new Mapa();
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 14; j++) {
				char posicao = mapa.getPosicao(i, j);
				switch (posicao) {
				case 'w':
					System.out.print("#");
					break;
				case 'v':
					System.out.print(" ");
					break;
				case 'p':
					System.out.print("@");
					break;
				case 'g':
					System.out.print("&");
					break;

				default:
					assertTrue(false);
					break;
				}
			}
			System.out.println();
		} 
	}
}
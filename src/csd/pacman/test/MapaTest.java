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
}
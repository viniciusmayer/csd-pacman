package csd.pacman.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import csd.pacman.Mapa;

public class MapaManualTest {
	
	public void testImprimirMapaPosicaoZero() {
		Mapa mapa = new Mapa();
		try {
			mapa.imprimir();
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	
	public void testObterPosicaoDoPacmanDeveRetornarUmUm(){
		Mapa mapa = new Mapa();
		int[] posicao;
		try {
			posicao = mapa.getPosicaoPacman();
		} catch (Exception e) {
			assertTrue(false);
			return;
		}
		int[] p = {1,  1};
		assertTrue(Arrays.equals(p, posicao));
	}
	
	@Test
	public void testImprimirMapaPosicaoUm() throws InterruptedException {
		Mapa mapa = new Mapa();

		try {
			mapa.imprimir();
		} catch (Exception e) {
			assertTrue(false);
		}
		Thread.sleep(2000);
		int[] de = {1,  1};
		int[] para = {1, 2};
		mapa.setPosicaoPacman(de, para);
		for (int i = 0; i < 95; i++) {
			System.out.println();
		}
		
		try {
			mapa.imprimir();
		} catch (Exception e) {
			assertTrue(false);
		}
		Thread.sleep(2000);
		int[] deDois = {1, 2};
		int[] paraDois = {1, 3};
		mapa.setPosicaoPacman(deDois, paraDois);
		for (int i = 0; i < 95; i++) {
			System.out.println();
		}
		
		try {
			mapa.imprimir();
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	
}
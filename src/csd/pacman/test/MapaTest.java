package csd.pacman.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import csd.pacman.Mapa;

public class MapaTest {
	
	@Test
	public void testDeveConterParedeNaPosicaoZeroZero() {
		assertEquals('W', new Mapa().getPosicao(0,0));
	}
	
	@Test
	public void testDeveConterPacmanNaPosicaoUmUm() {
		assertEquals('P', new Mapa().getPosicao(1,1));
	}
	
	@Test
	public void testDeveConterFantasmaNaPosicaoOitoQuatorze() {
		assertEquals('G', new Mapa().getPosicao(9,12));
	}
	
	@Test
	public void testNaoDeveUltrapassarLimiteCincoQuatorze() {
		assertEquals('N', new Mapa().getPosicao(5,14));
	}
	
	@Test
	public void testNaoDeveUltrapassarLimiteOnzeSeis() {
		assertEquals('N', new Mapa().getPosicao(11,6));
	}
	
	@Test
	public void testDeveConterEspacoVazio() {
		assertEquals('V', new Mapa().getPosicao(2,1));
	}

	@Test
	public void testImprimirMapaPosicaoZero() {
		Mapa mapa = new Mapa();
		try {
			mapa.imprimir();
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
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
	
	/*
	 * considerando um movimento para a direita
	 */
	@Test
	public void testObterNovaPosicaoDoPacmanDeveRetornarUmDois(){
		Mapa mapa = new Mapa();
		int[] de;
		try {
			de = mapa.getPosicaoPacman();
		} catch (Exception e) {
			assertTrue(false);
			return;
		}
		
		int[] para = {1, 2};
		mapa.setPosicaoPacman(de, para);
		
		int[] posicao;
		try {
			posicao = mapa.getPosicaoPacman();
		} catch (Exception e) {
			assertTrue(false);
			return;
		}
		
		int[] p = {1,  2};
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
package csd.pacman.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import csd.pacman.Mapa;
import csd.pacman.Movimento;

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
	public void testDeveMoverPacmanParaBaixo() {
		Mapa mapa = new Mapa();
		mapa.moverPacman(Movimento.DOWN);
		int[] novaPosicao = { 2, 1 };
		assertEquals(true, Arrays.equals(novaPosicao, mapa.getPosicaoPacman()));
	}
	
}
package testsUnitarios;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApp.MainApp;


class TestReaccion {

	@Test
	void testReaccion() {
		System.out.println("TestReaccion");
		
		MainApp mainApp = new MainApp();
		String elemento1 = "", elemento2 = "";
		
		
		
		
		System.out.println("******************** INICIO TEST REACCIÓN ********************");
		System.out.println("Elementos iniciales, siempre true:\nAgua:"+mainApp.getBtnAgua().isVisible()+"\t Fuego:"+mainApp.getBtnFuego().isVisible()+"\t Tierra:"+mainApp.getBtnTierra().isVisible()+"\t Aire:"+mainApp.getBtnAire().isVisible()+"\n");
		
		mainApp.todofalse();
		
		mainApp.getBtnLluvia().setVisible(false);
		mainApp.getBtnVapor().setVisible(false);
		mainApp.getBtnLava().setVisible(false);
		mainApp.getBtnHumo().setVisible(false);
		mainApp.getBtnArena().setVisible(false);
		mainApp.getBtnBarro().setVisible(false);
		mainApp.getBtnCeramica().setVisible(false);
		mainApp.getBtnCristal().setVisible(false);
		mainApp.getBtnPlanta().setVisible(false);
		
		assertTrue(!mainApp.getBtnLluvia().isVisible());
		assertTrue(!mainApp.getBtnVapor().isVisible());
		assertTrue(!mainApp.getBtnLava().isVisible());
		assertTrue(!mainApp.getBtnHumo().isVisible());
		assertTrue(!mainApp.getBtnArena().isVisible());
		assertTrue(!mainApp.getBtnBarro().isVisible());
		assertTrue(!mainApp.getBtnCeramica().isVisible());
		assertTrue(!mainApp.getBtnCristal().isVisible());
		assertTrue(!mainApp.getBtnPlanta().isVisible());
		
		for (int i=0; i<13; i++) {
			for (int j=0; j<13; j++) {
				
				mainApp.todofalse();
				
				mainApp.getBtnLluvia().setVisible(false);
				mainApp.getBtnVapor().setVisible(false);
				mainApp.getBtnLava().setVisible(false);
				mainApp.getBtnHumo().setVisible(false);
				mainApp.getBtnArena().setVisible(false);
				mainApp.getBtnBarro().setVisible(false);
				mainApp.getBtnCeramica().setVisible(false);
				mainApp.getBtnCristal().setVisible(false);
				mainApp.getBtnPlanta().setVisible(false);
				
				
				
				switch (i) {
				case 0:
					elemento1 = "Agua";
					mainApp.setAgua(true);
					break;
				case 1:
					elemento1 = "Fuego";
					mainApp.setFuego(true);
					break;
				case 2:
					elemento1 = "Tierra";
					mainApp.setTierra(true);
					break;	
				case 3:
					elemento1 = "Aire";
					mainApp.setAire(true);
					break;
				case 4:
					elemento1 = "Vapor";
					mainApp.setVapor(true);
					break;
				case 5:
					elemento1 = "Lluvia";
					mainApp.setLluvia(true);
					break;
				case 6:
					elemento1 = "Barro";
					mainApp.setBarro(true);
					break;
				case 7:
					elemento1 = "Humo";
					mainApp.setHumo(true);
					break;
				case 8:
					elemento1 = "Lava";
					mainApp.setLava(true);
					break;
				case 9:
					elemento1 = "Planta";
					mainApp.setPlanta(true);
					break;
				case 10:
					elemento1 = "Cristal";
					mainApp.setCristal(true);
					break;
				case 11:
					elemento1 = "Arena";
					mainApp.setArena(true);
					break;
				case 12:
					elemento1 = "Cerámica";
					mainApp.setCeramica(true);
					break;
			
				default:
					break;
				}
			
				switch (j) {
				case 0:
					elemento2 = "Agua";
					mainApp.setAgua(true);
					break;
				case 1:
					elemento2 = "Fuego";
					mainApp.setFuego(true);
					break;
				case 2:
					elemento2 = "Tierra";
					mainApp.setTierra(true);
					break;	
				case 3:
					elemento2 = "Aire";
					mainApp.setAire(true);
					break;
				case 4:
					elemento2 = "Vapor";
					mainApp.setVapor(true);
					break;
				case 5:
					elemento2 = "Lluvia";
					mainApp.setLluvia(true);
					break;
				case 6:
					elemento2 = "Barro";
					mainApp.setBarro(true);
					break;
				case 7:
					elemento2 = "Humo";
					mainApp.setHumo(true);
					break;
				case 8:
					elemento2 = "Lava";
					mainApp.setLava(true);
					break;
				case 9:
					elemento2 = "Planta";
					mainApp.setPlanta(true);
					break;
				case 10:
					elemento2 = "Cristal";
					mainApp.setCristal(true);
					break;
				case 11:
					elemento2 = "Arena";
					mainApp.setArena(true);
					break;
				case 12:
					elemento2 = "Cerámica";
					mainApp.setCeramica(true);
					break;
			
				default:
					break;
				}
				
				
				mainApp.reaccion();
				
				if (!elemento1.equals(elemento2)) {
					System.out.println("ELEMENTO PULSADO 1 = ["+elemento1+"]; "+"ELEMENTO PULSADO 2 = ["+elemento2+"]");
				System.out.println("Elemento creado por reacción (true):\nVapor:"+mainApp.getBtnVapor().isVisible()+"\t Lluvia:"+mainApp.getBtnLluvia().isVisible()+"\t Barro:"+mainApp.getBtnBarro().isVisible()+"\t Humo:"+mainApp.getBtnHumo().isVisible()+"\nLava:"+mainApp.getBtnLava().isVisible()+"\t Planta:"+mainApp.getBtnPlanta().isVisible()+"\t Cristal:"+mainApp.getBtnCristal().isVisible()+"\t Arena:"+mainApp.getBtnArena().isVisible()+"\nCerámica:"+mainApp.getBtnCeramica().isVisible());
				System.out.println("");
				}
			
				
			}
			
			
			for (int j = 0; j < 9; j++) {
			
				mainApp.getBtnLluvia().setVisible(false);
				mainApp.getBtnVapor().setVisible(false);
				mainApp.getBtnLava().setVisible(false);
				mainApp.getBtnHumo().setVisible(false);
				mainApp.getBtnArena().setVisible(false);
				mainApp.getBtnBarro().setVisible(false);
				mainApp.getBtnCeramica().setVisible(false);
				mainApp.getBtnCristal().setVisible(false);
				mainApp.getBtnPlanta().setVisible(false);
				
				mainApp.todofalse();
				
				switch (j) {
				case 0:
					mainApp.setAgua(true);
					mainApp.setFuego(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnVapor().isVisible());
					break;

				case 1:
					mainApp.setAgua(true);
					mainApp.setAire(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnLluvia().isVisible());
					break;
				case 2:
					mainApp.setAgua(true);
					mainApp.setTierra(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnBarro().isVisible());
					break;
				case 3:
					mainApp.setFuego(true);
					mainApp.setAire(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnHumo().isVisible());
					break;
				case 4:
					mainApp.setFuego(true);
					mainApp.setTierra(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnLava().isVisible());
					break;
				case 5:
					mainApp.setFuego(true);
					mainApp.setBarro(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnCeramica().isVisible());
					break;
				case 6:
					mainApp.setFuego(true);
					mainApp.setArena(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnCristal().isVisible());
					break;
				case 7:
					mainApp.setTierra(true);
					mainApp.setAire(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnArena().isVisible());
					break;
				case 8:
					mainApp.setTierra(true);
					mainApp.setLluvia(true);
					mainApp.reaccion();
					assertTrue(mainApp.getBtnPlanta().isVisible());
					break;
				}
			}
			
		}
		
		mainApp.todofalse();
		mainApp.botonBlanco();
		
		System.out.println("Cuando se pulsa un botón se colorea, cuando se pulsan dos, hay una reacción y se llama al método para ponerlos blancos y cambiar los booleanos a false:");
		
		mainApp.getBtnAgua().doClick();
		System.out.println(mainApp.getBtnAgua().getBackground());
		System.out.println(mainApp.isAgua());
		
		mainApp.getBtnFuego().doClick();
		System.out.println(mainApp.getBtnFuego().getBackground());
		System.out.println(mainApp.isFuego());
		
		assertEquals(mainApp.getBtnAgua().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnFuego().getBackground().hashCode(), -986896);
		
		mainApp.getBtnTierra().doClick();
		assertNotEquals(mainApp.getBtnTierra().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isTierra());
		mainApp.getBtnAire().doClick();
		assertEquals(mainApp.getBtnAire().getBackground().hashCode(), -986896);
		assertTrue(!mainApp.isAire());
		
		mainApp.getBtnLava().doClick();
		assertNotEquals(mainApp.getBtnLava().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isLava());
		mainApp.getBtnVapor().doClick();
		assertEquals(mainApp.getBtnVapor().getBackground().hashCode(), -986896);
		assertTrue(!mainApp.isVapor());
		
		mainApp.getBtnArena().doClick();
		assertNotEquals(mainApp.getBtnArena().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isArena());
		mainApp.getBtnLluvia().doClick();
		assertEquals(mainApp.getBtnLluvia().getBackground().hashCode(), -986896);
		assertTrue(!mainApp.isLluvia());
		
		mainApp.getBtnHumo().doClick();
		assertNotEquals(mainApp.getBtnHumo().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isHumo());
		mainApp.getBtnBarro().doClick();
		assertEquals(mainApp.getBtnBarro().getBackground().hashCode(), -986896);
		assertTrue(!mainApp.isBarro());
		
		mainApp.getBtnCeramica().doClick();
		assertNotEquals(mainApp.getBtnCeramica().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isCeramica());
		mainApp.getBtnCristal().doClick();
		assertEquals(mainApp.getBtnCristal().getBackground().hashCode(), -986896);
		assertTrue(!mainApp.isCristal());
		
		mainApp.getBtnPlanta().doClick();
		assertNotEquals(mainApp.getBtnPlanta().getBackground().hashCode(), -986896);
		assertTrue(mainApp.isPlanta());
		
		
		
		
		System.out.println("******************** FIN TEST REACCIÓN ********************");	
	}
	
	

}

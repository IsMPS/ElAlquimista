package testsUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import mainApp.MainApp;

class TestBotonBlanco {

	@Test
	void test() {
		System.out.println("Test BotonBlanco");
		System.out.println("******************** INICIO TEST BOTÓN BLANCO ********************");
		MainApp mainApp = new MainApp();
		System.out.println("Damos a los botones el color que tienen cuando están pulsados y estos son sus colores:");
		mainApp.getBtnAgua().setBackground(new Color(80,128,142));
		mainApp.getBtnFuego().setBackground(new Color(214,0,11));
		mainApp.getBtnTierra().setBackground(new Color(95,84,58));
		mainApp.getBtnAire().setBackground(new Color(238,246,255));
		mainApp.getBtnLava().setBackground(new Color(255,106,0));
		mainApp.getBtnVapor().setBackground(new Color(191,209,229));
		mainApp.getBtnArena().setBackground(new Color(214,200,168));
		mainApp.getBtnLluvia().setBackground(new Color(70,95,158));
		mainApp.getBtnHumo().setBackground(new Color(147,149,150));
		mainApp.getBtnBarro().setBackground(new Color(113,49,0));
		mainApp.getBtnCeramica().setBackground(new Color(196,116,97));
		mainApp.getBtnCristal().setBackground(new Color(217,233,255));
		mainApp.getBtnPlanta().setBackground(new Color(51,127,43));
	
		System.out.println(mainApp.getBtnAgua().getBackground());
		System.out.println(mainApp.getBtnFuego().getBackground());
		System.out.println(mainApp.getBtnTierra().getBackground());
		System.out.println(mainApp.getBtnAire().getBackground());
		System.out.println(mainApp.getBtnLava().getBackground());
		System.out.println(mainApp.getBtnVapor().getBackground());
		System.out.println(mainApp.getBtnArena().getBackground());
		System.out.println(mainApp.getBtnLluvia().getBackground());
		System.out.println(mainApp.getBtnHumo().getBackground());
		System.out.println(mainApp.getBtnBarro().getBackground());
		System.out.println(mainApp.getBtnCeramica().getBackground());
		System.out.println(mainApp.getBtnCristal().getBackground());
		System.out.println(mainApp.getBtnPlanta().getBackground());
		
		mainApp.botonBlanco();
		
		System.out.println("Después de usar el método botontBlanco(), todos son blancos:");
		System.out.println(mainApp.getBtnAgua().getBackground());
		System.out.println(mainApp.getBtnFuego().getBackground());
		System.out.println(mainApp.getBtnTierra().getBackground());
		System.out.println(mainApp.getBtnAire().getBackground());
		System.out.println(mainApp.getBtnLava().getBackground());
		System.out.println(mainApp.getBtnVapor().getBackground());
		System.out.println(mainApp.getBtnArena().getBackground());
		System.out.println(mainApp.getBtnLluvia().getBackground());
		System.out.println(mainApp.getBtnHumo().getBackground());
		System.out.println(mainApp.getBtnBarro().getBackground());
		System.out.println(mainApp.getBtnCeramica().getBackground());
		System.out.println(mainApp.getBtnCristal().getBackground());
		System.out.println(mainApp.getBtnPlanta().getBackground());
		

		assertEquals(mainApp.getBtnAgua().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnFuego().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnTierra().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnAire().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnLava().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnVapor().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnArena().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnLluvia().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnHumo().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnBarro().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnCeramica().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnCristal().getBackground().hashCode(), -986896);
		assertEquals(mainApp.getBtnPlanta().getBackground().hashCode(), -986896);
		
		System.out.println("******************** FIN TEST BOTÓN BLANCO ********************");	
	}

}

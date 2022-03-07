package testsUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApp.MainApp;

class TestChuletas {

	@Test
	void testChuletas() {
		System.out.println("Test Chuletas");
		System.out.println("******************** INICIO TEST CHULETAS ********************");
		MainApp mainApp = new MainApp();
		
		System.out.println("El panel de chuletas es invisible.");
		assertTrue(!mainApp.getPanel().isVisible());
		System.out.println(mainApp.getPanel().isVisible());
		
		mainApp.getBtnChuletas().doClick();
		
		System.out.println("Cuando hacemos clic el panel es visible.");
		assertTrue(mainApp.getPanel().isVisible());
		System.out.println(mainApp.getPanel().isVisible());
		
		System.out.println("******************** FIN TEST CHULETAS ********************");
		
	}

}

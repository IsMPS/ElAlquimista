package testsUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApp.MainApp;

class TestTodoFalse {

	@Test
	void testTodoFalse() {
		System.out.println("TestTodoFalse");
		System.out.println("******************** INICIO TEST TODO FALSE ********************");
		MainApp mainApp = new MainApp();
		
		for (int i = 0; i < 13; i++) {
			
		switch (i) {
		case 0:
			mainApp.setAgua(true);
			System.out.println("Pulsamos botón AGUA --> ESTADO:"+mainApp.isAgua());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isAgua()+"\n");
			assertTrue(!mainApp.isAgua());
			break;
		case 1:
			mainApp.setFuego(true);
			System.out.println("Pulsamos botón FUEGO --> ESTADO:"+mainApp.isFuego());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isFuego()+"\n");
			assertTrue(!mainApp.isFuego());
			break;
		case 2:
			mainApp.setAire(true);
			System.out.println("Pulsamos botón AIRE --> ESTADO:"+mainApp.isAire());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isAire()+"\n");
			assertTrue(!mainApp.isAire());
			break;
		case 3:
			mainApp.setTierra(true);
			System.out.println("Pulsamos botón TIERRA --> ESTADO:"+mainApp.isTierra());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isTierra()+"\n");
			assertTrue(!mainApp.isTierra());
			break;
		case 4:
			mainApp.setVapor(true);
			System.out.println("Pulsamos botón VAPOR --> ESTADO:"+mainApp.isVapor());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isVapor()+"\n");
			assertTrue(!mainApp.isVapor());
			break;
		case 5:
			mainApp.setLluvia(true);
			System.out.println("Pulsamos botón LLUVIA --> ESTADO:"+mainApp.isLluvia());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isLluvia()+"\n");
			assertTrue(!mainApp.isLluvia());
			break;
		case 6:
			mainApp.setBarro(true);
			System.out.println("Pulsamos botón BARRO --> ESTADO:"+mainApp.isBarro());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isBarro()+"\n");
			assertTrue(!mainApp.isBarro());
			break;
		case 7:
			mainApp.setHumo(true);
			System.out.println("Pulsamos botón HUMO --> ESTADO:"+mainApp.isHumo());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isHumo()+"\n");
			assertTrue(!mainApp.isHumo());
			break;
		case 8:
			mainApp.setLava(true);
			System.out.println("Pulsamos botón LAVA --> ESTADO:"+mainApp.isLava());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isLava()+"\n");
			assertTrue(!mainApp.isLava());
			break;
		case 9:
			mainApp.setCeramica(true);
			System.out.println("Pulsamos botón CERÁMICA --> ESTADO:"+mainApp.isCeramica());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isCeramica()+"\n");
			assertTrue(!mainApp.isCeramica());
			break;
		case 10:
			mainApp.setCristal(true);
			System.out.println("Pulsamos botón CRISTAL --> ESTADO:"+mainApp.isCristal());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isCristal()+"\n");
			assertTrue(!mainApp.isCristal());
			break;
		case 11:
			mainApp.setArena(true);
			System.out.println("Pulsamos botón ARENA --> ESTADO:"+mainApp.isArena());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isArena()+"\n");
			assertTrue(!mainApp.isArena());
			break;
		case 12:
			mainApp.setPlanta(true);
			System.out.println("Pulsamos botón PLANTA --> ESTADO:"+mainApp.isPlanta());
			mainApp.todofalse();
			System.out.println("Usamos método todofalse() --> ESTADO:"+mainApp.isPlanta()+"\n");
			assertTrue(!mainApp.isPlanta());
			break;
		default:
			break;
		}	
			
			
		}
		System.out.println("******************** FIN TEST TODO FALSE ********************");	
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

import enumCLub.TipoDeBicicleta;

public class TestClub2 {

	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", nuevo.getEstilo());
		assertEquals(1, nuevo.getId());
	}
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
		nuevo.setKilometrosEntrenados(50000);
		
		assertEquals(10000, nuevo.getDistanciaPreferida());
		assertEquals(50000, nuevo.getKilometrosEntrenados());
		assertEquals(2, nuevo.getId());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, nuevo.getTipoBicicleta());
		assertEquals(3, nuevo.getId());
	}

	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarSocio(new Corredor(1000, "Camila", 42000));
		actual.agregarSocio(new Corredor(1001, "Natalia", 5000));
		actual.agregarSocio(new Corredor(1002, "Jorge", 21000));
		actual.agregarSocio(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarSocio(new Triatleta(1004, "Tamara", "Olimpico", TipoDeBicicleta.RUTA));
		actual.agregarSocio(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarSocio(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarSocio(new Corredor(1007, "Luciana", 10000));
		actual.agregarSocio(new Nadador(1008, "Luna", "Crol"));
		actual.agregarSocio(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarSocio(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA));
			
		assertEquals( 10, actual.cantidadDeSocios());		
	}
	
	
	
	
	
}

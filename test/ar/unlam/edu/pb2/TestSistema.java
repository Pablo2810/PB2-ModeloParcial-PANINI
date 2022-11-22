package ar.unlam.edu.pb2;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestSistema {

	@Test
	public void queSePuedaCrearUnaFigurita() throws GrupoNoEncontradoException, SeleccionNoEncontradaException {
		Sistema sistema = new Sistema();
		Grupo grupoE = sistema.buscarGrupoPorID(1);
		Seleccion alemania = sistema.buscarSeleccionPorID(1);
		Figurita figurita = new Figurita(1,grupoE,alemania,"Neuer",1200);
		
		assertNotNull(figurita);
	}
	
	@Test
	public void queSePuedaCrearUnAdministrador() {
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() {
		
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		
	}
}

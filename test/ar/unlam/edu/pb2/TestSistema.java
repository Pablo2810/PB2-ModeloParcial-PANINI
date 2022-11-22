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
		Usuario admin = new Administrador(1,"ADMIN");
		assertNotNull(admin);
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Usuario userFinal = new Final(1,"FINAL");
		assertNotNull(userFinal);
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws GrupoNoEncontradoException, SeleccionNoEncontradaException {
		Sistema sistema = new Sistema();
		Usuario admin = new Administrador(1,"ADMIN");
		Grupo grupoE = sistema.buscarGrupoPorID(1);
		Seleccion alemania = sistema.buscarSeleccionPorID(1);
		Figurita figurita = new Figurita(1,grupoE,alemania,"Neuer",1200);
		
		sistema.agregarFigurita(admin, figurita);
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		
	}
}

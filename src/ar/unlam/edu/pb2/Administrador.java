package ar.unlam.edu.pb2;

public class Administrador extends Usuario {
	
	public Administrador(Integer id, String nombre) {
		super(id, nombre);
	}

	@Override
	void agregarFigurita(Figurita figurita, Sistema sistema) throws FiguritaEnSistemaException {
		sistema.agregarFigurita(figurita);
	}

}

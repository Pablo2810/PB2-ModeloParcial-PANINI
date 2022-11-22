package ar.unlam.edu.pb2;
import java.util.ArrayList;
import java.util.List;

public class Final extends Usuario {
	private List<Figurita> figuritas;

	public Final(Integer id, String nombre) {
		super(id, nombre);
		this.figuritas = new ArrayList<>();
	}

	@Override
	void agregarFigurita(Figurita figurita, Sistema sistema) throws FiguritaEnSistemaException {
		figuritas.add(figurita);
		sistema.agregarFigurita(figurita);
	}

}

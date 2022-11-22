package ar.unlam.edu.pb2;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Sistema {
	private Set<Figurita> figuritas;
	private List<Grupo> grupos;
	private List<Seleccion> selecciones;
	
	public Sistema() {
		this.figuritas = new TreeSet<>(); 
		this.grupos = this.crearGrupos();
		this.selecciones = this.crearSelecciones();
	}

	private List<Grupo> crearGrupos() {
		List<Grupo> misGrupos = new ArrayList<>();
		misGrupos.add(new Grupo(1, 'E'));
		misGrupos.add(new Grupo(2, 'F'));
		misGrupos.add(new Grupo(3, 'G'));
		return misGrupos;
	}

	private List<Seleccion> crearSelecciones() {
		List<Seleccion> misSelecciones = new ArrayList<>();
		misSelecciones.add(new Seleccion(1, "Alemania"));
		misSelecciones.add(new Seleccion(2, "Belgica"));
		misSelecciones.add(new Seleccion(3, "Brasil"));
		return misSelecciones;
	}

	public Set<Figurita> getFiguritas() {
		return figuritas;
	}
	
	public void setFiguritas(Set<Figurita> figuritas) {
		this.figuritas = figuritas;
	}
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public List<Seleccion> getSelecciones() {
		return selecciones;
	}
	
	public void setSelecciones(List<Seleccion> selecciones) {
		this.selecciones = selecciones;
	}

	public Grupo buscarGrupoPorID(Integer id) throws GrupoNoEncontradoException {
		for (Grupo grupo : grupos) {
			if (grupo.getId().equals(id)) {
				return grupo;
			}
		}
		throw new GrupoNoEncontradoException("GRUPO NO ENCONTRADO");
	}

	public Seleccion buscarSeleccionPorID(Integer id) throws SeleccionNoEncontradaException {
		for (Seleccion seleccion : selecciones) {
			if (seleccion.getId().equals(id)) {
				return seleccion;
			}
		}
		throw new SeleccionNoEncontradaException("SELECCION NO ENCONTRADA");
	}
	
	
}

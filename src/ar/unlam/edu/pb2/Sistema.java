package ar.unlam.edu.pb2;
import java.util.List;

public class Sistema {
	private List<Figurita> figuritas;
	private List<Grupo> grupos;
	private List<Seleccion> selecciones;
	
	public Sistema() {
		
	}
	
	public List<Figurita> getFiguritas() {
		return figuritas;
	}
	
	public void setFiguritas(List<Figurita> figuritas) {
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
	
}

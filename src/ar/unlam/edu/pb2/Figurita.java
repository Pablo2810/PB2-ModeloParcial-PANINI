package ar.unlam.edu.pb2;

public class Figurita {
	private Integer codigo;
	private Grupo grupo;
	private Seleccion seleccion;
	private String nombreJug;
	private Integer valorJug;

	public Figurita(Integer codigo, Grupo grupo, Seleccion seleccion, String nombreJug, Integer valorJug) {
		this.codigo = codigo;
		this.grupo = grupo;
		this.seleccion = seleccion;
		this.nombreJug = nombreJug;
		this.valorJug = valorJug;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Seleccion getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}

	public String getNombreJug() {
		return nombreJug;
	}

	public void setNombreJug(String nombreJug) {
		this.nombreJug = nombreJug;
	}

	public Integer getValorJug() {
		return valorJug;
	}

	public void setValorJug(Integer valorJug) {
		this.valorJug = valorJug;
	}

}

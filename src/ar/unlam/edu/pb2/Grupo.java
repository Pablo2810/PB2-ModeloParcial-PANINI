package ar.unlam.edu.pb2;

public class Grupo {
	private Integer id;
	private Character letra;
	
	public Grupo(Integer id, Character letra) {
		this.id = id;
		this.letra = letra;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}
	
}

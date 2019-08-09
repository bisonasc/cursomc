package com.beatriz.cursomc.domain;

import java.io.Serializable;

/*interface Serializable que diz que os objetos dessa classe poderão ser convertidos em uma 
* sequencia de bits, que podem ser gravado em arquivos e trafegar em redes*/
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	
	public Categoria() {
	/*instancia os objetos sem jogar nada para os atributos*/	
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*pra que dois objetos possam ser comparados pelo conteudo e nao pelo ponteiro de memoria, 
	 * tem que ter os hashcode icons, compara os objetos pelo conteudo e nao pelo valor  */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

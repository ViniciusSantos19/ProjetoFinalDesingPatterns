package br.edu.ifba.inf011.model.decorator;

import java.io.IOException;
import java.util.List;

import br.edu.ifba.inf011.model.Musica;

public abstract class MusicaDecorator implements Musica{
	//Padrão de projeto decorator foi implementado 
	protected Musica musica;
	private List<String> letras;
	private Integer linha;
	private String nome;
	
	public MusicaDecorator(Musica musica) throws IOException {
		super();
		this.musica = musica;
		this.nome = this.musica.getNome();
		this.reset();
	}
	
	@Override
	public String getNome() {
		
		return this.nome;
	}

	@Override
	public String execute() {
		StringBuffer str = new StringBuffer();
		this.reset();
		while(!this.finish())
			str.append(this.musica.play() + "\n"+ this.play() + "\n");
		return str.toString();
	}

	@Override
	public void reset() {
		this.linha = 0;
		this.musica.reset();
	}

	@Override
	public Boolean finish() {
		
		return  linha >= this.letras.size();
	}

	@Override
	public String play() {
		return this.letras.get(linha++);
	}

	public void setLetras(List<String> letras) {
		this.letras = letras;
	}

	public Integer getLinha() {
		return linha;
	}
	
	
	
	
	
}

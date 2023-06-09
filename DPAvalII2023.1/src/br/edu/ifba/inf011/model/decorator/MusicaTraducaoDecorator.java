package br.edu.ifba.inf011.model.decorator;

import java.io.IOException;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.resources.ResourceLoader;

public class MusicaTraducaoDecorator extends MusicaDecorator{
	
	
	public MusicaTraducaoDecorator(Musica musica) throws IOException {
		super(musica);
		this.setLetras(ResourceLoader.instance().loadTraducao(getNome()));
	}	

}

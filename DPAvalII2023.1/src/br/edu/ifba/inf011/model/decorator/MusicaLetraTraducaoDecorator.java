package br.edu.ifba.inf011.model.decorator;

import java.io.IOException;
import java.util.List;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.resources.ResourceLoader;

public class MusicaLetraTraducaoDecorator extends MusicaDecorator{
	
	private List<String> notas;
	private List<String> traducao;
	
	public MusicaLetraTraducaoDecorator(Musica musica) throws IOException {
		super(musica);
		this.setLetras(ResourceLoader.instance().loadLetra(getNome()));
		this.traducao = ResourceLoader.instance().loadTraducao(getNome());
		this.notas = ResourceLoader.instance().loadNotas(getNome());
	}
	
	@Override
	public String execute() {
		StringBuffer str = new StringBuffer();
		this.reset();
		while(!this.finish())
			str.append(this.percorreNotas() + "\n"+ this.play() + "\n" + percorreTraducao() +"\n");
		return str.toString();
	}
	
	private String percorreTraducao() {
		return this.traducao.get(this.getLinha()-1);
	}
	
	private String percorreNotas() {
		return this.notas.get(getLinha());
	}

}

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
		str.append(this.getNome()+"\n");
		int size = Math.max(notas.size(), traducao.size());
		for(int i = 0; i < size; i++) {
			if(!isNotasFinished()) {
				str.append(notas.get(i)+"\n");
				
			}
			if(!this.finish()) {
				str.append(this.play()+"\n");
			}
			
			if(!this.percorreTraducao()) {
				str.append(this.traducao.get(i)+"\n");
			}
		}
		return str.toString();
	}
	
	private Boolean percorreTraducao() {
		return this.getLinha() >= this.traducao.size();
	}
	
	private Boolean isNotasFinished() {
		return this.getLinha() >= this.notas.size();
	}
	
	

}

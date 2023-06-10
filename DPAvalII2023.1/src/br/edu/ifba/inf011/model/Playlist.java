package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class Playlist implements Component{
	
	private String nome;
	//private List<Musica> musicas;
	//private List<Playlist> playlists;
	private List<Component> componente;
	
	public Playlist(String nome) {
		this.nome = nome;
		//this.musicas = new ArrayList<Musica>();
		//this.playlists = new ArrayList<Playlist>();
		this.componente = new ArrayList<Component>();
;;	}
	
	/*public void insert(Musica musica) {
		this.musicas.add(musica);
	}
	
	public void insert(Playlist playlist) {
		this.playlists.add(playlist);
	}*/
	
	public void insert(Component component) {
		this.componente.add(component);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String randomize() {
		return null;
	}
	
	public String execute() {
		StringBuffer str = new StringBuffer();
		str.append(this.getNome()+"\n");
		for (Component componente : this.componente) {
			str.append(componente.execute()+ "\n");
		}
		return str.toString();
	}	 

}

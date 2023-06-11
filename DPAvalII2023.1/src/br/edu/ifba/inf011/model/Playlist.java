package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.edu.ifba.inf011.model.composite.Component;

public class Playlist implements Component{
	//Alteramos essa classe para que ela implemente
	//a interface component assim tornando ela um
	//componente composto do padrão composite.
	//Também removemos a lista de playlist e a lista de múscia
	//e deixamos apenas um lista de componente
	
	private String nome;
	//private List<Musica> musicas;
	//private List<Playlist> playlists;
	private List<Component> componente;
	
	public Playlist(String nome) {
		this.nome = nome;
		//this.musicas = new ArrayList<Musica>();
		//this.playlists = new ArrayList<Playlist>();
		this.componente = new ArrayList<Component>();
	}
	
	
	
	public void insert(Component component) {
		this.componente.add(component);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String randomize() {
		if(this.componente.isEmpty()) {
			return null;
		}
		
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(this.componente.size());
		Component componenteAleatorio = this.componente.get(num);
		if(componenteAleatorio instanceof Musica) {
			return componenteAleatorio.execute();
		}else if(componenteAleatorio instanceof Playlist) {
			 Playlist randomPlaylist = (Playlist) componenteAleatorio;
			 return randomPlaylist.randomize();
		}
		
		
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

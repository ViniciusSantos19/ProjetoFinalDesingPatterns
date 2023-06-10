package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class Player {
	
	private List<Component> componentes;
	private PlayerMode mode;
	private Integer index;
	
	public Player() {
		this.setMode(PlayerMode.PlayerAll);
		this.reset();
		this.componentes= new ArrayList<Component>();
	}
	
	public void insert(Component componente) {
		this.componentes.add(componente);
	}

	
	public boolean temProximo() {
		return this.index >= this.componentes.size();
	}
	
	public String proximo() {
		return this.componentes.get(this.index++).execute();
	}
	
	public void reset() {
		this.index = 0;
	}
	
	public void setMode(PlayerMode mode) {
		this.mode = mode;
	}
	

}

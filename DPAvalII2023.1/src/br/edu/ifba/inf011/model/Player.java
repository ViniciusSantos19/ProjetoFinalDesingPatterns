package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;
import br.edu.ifba.inf011.model.iterator.ConcretePlayerModeColleciton;
import br.edu.ifba.inf011.model.iterator.PlayerModeCollection;
import br.edu.ifba.inf011.model.iterator.PlayerModeIteratorAbstract;
import br.edu.ifba.inf011.model.observer.PlayerModeObserver;

public class Player {
	
	private List<PlayerModeObserver> observadores;
	private PlayerMode mode = PlayerMode.PlayerAll;
	private PlayerModeIteratorAbstract modo;
	private PlayerModeCollection playerModeCollection;
	
	public Player()  {
		this.observadores = new ArrayList<PlayerModeObserver>();
		this.playerModeCollection = new ConcretePlayerModeColleciton();
		this.adicionarObservador();
		this.modo = playerModeCollection.getIterator();
		this.reset();
	}
	
	public void insert(Component componente) {
		this.playerModeCollection.setLista(componente);
	}

	
	public boolean temProximo() {
		return this.modo.temProximo();
	}
	
	public String proximo() {
		return this.modo.proximo().execute();
	}
	
	public void reset() {
		this.modo.reset();
	}
	
	public void setMode(PlayerMode mode){
		this.mode = mode;
		this.observadores.forEach(a-> a.onModeChanged(mode));
		this.modo = playerModeCollection.getIterator();
	}
	
	private void adicionarObservador() {
		this.observadores.add(playerModeCollection);
	}
	

}
 
package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;
import br.edu.ifba.inf011.model.iterator.ConcretePlayerModeColleciton;
import br.edu.ifba.inf011.model.iterator.PlayerModeCollection;
import br.edu.ifba.inf011.model.iterator.PlayerModeIteratorAbstract;
import br.edu.ifba.inf011.model.observer.PlayerModeObserver;
import br.edu.ifba.inf011.model.observer.Subject;

public class Player implements Subject{
	// Subject do padrao de projeto observer
	//também possui um iterator
	private PlayerModeLogger logger;
	private List<PlayerModeObserver> observadores;
	private PlayerMode mode = PlayerMode.PlayerAll;
	private PlayerModeIteratorAbstract modo;
	private PlayerModeCollection playerModeCollection;
	
	public Player()  {
		this.observadores = new ArrayList<PlayerModeObserver>();
		this.playerModeCollection = new ConcretePlayerModeColleciton();
		this.adicionarObservavel(playerModeCollection);;
		this.modo = playerModeCollection.getIterator();
		this.logger = new PlayerModeLogger();
		this.adicionarObservavel(logger);
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
		this.notifyObservaveis();
		this.modo = playerModeCollection.getIterator();
	}

	@Override
	public void adicionarObservavel(PlayerModeObserver observer) {
		this.observadores.add(observer);
	}

	@Override
	public void removerObservavel(PlayerModeObserver observer) {
		this.observadores.remove(observer);
	}

	@Override
	public void notifyObservaveis() {
		this.observadores.forEach(a-> a.onModeChanged(this.mode));
		
	}


}
 
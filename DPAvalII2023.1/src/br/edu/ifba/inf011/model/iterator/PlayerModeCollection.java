package br.edu.ifba.inf011.model.iterator;

import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;
import br.edu.ifba.inf011.model.observer.PlayerModeObserver;

public interface PlayerModeCollection extends PlayerModeObserver{
	//Collection do iterator PlayerMode que tem um método
	//para criar um novo playerModeIterator
	public PlayerModeIteratorAbstract getIterator();
	public void setLista(List<Component> lista);
}

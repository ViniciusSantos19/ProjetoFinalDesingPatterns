package br.edu.ifba.inf011.model.iterator;

import br.edu.ifba.inf011.model.composite.Component;

public interface PlayerModeIterator {
	//Essa interface é  um iterator que será usada
	//pela classe Player
	public Boolean temProximo();
	public Component proximo();
	public void reset();
}

package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;
import br.edu.ifba.inf011.model.erros.InvalidPlayerModeExption;
import br.edu.ifba.inf011.model.iterator.PlayerAllMode;
import br.edu.ifba.inf011.model.iterator.PlayerModeIterator;
import br.edu.ifba.inf011.model.iterator.RandomMode;
import br.edu.ifba.inf011.model.iterator.RepeatAllMode;

public class Player {
	
	private List<Component> componentes;
	private PlayerMode mode;
	private PlayerModeIterator modo;
	
	public Player() throws InvalidPlayerModeExption {
		this.componentes= new ArrayList<Component>();
		this.setMode(PlayerMode.PlayerAll);
		this.reset();
	}
	
	public void insert(Component componente) {
		this.componentes.add(componente);
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
	
	public void setMode(PlayerMode mode) throws InvalidPlayerModeExption {
		switch(mode) {
		case PlayerAll:
			this.modo = new PlayerAllMode(componentes);
			break;
		case RandomMode:
			this.modo = new RandomMode(componentes);
			break;
		case RepeatAll:
			this.modo = new RepeatAllMode(componentes);
			break;
			default:
				throw new InvalidPlayerModeExption("PlayerMode invalido");
		}
	}
	

}
 
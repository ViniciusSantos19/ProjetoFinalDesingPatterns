package br.edu.ifba.inf011.model.iterator;


import java.util.List;
import java.util.Random;

import br.edu.ifba.inf011.model.composite.Component;

public class RandomMode extends PlayerModeIteratorAbstract{
	
	public RandomMode(List<Component> componentes) {
		super(componentes);
	}
	
	public Component getCompenent() {
		Random aleatorio = new Random();
		Component component = this.getComponents().get(aleatorio.nextInt(getSize()));
		return component;
	}


}

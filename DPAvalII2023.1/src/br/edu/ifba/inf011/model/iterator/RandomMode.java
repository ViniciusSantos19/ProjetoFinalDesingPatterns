package br.edu.ifba.inf011.model.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class RandomMode extends PlayerModeIteratorAbstract{
	
	public RandomMode(List<Component> componentes) {
		super(componentes);
		Collections.shuffle(super.getComponents());
		this.reset();
	}


}

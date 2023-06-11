package br.edu.ifba.inf011.model.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class RandomMode implements PlayerModeIterator{
	
	private List<Component> componentes;
	private int currentIndex;

	
	
	public RandomMode(List<Component> componentes) {
		super();
		this.componentes = new ArrayList<Component>(componentes);
		Collections.shuffle(this.componentes);
		this.reset();
	}

	@Override
	public Boolean temProximo() {
		// TODO Auto-generated method stub
		return this.currentIndex>= this.componentes.size();
	}

	@Override
	public Component proximo() {
		Component component = this.componentes.get(currentIndex);
		currentIndex++;
		return component;
	}

	@Override
	public void reset() {
		this.currentIndex = 0;
	}

}

package br.edu.ifba.inf011.model.iterator;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class PlayerAllMode implements PlayerModeIterator{
	
	 private List<Component> components;
	 private int currentIndex;
	
	 
	 
	public PlayerAllMode(List<Component> components) {
		super();
		this.components = new ArrayList<Component>(components);
		reset();
	}

	@Override
	public Boolean temProximo() {
		return currentIndex >= this.components.size();
	}

	@Override
	public Component proximo() {
		Component component = this.components.get(currentIndex);
		currentIndex++;
		return component;
	}

	@Override
	public void reset() {
		this.currentIndex = 0;
		
	}
	
}

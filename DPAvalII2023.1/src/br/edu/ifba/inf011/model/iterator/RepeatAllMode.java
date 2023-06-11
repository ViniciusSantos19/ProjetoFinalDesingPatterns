package br.edu.ifba.inf011.model.iterator;

import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class RepeatAllMode implements PlayerModeIterator{
	
	private List<Component> components;
	private int currentIndex;
	
	
	
	public RepeatAllMode(List<Component> components) {
		super();
		this.components = components;
		reset();
	}

	@Override
	public Boolean temProximo() {
		return this.currentIndex >= this.components.size();
	}

	@Override
	public Component proximo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		this.currentIndex = 0;
		
	}

}

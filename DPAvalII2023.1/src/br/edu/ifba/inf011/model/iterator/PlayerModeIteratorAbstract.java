package br.edu.ifba.inf011.model.iterator;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public abstract class PlayerModeIteratorAbstract implements PlayerModeIterator{
	
	private List<Component> components;
	private int currentIndex;
	
	
	
	public PlayerModeIteratorAbstract(List<Component> components) {
		super();
		this.components = new ArrayList<Component>(components);
		this.reset();
	}

	@Override
	public Boolean temProximo() {
		return currentIndex >= this.components.size();
	}


	@Override
	public void reset() {
		this.currentIndex = 0;
		
	}

	public Component getCompenent() {
		Component component = this.components.get(currentIndex);
		currentIndex++;
		return component;
	}
	
	@Override
	public Component proximo() {
		Component component = this.getCompenent();
		return component;
	}

	public List<Component> getComponents() {
		return components;
	}


	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}
	
	
	

}

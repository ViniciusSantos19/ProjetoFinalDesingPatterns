package br.edu.ifba.inf011.model.iterator;

import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public abstract class PlayerModeIteratorAbstract implements PlayerModeIterator{
	//classe abstrata que implementa a interface do iterator
	//fizemos isso pois algumas partes do código estavam
	//repetidas
	private List<Component> components;
	private int currentIndex;
	
	
	
	public PlayerModeIteratorAbstract(List<Component> components) {
		super();
		this.components = components;
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


	public int getCurrentIndex() {
		return currentIndex;
	}

	

	public int getSize() {
		return this.components.size();
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	
	

}

package br.edu.ifba.inf011.model.iterator;

import java.util.List;

import br.edu.ifba.inf011.model.composite.Component;

public class RepeatAllMode extends PlayerModeIteratorAbstract{
	
	
	
	
	public RepeatAllMode(List<Component> components) {
		super(components);
	}


	@Override
	public Component proximo() {
		if(this.temProximo()) {
			this.reset();
		}
		return super.proximo();
		
	}


}

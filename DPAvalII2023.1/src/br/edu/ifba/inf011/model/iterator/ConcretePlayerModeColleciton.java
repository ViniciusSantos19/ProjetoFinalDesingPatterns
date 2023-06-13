package br.edu.ifba.inf011.model.iterator;

import java.util.List;

import br.edu.ifba.inf011.model.PlayerMode;
import br.edu.ifba.inf011.model.composite.Component;
import br.edu.ifba.inf011.model.erros.InvalidPlayerModeExption;

public class ConcretePlayerModeColleciton implements PlayerModeCollection{
	
	private List<Component> lista; 
	private PlayerModeIteratorAbstract modo;

	public ConcretePlayerModeColleciton(List<Component> componentes) {
		super();
		this.modo = new PlayerAllMode(componentes);
		this.lista = componentes;
	}


	@Override
	public PlayerModeIteratorAbstract getIterator() {
		// TODO Auto-generated method stub
		return this.modo;
	}

	@Override
	public void setLista(List<Component> lista) {
		this.modo.setComponents(lista);
		
	}


	@Override
	public void onModeChanged(PlayerMode newMode) {
		switch(newMode) {
		case PlayerAll:
			this.modo = new PlayerAllMode(this.lista);
			break;
		case RandomMode:
			this.modo = new RandomMode(this.lista);
			break;
		case RepeatAll:
			this.modo = new RepeatAllMode(this.lista);
			break;
		}
		
	}
	
	
}

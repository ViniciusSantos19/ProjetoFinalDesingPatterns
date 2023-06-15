package br.edu.ifba.inf011.model.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifba.inf011.model.PlayerMode;
import br.edu.ifba.inf011.model.composite.Component;

public class ConcretePlayerModeColleciton implements PlayerModeCollection{
	
	private Map<PlayerMode, PlayerModeIteratorAbstract> mapaModos; 
	private List<Component> lista; 
	private PlayerModeIteratorAbstract modo;

	public ConcretePlayerModeColleciton() {
		super();
		this.lista = new ArrayList<Component>();
		this.modo = new PlayerAllMode(lista);
		this.mapaModos = new HashMap<PlayerMode, PlayerModeIteratorAbstract>();
		this.iniciarMapa();
	}


	@Override
	public PlayerModeIteratorAbstract getIterator() {
		// TODO Auto-generated method stub
		return this.modo;
	}

	@Override
	public void setLista(Component component) {
		this.lista.add(component);
		
	}


	@Override
	public void onModeChanged(PlayerMode newMode) {
		int indiceAtual = this.modo.getCurrentIndex();
		this.modo = mapaModos.get(newMode);
		this.modo.setCurrentIndex(indiceAtual);
	}
	
	private void iniciarMapa() {
		this.mapaModos.put(PlayerMode.PlayerAll, new PlayerAllMode(lista));
		this.mapaModos.put(PlayerMode.RandomMode, new RandomMode(lista));
		this.mapaModos.put(PlayerMode.RepeatAll, new RepeatAllMode(lista));
	}
	
	
}

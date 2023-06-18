package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.model.observer.PlayerModeObserver;

public class PlayerModeLogger implements PlayerModeObserver{
	//essa classe é apenas um teste para o observer
	@Override
	public void onModeChanged(PlayerMode newMode) {
		System.out.println("O modo do player foi alterado para: "+newMode);
		
	}

}

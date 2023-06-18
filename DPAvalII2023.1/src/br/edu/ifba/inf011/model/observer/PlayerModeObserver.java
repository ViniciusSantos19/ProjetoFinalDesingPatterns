package br.edu.ifba.inf011.model.observer;

import br.edu.ifba.inf011.model.PlayerMode;

public interface PlayerModeObserver {
	//interface do observer na qual o objeto que a implementar
	// vai ser notificada
	 void onModeChanged(PlayerMode newMode);
}

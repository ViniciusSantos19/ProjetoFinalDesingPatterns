package br.edu.ifba.inf011.model.observer;

import br.edu.ifba.inf011.model.PlayerMode;

public interface PlayerModeObserver {
	 void onModeChanged(PlayerMode newMode);
}

package br.edu.ifba.inf011.model.observer;

import br.edu.ifba.inf011.model.PlayerMode;
import br.edu.ifba.inf011.model.erros.InvalidPlayerModeExption;

public interface PlayerModeObserver {
	 void onModeChanged(PlayerMode newMode);
}

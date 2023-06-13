package br.edu.ifba.inf011.model.observer;

public interface PlayerModeObserver {
	public void addObserver(String playerModeChanged);
	public void removeObserver(String playerModeChanged);
	
}

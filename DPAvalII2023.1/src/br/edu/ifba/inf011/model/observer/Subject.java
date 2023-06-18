package br.edu.ifba.inf011.model.observer;

public interface Subject {
	//interface do subject do padrao de projetos observer
	public void adicionarObservavel(PlayerModeObserver observer);
	public void removerObservavel(PlayerModeObserver observer);
	public void notifyObservaveis();
}

package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.model.composite.Component;

public interface Musica extends  Component{
	//Colocamos essa inteface  para extender Component
	//assim tornando ela uma "folha" do padrão de projeto estrutural
	//composite
	public String getNome();
	public String execute();
	public void reset();
	public Boolean finish();
	public String play();
}

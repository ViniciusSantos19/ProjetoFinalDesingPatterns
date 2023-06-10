package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.model.composite.Component;

public interface Musica extends  Component{
	public String getNome();
	public String execute();
	public void reset();
	public Boolean finish();
	public String play();
}

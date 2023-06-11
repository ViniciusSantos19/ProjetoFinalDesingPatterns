package br.edu.ifba.inf011.model.erros;

import javax.swing.tree.ExpandVetoException;

@SuppressWarnings("serial")
public class InvalidPlayerModeExption extends Exception{
	public InvalidPlayerModeExption(String erro) {
		super(erro);
	}
}

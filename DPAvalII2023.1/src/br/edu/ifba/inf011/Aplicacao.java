package br.edu.ifba.inf011;

import java.io.IOException;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.MusicaNotas;
import br.edu.ifba.inf011.model.Player;
import br.edu.ifba.inf011.model.PlayerMode;
import br.edu.ifba.inf011.model.Playlist;
import br.edu.ifba.inf011.model.decorator.MusicaLetraDecorator;
import br.edu.ifba.inf011.model.decorator.MusicaLetraTraducaoDecorator;
import br.edu.ifba.inf011.model.decorator.MusicaTraducaoDecorator;
import br.edu.ifba.inf011.model.erros.InvalidPlayerModeExption;

public class Aplicacao{

	
	private void musica() throws IOException {

		//ResourceLoader.DIR_NAME = "D:\\workspace\\DPAvalII2023.1\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";
		
		Musica musica =  new MusicaLetraDecorator(new MusicaNotas("Lullaby"));
		Musica musicaTraduzida = new MusicaTraducaoDecorator(musica);
		
		Musica musicaCompleta  = new MusicaLetraTraducaoDecorator(musicaTraduzida);
		
		System.out.println(musicaCompleta.execute());
		
		
	}
	
	
	private void teste() throws IOException, InvalidPlayerModeExption {

		//ResourceLoader.DIR_NAME = "D:\\workspace\\DPAvalII2023.1\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";
		Player player = new Player();
		Musica musica =  new MusicaLetraDecorator(new MusicaNotas("Lullaby"));
		Musica musica2 = new MusicaTraducaoDecorator(new MusicaNotas("GodSaveTheQueen"));
		Musica Musica3 = new MusicaLetraDecorator(new MusicaNotas("AndreaDorea"));
		player.setMode(PlayerMode.RandomMode);
		player.insert(musica);
		player.insert(musica2);
		//player.insert(Musica3);
		//player.setMode(PlayerMode.RepeatAll);
		System.out.println(player.proximo());
		System.out.println(player.proximo());
		//System.out.println(player.proximo());
		//System.out.println(player.proximo());
		//System.out.println(player.proximo());
	}
	
	public static void main(String[] args) throws IOException{
		Aplicacao app = new Aplicacao();
		//app.musica();
		try {
			app.teste();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPlayerModeExption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






	

}

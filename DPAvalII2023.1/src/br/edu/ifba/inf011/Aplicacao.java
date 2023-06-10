package br.edu.ifba.inf011;

import java.io.IOException;

import br.edu.ifba.inf011.model.Musica;
import br.edu.ifba.inf011.model.MusicaNotas;
import br.edu.ifba.inf011.model.Player;
import br.edu.ifba.inf011.model.Playlist;
import br.edu.ifba.inf011.model.decorator.MusicaLetraDecorator;
import br.edu.ifba.inf011.model.decorator.MusicaLetraTraducaoDecorator;
import br.edu.ifba.inf011.model.decorator.MusicaTraducaoDecorator;

public class Aplicacao{

	
	private void musica() throws IOException {

		//ResourceLoader.DIR_NAME = "D:\\workspace\\DPAvalII2023.1\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";
		
		Musica musica =  new MusicaLetraDecorator(new MusicaNotas("Lullaby"));
		Musica musicaTraduzida = new MusicaTraducaoDecorator(musica);
		
		Musica musicaCompleta  = new MusicaLetraTraducaoDecorator(musicaTraduzida);
		
		System.out.println(musicaCompleta.execute());
		
		
	}
	
	
	private void teste() throws IOException {

		//ResourceLoader.DIR_NAME = "D:\\workspace\\DPAvalII2023.1\\src\\br\\edu\\ifba\\inf011\\model\\resources\\data\\";
		Player player = new Player();
		int iCount = 0;
		Playlist playlist = new Playlist("Musicas");
		Musica musicaNotas = new MusicaNotas("ReelAroundFountain");
		Musica musicaLetra = new MusicaLetraDecorator(musicaNotas);
		Musica musica = new MusicaLetraDecorator(new MusicaNotas("AndreaDorea"));
		Musica musicaDeNinar = new MusicaTraducaoDecorator(new MusicaNotas("Lullaby"));
		player.insert(musica);
		Playlist playlist2 = new Playlist("PLAYLIST TEST");
		playlist2.insert(musicaDeNinar);
		playlist2.insert(musicaLetra);
		playlist.insert(musicaLetra);
		playlist.insert(musicaDeNinar);
		playlist.insert(playlist2);
		player.insert(playlist);
		player.insert(playlist2);
		System.out.println(player.proximo());
		System.out.println(player.proximo());
		System.out.println(player.proximo());
		//System.out.println(player.proximo());
		/*while(!player.temProximo() && iCount < 30) {
			System.out.println(player.proximo());
			iCount++;
		}*/
		
	}
	
	public static void main(String[] args) throws IOException{
		Aplicacao app = new Aplicacao();
		//app.musica();
		app.teste();
	}






	

}

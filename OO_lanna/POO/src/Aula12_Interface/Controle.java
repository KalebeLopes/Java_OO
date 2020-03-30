package Aula12_Interface;

public class Controle implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Construtor
	
	Controle(){
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	// Métodos Acessores
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	// Métodos abstratos
	
	@Override
	public void ligar() {
		if (this.getLigado()){
			System.out.println("Já está ligado");
		} 
		else {
			this.setLigado(true);
		}
		
	}
	
	@Override
	public void desligar() {
		if (!this.getLigado()) {
			System.out.println("Já esá desligado");
		}
		else {
			this.setLigado(false);
		}
	}
	
	@Override
	public void abrirMenu() {
		
		if (this.getLigado()) {
			
			System.out.println("Está Ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			
			int i = 0;
			System.out.print("Volume: ");
			
				for (i = 0; i < this.getVolume(); i += 10) {
					System.out.print("|");
				}
				
		}
		else {
			System.out.println("Impossível. Está desligado");
		}
	}

	@Override
	public void fecharMenu() {
		
		if (this.getLigado()) {
			System.out.println("");
			System.out.println("Fechando Menu...");
		}
		else {
			System.out.println("Impossível. Está desligado");
		}
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
			
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(true);
		}
		
	}
	
	
	
	
	
}

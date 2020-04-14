package aula20200413.garrafa;

public class Garrafa {

	private String cor;
	private String marca;
	private double quantidadeEmMl;
	private boolean estaVazia;

	public Garrafa() {
		this.quantidadeEmMl = 500;
		this.estaVazia = false;
	}

	public Garrafa(String cor, String marca, double quantidadeEmMl, boolean estaVazia) {
		this.cor = cor;
		this.marca = marca;
		this.quantidadeEmMl = quantidadeEmMl;
		this.estaVazia = estaVazia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void encherGarrafa() {
		this.estaVazia = false;
	}
	
	public void encherGarrafa(int quantidade){
		if(quantidadeEmMl <500){
			this.quantidadeEmMl += quantidade;
			this.estaVazia = false;
		}
	}
	public void esvaziar() {
		this.estaVazia = true;
		this.quantidadeEmMl = 0;
	}


	public String tomar(Double quantidade) {
		if (!estaVazia) {
			if (quantidadeEmMl > quantidade) {
				this.quantidadeEmMl -= quantidade;
			}
		}
		return vaziaOuTampada();
	}

	public String vaziaOuTampada() {
		if (estaVazia == true) {
			return "estaVazia";
		}
		return "Esta tampada";
	}
	public String getMarca() {
		return marca;
	}
	
	public double getQuantidadeEmMl() {
		return quantidadeEmMl;
	}
 
}


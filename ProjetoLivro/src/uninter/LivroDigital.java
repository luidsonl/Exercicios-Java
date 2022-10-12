package uninter;

public class LivroDigital extends Livro {
	private int tamanho;
	private int download;
	
	
	
	public LivroDigital(String titulo, Autor autor, String genero, int edicao, int tamanho, int download) {
		super(titulo, autor, genero, edicao);
		this.tamanho = tamanho;
		this.download = download;
	}

	
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getDownload() {
		return download;
	}

	public void setDownload(int download) {
		this.download = download;
	}
	
	public void info() {
		super.info();
		System.out.println("Tamanho do livro: " + tamanho);
		System.out.println("Download do livro: " + download);
	}
	
}

package semana4;

class Estoque {
	int id=0;
	Produto[] prod=new Produto[100]; 

	protected void add(String nome, String marca, String cor, int tamanho, int quantidade) {
		if(tamanho>60) {
			System.out.println("N�o h� espa�o para produtos deste tamanho no estoque.");
			return;
		}
		++id;
		prod[(id-1)]=new Produto();
		prod[(id-1)].setId(id);
		prod[(id-1)].setNome(nome);
		prod[(id-1)].setMarca(marca);
		prod[(id-1)].setCor(cor);
		prod[(id-1)].setTamanho(tamanho);
		prod[(id-1)].setQuantidade(quantidade);
		System.out.println("Produto id " + id + " adicionado ao estoque.");
	}
}
package collection;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
	

		private List<Produto> produtos = new ArrayList<>();

		public Estoque() {
		}

		public Estoque(List<Produto> produtos) {
			this.produtos = produtos;
		}

		public List<Produto> getProdutos() {
			return produtos;
		}

		public void setProducts(List<Produto> produtos) {
			this.produtos = produtos;
		}

		public double getValorTotalEstoque() {
			return produtos.stream().mapToDouble(x -> x.getPreco() * x.getQuantidade()).reduce(0, (sum, x) -> sum + x);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			int c = 0;
			for (Produto produtos : produtos) {
				sb.append("\n " + (c + 1) + produtos.getNome());
			}

			return sb.toString();
		}

}

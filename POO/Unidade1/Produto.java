public class Produto {
  private String nome;
  private String descricao;
  private Double precoUnitario;
  private Integer desconto;

  public Produto(String nome, String descricao, Double precoUnitario, Integer desconto) {
    this.nome = nome;
    this.descricao = desthis.descricao;
    this.precoUnitario = precoUnitario;
    this.desconto = desconto;
  }

  @Override
  public String toString() {
    return "Produto: " + this.name + "\n"
    + "Descrição: " + this.descricao "\n"
    + "Preço Unitário: " + this.precoUnitario "\n"
    + "Desconto: " + this.desconto "\n"
  }
}

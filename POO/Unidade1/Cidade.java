public class Cidade {
  private String nome;
  private String UF;
  private Integer populacaoMasculina;
  private Integer populacaoFeminina;
  private Boolean calculado;

  public Cidade(String nome, Integer populacaoFeminina, Integer populacaoMasculina) {
    this.nome = nome;
    this.populacaoFeminina = populacaoFeminina;
    this.populacaoMasculina = populacaoMasculina;
  }

  public void setNome(String _nome) {
    this.nome = _nome;
  }

  public void setUF(String _UF) {
    this.UF = _UF;
  }

  public void setPopulacaoFeminina(int _populacaoFeminina) {
    this.populacaoFeminina = _populacaoFeminina;
  }

  public void setPopulacaoMasculina(int _populacaoMasculina) {
    this.populacaoMasculina = _populacaoMasculina;
  }

  public void setCalculado(Boolean calculado) {
    this.calculado = calculado;
  }
}
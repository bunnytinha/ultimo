public class CartaoDeCredito extends Pagamento
{
   //atributo proprio
   private String numeroDoCartao;
   //construtor
   public CartaoDeCredito(String nomeDoPagador, String cpf, String numeroDoCartao, double valorASerPago)
   {
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoCartao = numeroDoCartao;
   }
   //acesso
   public String getNumeroDoCartao()
   {
      return numeroDoCartao;
   }
   //modificador
   public void setNumeroDoCartao(String numeroDoCartao)
   {
      this.numeroDoCartao = numeroDoCartao;
   }
     
}
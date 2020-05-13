public class Pagamento
{
   private String nomeDoPagador;
	private String cpf;
   private double valorASerPago;

   //construtor
   public Pagamento(String nomeDoPagador, String cpf, double valorASerPago)
   {
      this.nomeDoPagador = nomeDoPagador;
      this.cpf = cpf;
      this.valorASerPago = valorASerPago;
   }
   //metodos de acesso
   public String getNomeDoPagador()
   {
      return nomeDoPagador;
   }
   public String getCpf()
   {
      return cpf;
   }
   public double valorASerPago()
   {
      return valorASerPago;
   }
   //metodos modificadores
   public void setNomedoPagador(String nomeDoPagador)
   {
      this.nomeDoPagador = nomeDoPagador;
   }
   public void setCpf(String cpf)
   {
      this.cpf = cpf;
   }
   public void setValorASerPago(double valorASerPago)
   {
      this.valorASerPago = valorASerPago;
   }

}
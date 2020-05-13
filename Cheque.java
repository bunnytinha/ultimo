public class Cheque extends Pagamento
{
   private String numeroDoCheque;
   //contrustor
   public Cheque(String nomeDoPagador, String cpf, String numeroDoCheque, double valorASerPago)
   {
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoCheque = numeroDoCheque;
   }
   //acesso
   public String getNumeroDoCheque()
   {
      return numeroDoCheque;
   }
   //modificador
   public void setNumeroDoCheque(String numeroDoCheque)
   {
      this.numeroDoCheque = numeroDoCheque;
   }
}
public class Boleto extends Pagamento
{
   //atributos proprios
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;
   //construtor
   public Boleto(String nomeDoPagador, String cpf, String numeroDoBoleto, int dia, int mes, int ano, double valorASerPago)
   {
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoBoleto = numeroDoBoleto;
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
   //acesso
   public String getNumeroDoBoleto()
   {
      return numeroDoBoleto;
   }
   public int getDia()
   {
      return dia;
   }
   public int getMes()
   {
      return mes;
   }
   public int getAno()
   {
      return ano;
   }
   //modificador
   public void setNumeroDoBoleto(String numeroDoBoleto)
   {
      this.numeroDoBoleto = numeroDoBoleto;
   }
   public void setDia(int dia)
   {
      this.dia = dia;
   }
   public void setMes(int mes)
   {
      this.mes = mes;
   }
   public void setAno(int ano)
   {
      this.ano = ano;
   }
}
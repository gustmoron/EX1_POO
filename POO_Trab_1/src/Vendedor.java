
public class Vendedor extends Empregado implements Salario{
	private double totalDasVendas;
	private double comissao;
	
	public void setTotalDasVendas(double totalDasVendas) {
		this.totalDasVendas = totalDasVendas;
	 }

	 public double getTotalDasVendas() {
		 return this.totalDasVendas;
	 }
	 
	public void setComissao(double comissao) {
		this.comissao = comissao;
	 }

	 public double getComissao() {
		 return this.comissao;
	 }

	@Override
	public double calcularSalario() {
		return 0;
	}


}

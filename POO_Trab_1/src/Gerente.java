
public class Gerente extends Empregado implements Bonus {
	private double salario;
	private double bonus;
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	 }

	 public double getSalario() {
		 return this.salario;
	 }
		
	 public void setBonus(double bonus) {
		 this.bonus = bonus;
	 }

	 public double getBonus() {
		 return this.bonus;
	 }

	@Override
	public double calcularBonus() {
		return 0;
	}

}

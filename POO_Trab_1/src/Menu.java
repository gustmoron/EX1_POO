import javax.swing.JOptionPane;

public class Menu {
	static Lista<Pessoa> pessoas = new Lista<Pessoa>();
	int choice;
	int count = 0;
	
	public void menu() {
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(
					"Operações: \n 1. Cadastrar Empregado \n 2. Cadastrar Cliente \n 3. Pesquisar \n 4. Listar Empregados \n 5. Listar Clientes \n 6. Remover \n 7. Sair"));
			
			switch (choice) {
				case 1:
					cadastrarEmpregado();
					break;
				case 2:
					cadastrarCliente();
					break;
				case 3:
					pesquisar();
					break;
				case 4:
					listarEmpregados();
					break;
				case 5:
					listarClientes();
					break;
				case 6:
					remover();
					break;
			}
		} while (choice != 7);
	}
	
	public void cadastrarEmpregado() {
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(
					"Operações: \n 1. Cadastrar Gerente \n 2. Cadastrar Vendedor \n 3. Cancelar"));
			
			switch (choice) {
				case 1:
					cadastrarGerente();
					break;
				case 2:
					cadastrarVendedor();
					break;
			}
		} while (choice != 3);
		
	}
	
	public void cadastrarGerente() {
		
	}
	
	public void cadastrarVendedor() {
		
	}
	
	public void cadastrarCliente(){ 
		String nome = JOptionPane.showInputDialog("Nome: ");
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
		double valorDaDivida = Double.parseDouble(JOptionPane.showInputDialog("Valor da divida: "));
		
		Cliente cliente =  new Cliente();
		cliente.setPessoa();
		
		if(pessoas.pesquisar(cliente.cpf) == null) {
			pessoas.inserirFinal(cliente);
		} else {
			JOptionPane.showMessageDialog(null, "ERRO! CPF duplicado!");
		} 
	}	
	
	public void pesquisar() {
		
	}
	
	public void listarEmpregados() {
		
	}
	
	public void listarClientes() {
		String aux = "";
		int cont = 0;
		
		for (int i = 0; i < pessoas.lenght; i++) {
			if (pessoas.pesquisar(new Cliente(i)) != null) {
				aux += pessoas.pesquisar(Cliente.cpf() + "\n";
				cont++;
			}
			if(cont == count) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Existem os seguintes clientes no sistema: \n" + aux);
	}
	
	public void remover() {
		
	}
	
}
	
		
	
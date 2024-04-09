import javax.swing.JOptionPane;

public class Aluno {
		private String nome;
		private int idade;
		private int ra;
		private String email;
		private String telefone;
		
		public Aluno() {
			this.nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
			this.ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
			this.email = JOptionPane.showInputDialog("Digite o e-mail do aluno:");
			this.telefone = JOptionPane.showInputDialog("Digite o telefone do aluno:");
		}
	}


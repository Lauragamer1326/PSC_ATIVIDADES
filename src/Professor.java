import javax.swing.JOptionPane;

public class Professor {
    private String nome;
    private int idade;
    private String email;
    
    public Professor() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do professor:");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:"));
        this.email = JOptionPane.showInputDialog("Digite o e-mail do professor:");
    }

    public static void main(String[] args) {
        Professor professor = new Professor();
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
    }
}

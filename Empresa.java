import java.util.ArrayList;
import java.util.List;

// Classe abstrata Funcionario
abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract String trabalhar();
}

// Interface Bonificavel
interface Bonificavel {
    double calcularBonus();
}

// Classe Gerente
class Gerente extends Funcionario implements Bonificavel {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String trabalhar() {
        return "Gerente " + getNome() + " está gerenciando o departamento de " + departamento + ".";
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}

// Classe Estagiario
class Estagiario extends Funcionario {
    private int horasDeTrabalho;

    public Estagiario(String nome, double salario, int horasDeTrabalho) {
        super(nome, salario);
        this.horasDeTrabalho = horasDeTrabalho;
    }

    @Override
    public String trabalhar() {
        return "Estagiário " + getNome() + " está trabalhando por " + horasDeTrabalho + " horas semanais.";
    }
}

// Classe principal Empresa
public class Empresa {
    public static void main(String[] args) {
        // Testes com diferentes cenários
        Gerente gerente1 = new Gerente("Ana", 9000.0, "Vendas");
        Gerente gerente2 = new Gerente("Paulo", 12000.0, "TI");
        Estagiario estagiario1 = new Estagiario("Bruno", 2000.0, 20);
        Estagiario estagiario2 = new Estagiario("Lucas", 1800.0, 30);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        funcionarios.add(estagiario1);
        funcionarios.add(estagiario2);

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: R$ " + f.getSalario());
            System.out.println(f.trabalhar());

            if (f instanceof Bonificavel) {
                Bonificavel b = (Bonificavel) f;
                System.out.println("Bônus: R$ " + b.calcularBonus());
            } else {
                System.out.println("Este funcionário não recebe bônus.");
            }
            System.out.println("-------------------------------");
        }
    }
}
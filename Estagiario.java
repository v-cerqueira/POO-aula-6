public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05; // 5% de bônus
    }

        @Override
        public void trabalhar() {
            System.out.println(getNome() + " está auxiliando nas tarefas.");
        }
}

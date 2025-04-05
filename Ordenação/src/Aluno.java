public class Aluno implements Comparable<Aluno>{
    String nome;
    Integer idade;
    Integer nota;

    public Aluno(String nome, int idade, Integer nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(this.nota, outro.nota);
    }

    @Override
    public String toString() {
        return nome + ", " + idade + " anos, nota: " + nota;
    }
}

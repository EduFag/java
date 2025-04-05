import java.util.Comparator;

public class OrdenaçãoPorNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.nome.compareTo(aluno2.nome);
    }
}

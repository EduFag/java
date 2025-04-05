import java.util.Comparator;

public class OrdenaçãoPorIdade implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.idade.compareTo(aluno2.idade);
    }
}

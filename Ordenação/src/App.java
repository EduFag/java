import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Aluno> alunos;
        alunos = new ArrayList<>();

        String[] nomes = {"Lívia", "Eduardo", "Arthur", "Lucas", "Guilherme", "Carlo", "Felipe", "Kauã", "Isabela", "Lafayete"};
        int[] idades = {20, 19, 25, 22, 18, 24, 32, 18, 27, 19};
        Integer[] notas = {5, 8, 4, 9, 6, 3, 9, 10, 7, 6};

        Aluno aluno;
        for (int i = 0; i < notas.length; i++) {
            aluno = new Aluno(nomes[i], idades[i], notas[i]);
            alunos.add(aluno);
        }

        Collections.sort(alunos);
        System.out.println("Ordenação por nota usando Comparable");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        alunos.sort(new OrdenaçãoPorNome());
        System.out.println("Ordenação por nome usando um Comparator");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        alunos.sort(new OrdenaçãoPorIdade());
        System.out.println("Ordenação por idade usando um Comparator");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
    }
}

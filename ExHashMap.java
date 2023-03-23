import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;
public class ExHashMap {
    public static void main(String[] args) {

        Map<String, Map<String, Object>> alunosDisc = new HashMap<>();
        Map<String, Object> discNotasMediaAluno01 = new HashMap<>();

        List<Integer> notasCienciaAluno01 = new ArrayList<>();
        List<Integer> notasPortAluno01 = new ArrayList<>();
        List<Integer> notasMatAluno01 = new ArrayList<>();


        notasCienciaAluno01.add(9);
        notasCienciaAluno01.add(2);
        notasCienciaAluno01.add(5);

        notasPortAluno01.add(9);
        notasPortAluno01.add(10);
        notasPortAluno01.add(7);

        notasMatAluno01.add(2);
        notasMatAluno01.add(5);
        notasMatAluno01.add(9);

        int somaC = 0;
        for (Integer nota : notasCienciaAluno01) {
            somaC += nota;
        }

        int somaP = 0;
        for (Integer nota : notasPortAluno01) {
            somaP += nota;
        }

        int somaM = 0;
        for (Integer nota : notasMatAluno01) {
            somaM += nota;
        }

        int mediaCiencia = somaC / notasCienciaAluno01.size();
        discNotasMediaAluno01.put("Ciências: ", notasCienciaAluno01);
        discNotasMediaAluno01.put("Média: ", mediaCiencia);

        int mediaPortugues = somaP / notasPortAluno01.size();
        discNotasMediaAluno01.put("Português: ", notasPortAluno01);
        discNotasMediaAluno01.put("Média: ", mediaPortugues);

        int mediaMatematica = somaM / notasMatAluno01.size();
        discNotasMediaAluno01.put("Matemática: ", notasMatAluno01);
        discNotasMediaAluno01.put("Média: ", mediaMatematica);

        String nomeAluno = "Bruno";
        alunosDisc.put(nomeAluno, discNotasMediaAluno01);

        if (mediaCiencia >= 7) {
            System.out.println(nomeAluno + " foi aprovado em Ciências com média " + mediaCiencia);
        } else {
            System.out.println(nomeAluno + " foi reprovado em Ciências com média " + mediaCiencia);
        }

        if (mediaMatematica >= 7) {
            System.out.println(nomeAluno + " foi aprovado em Matemática com média " + mediaMatematica);
        } else {
            System.out.println(nomeAluno + " foi reprovado em Matemática com média " + mediaMatematica);
        }

        if (mediaPortugues >= 7) {
            System.out.println(nomeAluno + " foi aprovado em Português com média " + mediaPortugues);
        } else {
            System.out.println(nomeAluno + " foi reprovado em Português com média " + mediaPortugues);
        }

        System.out.println();

        int mediaGeralAluno01 = (mediaCiencia + mediaMatematica + mediaPortugues)/3;

        System.out.println("Média geral do aluno " + nomeAluno + " é " + mediaGeralAluno01);

        if ((mediaGeralAluno01>=7) && (mediaCiencia>=7) && (mediaMatematica>=7) && (mediaPortugues>=7)){
            System.out.println(nomeAluno + " foi aprovado(a) no curso!");
        }else if ((mediaGeralAluno01>=7) && (mediaCiencia<7) || (mediaMatematica<7) || (mediaPortugues<7)){
            System.out.println(nomeAluno + " está em recuperação no curso!");
        }else if (mediaGeralAluno01<7){
            System.out.println(nomeAluno + " está reprovado no curso!");
}}}

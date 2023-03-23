import java.util.*;

public class Mapa {
    public static void main(String[]args){
        Map<String, Map<String, List<Integer>>>alunosDisc=new HashMap<>();

        Map<String, List<Integer>>discNotasAluno01=new HashMap<>();

        List<Integer>notasPortAluno01 = new ArrayList<>();
        List<Integer>notasCienciaAluno01 = new ArrayList<>();
        List<Integer>notasMatAluno01 = new ArrayList<>();

        notasCienciaAluno01.add(9);
        notasCienciaAluno01.add(2);
        notasCienciaAluno01.add(5);
        notasPortAluno01.add(5);
        notasPortAluno01.add(1);
        notasPortAluno01.add(9);
        notasMatAluno01.add(5);
        notasMatAluno01.add(1);
        notasMatAluno01.add(9);

        discNotasAluno01.put("Português: ", notasPortAluno01);
        discNotasAluno01.put("Ciências: ", notasCienciaAluno01);
        discNotasAluno01.put("Matemática: ", notasMatAluno01);

        alunosDisc.put("Bruno", discNotasAluno01);



        Map<String, List<Integer>>discNotasAluno02=new HashMap<>();

        List<Integer>notasPortAluno02 = new ArrayList<>();
        List<Integer>notasCienciaAluno02 = new ArrayList<>();
        List<Integer>notasMatAluno02 = new ArrayList<>();

        notasCienciaAluno02.add(9);
        notasCienciaAluno02.add(2);
        notasCienciaAluno02.add(5);
        notasPortAluno02.add(5);
        notasPortAluno02.add(1);
        notasPortAluno02.add(9);
        notasMatAluno02.add(5);
        notasMatAluno02.add(1);
        notasMatAluno02.add(9);

        discNotasAluno02.put("Português: ", notasPortAluno02);
        discNotasAluno02.put("Ciências: ", notasCienciaAluno02);
        discNotasAluno02.put("Matemática: ", notasMatAluno02);

        alunosDisc.put("Maria", discNotasAluno02);

        System.out.println(alunosDisc);
    }
}

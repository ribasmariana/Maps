import java.util.*;

public class InterfaceMap {
    public static void main(String[]args) {
    Map<String, List<Integer>> alunos =new TreeMap<>();

    List<Integer>nota01=new ArrayList<>();

    nota01.add(7);
    nota01.add(9);
    nota01.add(3);

    List<Integer> nota02 = new ArrayList<>();

    nota02.add(7);
    nota02.add(2);
    nota02.add(9);

    alunos.put("Pedro Souza", nota01);
    alunos.put("Rafael Silva", nota02);

        System.out.println(alunos);

        System.out.println();

        for (List<Integer>nota: alunos.values()){
            System.out.println(nota);
        }

        System.out.println();

        Iterator mapIterator = alunos.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            System.out.println(mapElement.getKey());
            System.out.println(mapElement.getValue());
        }
}}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Construtor {
    private ArrayList<Integer> l1;
    private ArrayList<Integer> l2;

    public Construtor(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public ArrayList<Integer> intersect() {
        // Criar um conjunto para armazenar os elementos únicos de l1
        Set<Integer> set = new HashSet<>(l1);
        
        // Criar um novo ArrayList para armazenar a interseção
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // Iterar sobre os elementos de l2
        for (Integer num : l2) {
            // Se o conjunto contiver o elemento de l2, adicioná-lo à interseção
            if (set.contains(num)) {
                intersection.add(num);
                // Remover o elemento do conjunto para garantir que não seja duplicado na interseção
                set.remove(num);
            }
        }
        
        return intersection;
    }

    public ArrayList<Integer> union() {
        // Criar um conjunto para armazenar os elementos únicos de l1 e l2
        Set<Integer> set = new HashSet<>(l1);
        set.addAll(l2); // Adicionar todos os elementos de l2 ao conjunto
        
        // Criar um novo ArrayList contendo todos os elementos do conjunto (união de l1 e l2)
        ArrayList<Integer> union = new ArrayList<>(set);
        
        return union;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        
        // Exemplo de utilização do construtor e do método union (E)
        Construtor exampleE = new Construtor(list1, list2);
        ArrayList<Integer> union = exampleE.union();
        System.out.println("União: " + union); // Saída esperada: [1, 2, 3, 4]

        // Exemplo de utilização do construtor e do método intersect (F)
        Construtor exampleF = new Construtor(list1, list2);
        ArrayList<Integer> intersection = exampleF.intersect();
        System.out.println("Interseção: " + intersection); // Saída esperada: [2, 3]
    }
}

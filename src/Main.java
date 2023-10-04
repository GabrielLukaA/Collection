import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List

        // ArrayList
        // Criar um ArrayList
        List<String> arrayList = new ArrayList<>();
        // Adicionar elementos
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        // Adicionar em um lugar específico
        arrayList.add(1, "Novo Item");
        // Remover um elemento
        arrayList.remove(0);
        // Alterar um elemento
        arrayList.set(1, "Item Modificado");
        // Buscar um elemento por índice
        String itemArrayList = arrayList.get(0);

        // Executar como LinkedList
        arrayList = new LinkedList<>(arrayList);
        arrayList.add(1, "Novo Item");

        // Executar como hashSet
        Collection<String> collection;
        collection = new HashSet<>(arrayList);
        collection.add("Item 3");
        collection.add("Item 4");

        //LinkedList
        // Criar uma LinkedList
        List<String> linkedList = new LinkedList<>();
        // Adicionar elementos
        linkedList.add("Item A");
        linkedList.add("Item B");
        // Adicionar em um lugar específico
        linkedList.add(1, "Novo Item");
        // Remover um elemento
        linkedList.remove(0);
        // Alterar um elemento
        linkedList.set(1, "Item Modificado");
        // Buscar um elemento por índice
        String itemLinkedList = linkedList.get(0);

        /// Set

        // HashSet
        // Criar um HashSet
        Set<String> hashSet = new HashSet<>();
        // Adicionar elementos
        hashSet.add("Elemento A");
        hashSet.add("Elemento B");
        // Remover um elemento
        hashSet.remove("Elemento A");
        // Verificar a existência de um elemento
        boolean containsElementHashSet = hashSet.contains("Elemento B");

        // LinkedHashSet
        // Criar um LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // Adicionar elementos
        linkedHashSet.add("Elemento 1");
        linkedHashSet.add("Elemento 2");
        // Remover um elemento
        linkedHashSet.remove("Elemento 1");
        // Verificar a existência de um elemento
        boolean containsElementLinkedHashSet = linkedHashSet.contains("Elemento 2");

        // TreeSet
        // Criar um TreeSet
        Set<String> treeSet = new TreeSet<>();
        // Adicionar elementos
        treeSet.add("Elemento X");
        treeSet.add("Elemento Y");
        // Remover um elemento
        treeSet.remove("Elemento X");
        // Verificar a existência de um elemento
        boolean containsElement = treeSet.contains("Elemento Y");

        // Map

        // HashMap
        // Criar um HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        // Adicionar pares chave-valor
        hashMap.put(1, "Valor A");
        hashMap.put(2, "Valor B");
        // Remover um elemento por chave
        hashMap.remove(1);
        // Alterar um valor associado a uma chave
        hashMap.put(2, "Valor Modificado");
        // Buscar um valor por chave
        String valueHashMap = hashMap.get(2);

        // LinkedHashMap
        // Criar um LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // Adicionar pares chave-valor
        linkedHashMap.put(101, "Valor 1");
        linkedHashMap.put(102, "Valor 2");
        // Remover um elemento por chave
        linkedHashMap.remove(101);
        // Alterar um valor associado a uma chave
        linkedHashMap.put(102, "Valor Modificado");
        // Buscar um valor por chave
        String valueLinkedHashMap = linkedHashMap.get(102);

        // TreeMap
        // Criar um TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        // Adicionar pares chave-valor
        treeMap.put("Chave A", 1);
        treeMap.put("Chave B", 2);
        // Remover um elemento por chave
        treeMap.remove("Chave A");
        // Alterar um valor associado a uma chave
        treeMap.put("Chave B", 3);
        // Buscar um valor por chave
        Integer valueTreeMap = treeMap.get("Chave B");
    }
}
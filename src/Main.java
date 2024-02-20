import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> firstSet = populateHashSet();
        String element = "firstElement";

        firstSet.removeIf(e -> e.equals(element));

        System.out.println(firstSet);
        System.out.println("-----------------------------");

        firstSet.clear();

        // Verifichiamo se l'HashSet è vuoto e stampiamo il risultato
        checkSet(firstSet);
    }


    public static HashSet<String> populateHashSet() { // Metodo per popolare l'HashSet
        HashSet<String> set = new HashSet<>();
        set.add("firstElement");
        set.add("secondElement");
        set.add("thirdElement");
        return set;
    }

    public static void checkSet (HashSet<String> set){
        if (set.isEmpty()) {
            System.out.println("L'HashSet è vuoto");
        } else {
            System.out.println("L'HashSet non è vuoto");
        }
    }
}


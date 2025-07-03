import controller.ContactoController;
import controller.Ejercicios;
import controller.Sets;

public class App{
    public static void main(String[] args) {

        Sets sets = new Sets();
        System.out.println("Jonnathan Saavedra");
        runHashSet(sets);
        runHashSetLinked(sets);
        runHashSetTree(sets);
        runHashSetTreeComparator(sets);
        runHashSetTreeComparatorInverso(sets);
        runTreeContacto();

        Ejercicios ejercicios = new Ejercicios();
    }
    public static void runHashSet(Sets sets) {
        System.out.println("---Run HashSet---");
        for (String palabra : sets.construirHashSet()){
            System.out.println(palabra);
        }
    }

    public static void runHashSetLinked(Sets sets) {
        System.out.println("---Run HashSetLinked---");
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }

    public static void runHashSetTree(Sets sets) {
        System.out.println("---Run HashSetTree---");
        for (String palabra : sets.construirTreeSet()) {
            System.out.println(palabra);
        }
    }

    public static void runHashSetTreeComparator(Sets sets) {
        System.out.println("---Run HashSetTreeComparator---");
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }

    public static void runHashSetTreeComparatorInverso(Sets sets) {
        System.out.println("---Run HashSetTreeComparator---");
        for (String palabra : sets.construirTreeSetConComparadorInverso()) {
            System.out.println(palabra);
        }
    }

    public static ContactoController runTreeContacto() {
        System.out.println("------ Contacto orden alfabetico apellido - nombre -----");
        return new ContactoController();
    }
}
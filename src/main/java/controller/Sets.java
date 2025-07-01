package controller;

import java.util.*;

public class Sets {

    public void Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // Duplicado, no se añadirá
        palabras.add("Pera"); // Duplicado, no se añadirá
        palabras.add("Laptop"); // Duplicado, no se añadirá
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadas.add("Pera"); // Duplicado, no se añadirá
        palabrasLinkeadas.add("Laptop"); // Duplicado, no se añadirá
        return palabrasLinkeadas;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabrasLinkeadasTree = new TreeSet<>();
        palabrasLinkeadasTree.add("Laptop");
        palabrasLinkeadasTree.add("Manzana");
        palabrasLinkeadasTree.add("Pera");
        palabrasLinkeadasTree.add("Celular");
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        return palabrasLinkeadasTree;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> miComparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                // Comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabeticamente
                if (result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };

        // Crea una nueva instancia y en el constructor manda la comparación
        Set<String> palabrasLinkeadasTree = new TreeSet<>(miComparadorLongitud);
        palabrasLinkeadasTree.add("Laptop");
        palabrasLinkeadasTree.add("Manzana");
        palabrasLinkeadasTree.add("Pera");
        palabrasLinkeadasTree.add("Celular");
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Celulas");
        return palabrasLinkeadasTree;
    }

    public Set<String> construirTreeSetConComparadorInverso() {
        Comparator<String> miComparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                // Comparamos la longitud
                int result = Integer.compare(s2.length(), s1.length());
                // Si tienen la misma longitud, comparamos alfabeticamente
                if (result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };

        // Crea una nueva instancia y en el constructor manda la comparación
        Set<String> palabrasLinkeadasTree = new TreeSet<>(miComparadorLongitud);
        palabrasLinkeadasTree.add("Laptop");
        palabrasLinkeadasTree.add("Manzana");
        palabrasLinkeadasTree.add("Pera");
        palabrasLinkeadasTree.add("Celular");
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Pera"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Laptop"); // Duplicado, no se añadirá
        palabrasLinkeadasTree.add("Celulas");
        return palabrasLinkeadasTree;
    }
}

package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntroducao {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Array esta vazio? " + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());
        
               
        System.out.println("Digite um nome: ");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: "+ nomes.toString());
        
        nomes.add(0 ,"Filispino");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: "+ nomes.toString());
        
        nomes.add(1, "jair");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: "+ nomes.toString());
        
        nomes.add(2,"joca");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: "+ nomes.toString());
        
        nomes.add(3, "juvenal");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: "+ nomes.toString());
    }

}

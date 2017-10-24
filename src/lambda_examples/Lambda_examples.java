/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Alba Proyecto
 */
//Cualquier interface que tenga un solo metodo es compatible con una lambda
@FunctionalInterface  //esto no es necesario|w es solo para formalizar este concepto
interface Suma {

    public int operaciones_simples(int a, int b);
}

interface Imprime {

    public void print();
}

public class Lambda_examples {//*******************************IMPORTANTE ESTUDIAR EL PAQUETE FUNCTION (JAVA.UTIL.FUNCTION.*)

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> resultado = new ArrayList<>();
        List<Integer> resultado1 = new ArrayList<>();
        resultado = lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        resultado1 = lista.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(resultado);
        System.out.println(resultado1);

        //haciendo la interface compatible con lambda
        Suma sum = (a, b) -> a + b;
        Suma sum1 = (a, b) -> a * b;
        Suma sum2 = (a, b) -> a / b;
        System.out.println(sum.operaciones_simples(2, 3));
        System.out.println(sum1.operaciones_simples(2, 3));
        System.out.println(sum2.operaciones_simples(2, 3));

        Imprime imp = () -> System.out.println("Hola");
        Imprime imp1 = () -> System.out.println("Imprime la cantidad de caracteres de este texto".length());
        imp.print();
        imp1.print();
        
        ArrayList<Integer> lista_prom = new ArrayList<>();
        lista_prom.add(45);
        lista_prom.add(56);
        lista_prom.add(785);
        Interface_aparte in_ap= (n) -> n.size();
        System.out.println("llamando a interface aparte "+in_ap.cant_elementos(lista_prom));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda_examples;

import java.util.ArrayList;

/**
 *
 * @author Alba Proyecto
 */
@FunctionalInterface//recordando que esto es para conceptualizar, no es estrictamente necesario
public interface Interface_aparte {
    public int cant_elementos(ArrayList<Integer>list);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio22;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario.numeroFuncionarios = 1;
        System.out.println(funcionario.imprimeDados());
        Funcionario funcionario2 = new Funcionario("Carlos", 23);
        System.out.println(funcionario2.imprimeDados());
        Funcionario.numeroFuncionarios += 1;
        Funcionario funcionario3 = new Funcionario("123", "Alessandra", 197.500);
        Funcionario.numeroFuncionarios += 1;
        System.out.println(funcionario3.imprimeDados());
        System.out.println("O número total de funcionários é: " + Funcionario.numeroFuncionarios);
    }
    
}

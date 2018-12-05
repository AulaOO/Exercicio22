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
public class Funcionario {

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    private String matricula;
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    static int numeroFuncionarios;

    public Funcionario() {
        this.salario = 1500;
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    
    public String imprimeDados(){
        String dados = "Nome: " + nome + "\nMatrícula: " + matricula + "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalario: " + salario + "\n";
        return dados;
    }
    
    
    
}

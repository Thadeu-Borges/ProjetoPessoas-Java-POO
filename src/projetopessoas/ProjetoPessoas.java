/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author AAAA
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setIdade(18);
        p1.setSexo("M");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}

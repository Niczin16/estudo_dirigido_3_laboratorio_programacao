/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroi.com.banco.dados;

import conexao.conexao;

/**
 *
 * @author Aluno
 */
public class HeroiComBancoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexao con = new conexao();
        
        con.conectar();
        con.inserirHeroi();
    }
    
}

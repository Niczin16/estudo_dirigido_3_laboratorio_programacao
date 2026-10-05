/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaHerois;

/**
 *
 * @author Aluno
 */
public class Personagem {
    private String  nome;
    private Integer vida;
    private Integer energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public void Apresentar(){
        System.out.println(
            "Oi, eu sou o " + nome + ", muito prazer em te conhecer! \n " +
            "Eu tenho: " + vida + " de vida! \n" +
            "Eu tenho: " + energia + " de energia! \n" 
        );
    }
    
    public void Atacar(){
        System.out.println("Ataque genérico!");
    }
}

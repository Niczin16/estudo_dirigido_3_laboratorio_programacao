/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaHerois;

/**
 *
 * @author Aluno
 */
public class Sonic extends Personagem{
    private Float valocidade;

    public Float getValocidade() {
        return valocidade;
    }

    public void setValocidade(Float valocidade) {
        this.valocidade = valocidade;
    }

    @Override
    public void Apresentar() {
        super.Apresentar(); 
    }

    @Override
    public void Atacar() {
        System.out.println("Spin Dash!!! \n" + "Atacou com uma velocidade de: " + String.valueOf(valocidade) + "\n\n\n" );
    }
        
}

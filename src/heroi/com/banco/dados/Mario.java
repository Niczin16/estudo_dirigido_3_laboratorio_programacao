/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaHerois;

/**
 *
 * @author Aluno
 */
public class Mario extends Personagem{
    private boolean CogumeloLendario;

    public boolean isCogumeloLendario() {
        return CogumeloLendario;
    }

    public void setCogumeloLendario(boolean CogumeloLendario) {
        this.CogumeloLendario = CogumeloLendario;
    }

    @Override
    public void Apresentar() {
        super.Apresentar(); 
    }

    @Override
    public void Atacar() {
        System.out.println("Ground Pound!!! \n" + "Ativar o cogumelo lendário para atacar com mais força? " + String.valueOf(CogumeloLendario) + "\n\n\n");
    }    
    
}

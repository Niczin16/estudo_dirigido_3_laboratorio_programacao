/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaHerois;

/**
 *
 * @author Aluno
 */
public class Goku extends Personagem{
    private Float Forca;

    public Float getForca() {
        return Forca;
    }

    public void setForca(Float Forca) {
        this.Forca = Forca;
    }

    @Override
    public void Apresentar() {
        super.Apresentar();
    }
    
    @Override
    public void Atacar() {
        System.out.println("KAMEEEEEEE HAAAAMEEEE HAAAAAAAAAAAAAAAAA!!!! \n" + " Bateu com uma força de:" + String.valueOf(Forca) + "\n\n\n"); 
    }
    
}

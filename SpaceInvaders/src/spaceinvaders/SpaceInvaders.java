/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceinvaders;

/**
 *
 * @author Lucas
 */
public class SpaceInvaders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Local que fica os inimigos
        Inimigo[] meusmonstros = new Inimigo[8];
        //Local que fica os tiros
        Tiro[] meustiros = new Tiro[100];
        //Quantidade de tiros na tela
        int quantidadeTiros = 0;
        int posTiro = 76;
        int quantidadeMonst = 3;
        
        
        //Crio os monstros na tela
        meusmonstros[0] = new Inimigo(5, 6, 2);
        meusmonstros[1] = new Inimigo(30, 25, 2);
        meusmonstros[2] = new Inimigo(5, 15, 2);
        
        
        
        
        
        //Inicia o jogo
        Space.init();
       
        for (int i = 0; i < 150; i++) {
            
            meusmonstros[0].setY(meusmonstros[0].getY()+1);
            meusmonstros[1].setY(meusmonstros[1].getY()+1);
            meusmonstros[2].setY(meusmonstros[2].getY()+1);
            System.out.println(Space.getPlatX());
            if(Space.apertouDireita()){
                if(Space.getPlatX()<75){
                Space.setPlatX(Space.getPlatX()+1);
                }
            }
            System.out.println(Space.getPlatX());
            if(Space.apertouEsquerda()){
                if(Space.getPlatX()>1){
                Space.setPlatX(Space.getPlatX()-1);
                }
            }
            if(Space.apertouEspaco()){
                meustiros[quantidadeTiros] = new Tiro(Space.getPlatX(),posTiro);
                quantidadeTiros++;
            }
            
            
            
            
            //Atualiza a tela
            Space.desenha(meusmonstros, quantidadeMonst, meustiros, quantidadeTiros);
        }
        
        
    }

}

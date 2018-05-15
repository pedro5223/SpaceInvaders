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
        //Criei os monstros que vão na tela
        Inimigo[] meusmonstros = new Inimigo[8];
        int quantidadeTiros = 0;
        int quantidadeMonst = 8;
        meusmonstros[0] = new Inimigo(5, 6, 2);
        meusmonstros[1] = new Inimigo(5, 25, 2);
        meusmonstros[2] = new Inimigo(5, 15, 2);
        meusmonstros[3] = new Inimigo(20,15, 2);
        meusmonstros[4] = new Inimigo(20,25, 2);
        meusmonstros[5] = new Inimigo(20,6, 2);
        meusmonstros[6] = new Inimigo(35,25, 2);
        meusmonstros[7] = new Inimigo(35,15, 2);
        
        Tiro[] meustiros = new Tiro[50];
        
        
        
        
        //Inicia o jogo
        Space.init();
        for (int i = 0; i < 150; i++) {
            
            meusmonstros[0].setY(meusmonstros[0].getY()+1);
            meusmonstros[1].setY(meusmonstros[1].getY()+1);
            meusmonstros[2].setY(meusmonstros[2].getY()+1);
             meusmonstros[3].setY(meusmonstros[3].getY()+1);
              meusmonstros[4].setY(meusmonstros[4].getY()+1);
            if(Space.apertouDireita()){
                Space.setPlatX(Space.getPlatX()+1);
            }
            if(Space.apertouEsquerda()){
                Space.setPlatX(Space.getPlatX()-1);
            }
            if(Space.apertouEspaco()){
                meustiros[quantidadeTiros] = new Tiro(Space.getPlatX(),2);
                quantidadeTiros++;
            }
            
            Space.desenha(meusmonstros, quantidadeMonst, meustiros, quantidadeTiros);
        }
        
        
    }

}

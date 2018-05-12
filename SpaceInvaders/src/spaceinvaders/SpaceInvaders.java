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
        Inimigo[] meusmonstros = new Inimigo[3];
        meusmonstros[0] = new Inimigo(5, 6, 2);
        meusmonstros[1] = new Inimigo(5, 25, 2);
        meusmonstros[2] = new Inimigo(5, 15, 2);
        
        
        
        Tiro[] meustiros = new Tiro[3];
        
        
        
        
        //Inicia o jogo
        Space.init();
        
        Space.desenha(meusmonstros, 3, meustiros, 0);
        
        if(Space.apertouDireita()){
            Space.setPlatX(Space.getPlatX()+1);
        }
        if(Space.apertouEsquerda()){
            Space.setPlatX(Space.getPlatX()-1);
        }
        
        
    }

}

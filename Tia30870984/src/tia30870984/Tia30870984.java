/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia30870984;

/**
 *
 * @author 30870984
 */
public class Tia30870984 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] digitos = new int[8];
        digitos[0] = 3;
        digitos[1] = 0;
        digitos[2] = 8;
        digitos[3] = 7;
        digitos[4] = 0;
        digitos[5] = 9;
        digitos[6] = 8;
        digitos[7] = 4;

        Calculos calc = new Calculos();
        calc.testMaiorOcorrencia(digitos);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia30870984;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 30870984
 */
public class Calculos {
    public float calc(int[] digitos, int modo) {
        
        float resultado = 0;
        
        switch(modo)
        {
            case 1:
                resultado = soma(digitos);
                break;
                
            case 2:
                resultado = testMedia(digitos);
                break;
            case 3:
                 resultado = testMaiorDigito(digitos);
            break;
            
            case 4:
                 resultado = testMenorDigito(digitos);
            break;

            case 5:
                 resultado = testMaiorOcorrencia(digitos);
            break;               
        }
        
        return resultado;
  }
    
    private float soma(int[] digitos)
    {
        float resultado = 0;
        
        for (int item : digitos) {
            resultado +=item;
        }
        
        return resultado;
    }
    
    private float testMedia(int[] digitos)
    {
        float resultado =0;
        
        for (int item : digitos) {
            resultado +=item;
        }
        
        return resultado/ digitos.length;
    }
    
    private float testMaiorDigito(int[] digitos)
    {
        float resultado = 0;
        
        for (int item : digitos) {
            
            if(item >= resultado)
                resultado = item;
        }
        
        return resultado;
    }
    
    private float testMenorDigito(int[] digitos)
    {
        float resultado = 0;
        
        for (int item : digitos) {
            
            if(item <= resultado)
                resultado = item;
        }
        
        return resultado;
    }  

    float testMaiorOcorrencia(int[] digitos)
    {
        Arrays.sort(digitos);
        
       int qtd = 0;
       
       Map<Integer, Integer> numbers = new HashMap<Integer,Integer>();
       
        for (int item : digitos) {

           for( int number : numbers.)
           {
                if(number == item)
                {
                }
                else
                {
                }
           }
        }
        
        return num;
    }     
}

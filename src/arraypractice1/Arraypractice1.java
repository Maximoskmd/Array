/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice1;

/**
 *
 * @author Maximos
 */
public class Arraypractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grades[]={228,15,11,14,6,18};
        int max=0;
        int thesi_max=0;
        for(int i=0; i<grades.length;i++){
            if(grades[i]>max){
                max=grades[i];
                thesi_max=i;
            }
        }
        System.out.println("o megaliteros bathmos einai: "+max+" stin thesi "+thesi_max);
    }
    
}

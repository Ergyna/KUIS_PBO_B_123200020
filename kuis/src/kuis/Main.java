/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author HP series
 */
public class Main {
    int jmlh=0;
    
    public static void main(String[] args) {
        Main cetak = new Main();
        cetak.printAnimal(new Macan());
        cetak.printAnimal(new Macan());
        cetak.printAnimal(new Ayam());
        cetak.printAnimal(new Kambing());         
    }

    public void printAnimal(Animal animal) {
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");
        if("macan".equals(animal.getType())){
            jmlh++;
            for(int i=0; i<jmlh; i++){
                animal.makeSound();
            }
        }
        else{
            animal.makeSound();
        }
        System.out.println("");
    }
}
    


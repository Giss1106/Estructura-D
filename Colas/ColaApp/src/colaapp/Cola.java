/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaapp;
public class Cola {
    private Object[ ] colaArr;
    private int tamanoMax;
    private int frente;
    private int fin;
    private int numElems;
    public Cola(int tamano){
        tamanoMax=tamano;
        colaArr= new Object[ tamanoMax];
        fin=-1;
        frente =0;
        numElems=0;
        
    }
    public void insertar(Object elemento){
        if (fin==tamanoMax-1){
            fin=-1;
        }
        fin++;
        colaArr[fin]=elemento;
        numElems++;
    }
    public Object quitar(){
        Object temp=colaArr[frente];
        frente+=1;
        if (frente==tamanoMax){
            frente =0;
        }
        numElems--;
        return temp;
    }
    public Object frentecola(){
        return colaArr[frente];
    }
    public boolean colavacia(){
        return (numElems==0);
    }
    public boolean colallena(){
        return (numElems==tamanoMax);
    }
     public int tamanocola(){
        return numElems;
    }
}

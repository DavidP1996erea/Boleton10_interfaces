package principal;

import java.util.Arrays;
import java.util.Scanner;

public class PilaTabla implements Pila {

    Scanner sc = new Scanner(System.in);

    Integer [] pila;
    int cima;
    int tamanoPila;


    public PilaTabla(){
        this.pila= new Integer[10];
        this.cima=-1;
    }


    public PilaTabla(int tamanoPila){

        this.tamanoPila=tamanoPila;
        this.pila= new Integer[tamanoPila];
        this.cima=-1;
    }

    public boolean pilaVacia(){
        boolean vacio=false;
        if(cima==-1){
            vacio=true;
        }

        return vacio;
    }

    public boolean pilaLlena(){

        boolean llena=false;
        if(cima==pila.length-1){
            llena=true;
        }

        return llena;
    }


    @Override
    public void apilar() {

        if (cima == pila.length - 1) {

            System.out.println("La pila esta llena");

        } else{
            cima++;
        System.out.println("Introduzca el número");
        pila[cima] = sc.nextInt();

    }
}

    public void numeroEnCima(){

        if(cima==-1){
            System.out.println("null");
        }else {
            System.out.println(pila[cima]);
        }
    }

    public void apilarPrimeraPosicion() {

        System.out.println("Introduce un numero en la primera posición");
        int insertar = sc.nextInt();
        int guardado = 0;

        for (int i = 0; i <= cima + 1; i++) {

            if (i <= cima) {
                guardado = pila[i];
            }
            pila[i] = insertar;
            insertar = guardado;
        }
    }

    @Override
    public void desapilar() {

        if(cima<0){
            System.out.println("No hay nada que desapilar");
        }else {
            pila[cima]=null;
            cima--;
        }
    }

    @Override
    public String toString() {
        return "PilaTabla{" +
                "pila=" + Arrays.toString(pila) +
                ", cima=" + cima +
                ", tamanoPila=" + tamanoPila +
                '}';
    }
}

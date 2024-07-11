
package logica;

import bean.Ordenar;
import java.util.ArrayList;

public class LOrdenar {
    
    private ArrayList<Integer> diezMil, cienMil, unMillon;
    private Ordenar ordenar;

    public LOrdenar() {
        diezMil = new ArrayList<>();
        cienMil = new ArrayList<>();
        unMillon = new ArrayList<>();
        ordenar = new Ordenar();
    }

    public LOrdenar(ArrayList<Integer> diezMil, ArrayList<Integer> cienMil, ArrayList<Integer> unMillon, Ordenar ordenar) {
        this.diezMil = diezMil;
        this.cienMil = cienMil;
        this.unMillon = unMillon;
        this.ordenar = ordenar;
    }

    public ArrayList<Integer> getDiezMil() {
        return diezMil;
    }

    public void setDiezMil(ArrayList<Integer> diezMil) {
        this.diezMil = diezMil;
    }

    public ArrayList<Integer> getCienMil() {
        return cienMil;
    }

    public void setCienMil(ArrayList<Integer> cienMil) {
        this.cienMil = cienMil;
    }

    public ArrayList<Integer> getUnMillon() {
        return unMillon;
    }

    public void setUnMillon(ArrayList<Integer> unMillon) {
        this.unMillon = unMillon;
    }

    public Ordenar getOrdenar() {
        return ordenar;
    }

    public void setOrdenar(Ordenar ordenar) {
        this.ordenar = ordenar;
    }
    
    
    
    //simple 1
    public void burbuja(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arrayList.get(j) > arrayList.get(j+1)) {
                    int dato = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, dato);
                }
            }
        }
    }
    
    //simple 2
    
    public static void ordenarPorInsercion(ArrayList<Integer> lista) 
    {
        int n = lista.size();

        for (int i = 1; i < n; ++i) 
        {
            int cambio = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > cambio) 
            {
                lista.set(j + 1, lista.get(j));
                j = j - 1;
            }
            lista.set(j + 1, cambio);
        }
    }
    
    
    
    //complejo 1
    public void quickSort(ArrayList<Integer> arrayList, int bajo, int alto) {
        if (bajo < alto) {
            int pi = dividir(arrayList, bajo, alto);

            quickSort(arrayList, bajo, pi - 1);
            quickSort(arrayList, pi + 1, alto);
        }
    }

    public int dividir(ArrayList<Integer> arrayList, int bajo, int alto) {
        int pivot = arrayList.get(alto);
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (arrayList.get(j) < pivot) {
                i++;

                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(j));
                arrayList.set(j, temp);
            }
        }

        int temp = arrayList.get(i + 1);
        arrayList.set(i + 1, arrayList.get(alto));
        arrayList.set(alto, temp);

        return i + 1;
    }
    
    //complejo 4
    public static void mergeSort(ArrayList<Integer> lista) {
        if (lista.size() > 1) {
            int medio = lista.size() / 2;

            ArrayList<Integer> mitadIzquierda = new ArrayList<>(lista.subList(0, medio));
            ArrayList<Integer> mitadDerecha = new ArrayList<>(lista.subList(medio, lista.size()));

           
            mergeSort(mitadIzquierda);
            mergeSort(mitadDerecha);

            merge(lista, mitadIzquierda, mitadDerecha);
        }
    }

    private static void merge(ArrayList<Integer> lista, ArrayList<Integer> izquierda, ArrayList<Integer> derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i) <= derecha.get(j)) {
                lista.set(k++, izquierda.get(i++));
            } else {
                lista.set(k++, derecha.get(j++));
            }
        }

        
        while (i < izquierda.size()) {
            lista.set(k++, izquierda.get(i++));
        }

       
        while (j < derecha.size()) {
            lista.set(k++, derecha.get(j++));
        }
    }
    
    public ArrayList<Integer> crear(int i){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int k = 0; k < i; k++){
            arrayList.add((int) (Math.random() * (i + 1)));
            //arrayList.add((int) (Math.random() * 101));
        }
        return arrayList;
    }
    
    /*public String concatenar(ArrayList<Integer> arrayList){
        String cadena = "";
        for(int i : arrayList){
            cadena += i + "\n";
        }
        
        return cadena;
    }*/
    
    public String concatenar(ArrayList<Integer> arrayList){
        String cadena = "";
        for(int j = 0; j < 10000; j++){
            cadena += "\t\t\t\t\t\t" + arrayList.get(j) + "\n";
        }
        
        return cadena;
    }
    
    /*public String concatenar(ArrayList<Integer> arrayList){
        String cadena = "";
        for(int j = 0; j < 100000; j += j + 5){
            cadena += "\t" + arrayList.get(j) + "\t" + arrayList.get(j + 1) + "\t" + arrayList.get(j + 2) + "\t" + arrayList.get(j + 3) + "\t" + arrayList.get(j + 4) + "\n";
        }
        System.out.println(cadena);
        return cadena;
    }*/
    
    /*public String concatenar(ArrayList<Integer> arrayList){
        String cadena = "";
        for(int i : arrayList){
            cadena += String.format("%-12s", i);
        }
        
        return cadena;
    }*/
    
    
    
    
    
}

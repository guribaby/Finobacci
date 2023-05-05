package actividad;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	
    String ListaCompleta = "C://Users//gurik//OneDrive//Escritorio//usuarios.txt";
    String ListaImpares = "C://Users//gurik//OneDrive//Escritorio//usuarios.txt";
    String ListaPares= "C://Users//gurik//OneDrive//Escritorio//usuarios.txt";


    private void generarArchivos(String nombre, List<Integer> lista) throws IOException{
        FileWriter writer = new FileWriter(nombre);
        for (Integer i : lista){
            writer.write(i + "\n");
        }
        writer.close();
    }
    public void correrPrograma() throws IOException{

       List<Integer> fibonacci = Fibonacci.getListFibonacci(1000000);

        List<Integer> listaPar = Splitter.pares(fibonacci);

        List<Integer> listaImpar = Splitter.impares(fibonacci);

        generarArchivos(ListaCompleta,fibonacci);
        
        generarArchivos(ListaImpares,listaImpar);
        generarArchivos(ListaPares,listaPar);

    }
}

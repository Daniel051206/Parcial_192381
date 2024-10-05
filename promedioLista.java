
public class promedioLista {
    public static void main(String[] args) {
       int[] listaNumeros = {1,2,3,4,5};
       int longitudLista= listaNumeros.length;
       int acumulador = 0;
       for(int i=0; i<=longitudLista; i++){
            acumulador += i;
       }
       int promedioLista = acumulador/longitudLista;
       System.out.println("El promedio de la lista es: " + promedioLista);
    }
}
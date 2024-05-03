import java.util.ArrayList;

public class listaArray {

    public static void main(String[] args) {

        // Lista para armazenar arrays de inteiros
       ArrayList<int[]> lista = new ArrayList<>();

       //inicializando arrays
       int[] array1 =  {1, 2, 3};
       int[] array2 =  {4, 5, 6};
       int[] array3 =  {7, 8, 9};

       //adicionando arrays a lista
       lista.add(array1);
       lista.add(array2);
       lista.add(array3);


    for (int[] array : lista) {

        for (int[] element : lista) {
            System.out.println(element + " ");

        }
        System.out.println();

    }














    }
}

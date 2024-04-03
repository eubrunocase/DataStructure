import java.util.ArrayList;
import java.util.List;

public class teste {

    private Object[] elementos;
    private int Tamanho;
    private int capacidade;

    ArrayList<int[]> lista = new ArrayList<>();

public teste() {
    this.Tamanho = 0;
    this.capacidade = 5;
    elementos = new Object[capacidade];
}

    public teste(int capacidade) {
        this.Tamanho = 0;
        this.capacidade = capacidade;
        elementos = new Object[capacidade];

    }
    public void setElementos(Object[] elementos) {
        this.elementos = elementos;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Object[] getElementos() {
        return elementos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public boolean capacityVazia () {
        return (Tamanho == 0 );
    }

    public void plusCapacity() {
        if (Tamanho == capacidade) {
            Object[] novoElemento = new Object[capacidade*=2];
            for (int i = 0; i<Tamanho; i++) {
                novoElemento[i] = elementos[i];
            }
             elementos = novoElemento;
        }
    }

    public void add (int index, Object elem) {

       if (index < 0 || index>this.Tamanho) {
           throw new IndexOutOfBoundsException("Index=" + index + "e size" + this.Tamanho);

       }

       plusCapacity();
            for(int i = this.Tamanho; i > index; i--) {
                elementos[i] = elementos[i-1];
                elementos[index]=elem;
                this.Tamanho++;

            }

    }


    public Object remove (int index) {
        if (index<0 || index>this.Tamanho) {
            throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.Tamanho);
        }
        Object tempObj = elementos[index];
        elementos[index]=null;

        return tempObj;
    }


}

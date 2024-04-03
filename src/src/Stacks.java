public class Stacks {

   private int tamanhoMaximo;
   private int topo;
   private int[] array;

// Construtor para inicializar a pilha com um tamanho maximo
   public Stacks (int tamanhoMaximo) {
       this.tamanhoMaximo = tamanhoMaximo;
       this.array = new int[tamanhoMaximo];
       this.topo = -1;
   }

   // metodo para verificar se a pilha esta vazia
   private boolean isEmpty() {
       return topo == -1;
   }

   // metodo para verificar se a pilha esta cheia
   private boolean isFull() {

       return topo == tamanhoMaximo - 1;
   }

   // metodo para adicionar um elemento ao topo da pilha
public void push (int elemento) {
       if (isFull()) {
           System.out.println("Erro: a pilha está cheia e não é possível adicionar mais elementos");
           return;
       }
       else   array[++topo] = elemento;   // incrementa o topo e adiciona o elemento
}

   // metodo para remover e retornar o elemento no topo da pilha
public int pop () {
    if (isEmpty()) {
        System.out.println("Erro: a pilha está vazia, não é possível remover elementos");
        return -1;  // retorna -1 para indicar que a pilha esta vazia
    }
   else
       return array[topo--];  // retorna e decrementa o topo
}

   // Metodo para retornar o elemento ao topo da pilha sem remove-lo
public int peek() {
       if (isEmpty()) {
           System.out.println("Erro: a pilha está vazia e não é possível retornar elementos");
           return -1; // retorna -1 para informar que a pilha esta vazia

       } else return array[topo];  // retorno o elemento ao topo
}




}


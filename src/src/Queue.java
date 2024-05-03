
/*
* @Author: BRUNO CASÉ
* Version: 1.0
* Since: 02/05/2024
* Last att: 02/05/2024
* Classe criada para estudo da estrutura de dados Filas Queue;
*
*
* */


/* Inicio da classe */
    public class Queue {

        private QueueNode front, rear;

        /* --------- Construção do nó ---------*/
        private class QueueNode {
            private Object element;
            private QueueNode next;

            private QueueNode(Object e, QueueNode n) {
                element = e;
                next = n;
            }
        }

    /* ------------ Construtor ------------ */
        public Queue() {
            front = rear = null;
        }

        // Métodos


              /* ------------- Verificando se a fila está vazia -------------*/
        public boolean empty() {
            return (front == null);
        }


        /* -------------- Metodo Enqueue para adicionar elemento --------------*/
        public void enqueue(Object elemento) {
            QueueNode novoNode = new QueueNode(elemento, null);
            if (empty()) {
                front = rear = novoNode;
            } else {
                rear.next = novoNode;
                rear = novoNode;
            }
        }


    /* -------------- Metodo Dequeue para remover elemento --------------*/
        public Object dequeue() {
            if (empty()) {
                System.out.println("A fila está vazia. Não é possível remover elementos.");
                return null;
            }
            Object elementoRemovido = front.element;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return elementoRemovido;
        }


    /* -------------- Metodo para exibição --------------*/
        public void print() {
            if (this.empty())
                System.out.println("Fila Vazia");
            else {
                System.out.println("<-----Inicio----->");
                QueueNode itr = front;
                while (itr != null) {
                    System.out.println(itr.element.toString());
                    itr = itr.next;
                }
                System.out.println("<-----Fim----->");
            }
        }


        /*  --------------Metodo main para execução da classe--------------  */
        public static void main(String[] args) {
            Queue fila = new Queue();
            fila.enqueue("Bruno");
            fila.enqueue("Zaira");
            fila.enqueue("Jhon");
            fila.enqueue("Jorge");
            fila.dequeue();
            fila.print();


        }
    }


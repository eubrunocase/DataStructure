
    public class Queue {
        // Representação
        private QueueNode front, rear;

        private class QueueNode {
            private Object element;
            private QueueNode next;

            private QueueNode(Object e, QueueNode n) {
                element = e;
                next = n;
            }
        }

        // Construtores
        public Queue() {
            front = rear = null;
        }

        // Métodos
        public boolean empty() {
            return (front == null);
        }

        public void enqueue(Object elemento) {
            QueueNode novoNode = new QueueNode(elemento, null);
            if (empty()) {
                front = rear = novoNode;
            } else {
                rear.next = novoNode;
                rear = novoNode;
            }
        }

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


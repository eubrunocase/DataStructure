
/*
* @Author: Bruno Casé
* Github: eubrunocase
*
*
*
*
*
*
*
*
* */

/*---------- Inicio ----------*/
public class BinarySearchTree {

    private BinaryNode root;

    /*---------- NÓ DE UMA ÁRVORE BINÁRIA ----------*/
    class BinaryNode {
        private int element;
        private BinaryNode left;
        private BinaryNode right;

        /*---------- Construtor do nó----------*/
        public BinaryNode(int e, BinaryNode l, BinaryNode r) {
            element = e;
            left = l;
            right = r;
        }
    }

    /*----------  Construtor da classe ---------- */
    public BinarySearchTree() {
        root = null;
    }

    /*---------- Esvazia a árvore ----------*/
    public void clear() {
        root = null;
    }

    /*---------- Verifica se está vazia ----------*/
    public boolean isEmpty() {
        return (root == null);
    }

    /*---------- Metodos de inserção abaixo ----------*/
    public void insert(int x) {
        root = insert(x, root);
    }

    /*---------- Metodo para inserir elemento ----------*/
    private BinaryNode insert(int x, BinaryNode t) {
        if (t == null) {
            t = new BinaryNode(x, null, null);
        } else if (x < t.element) {
            t.left = insert(x, t.left);
        } else if (x > t.element) {
            t.right = insert(x, t.right);
        }
        return t;
    }

/*---------- Metodo para exibição ----------*/
    public void print() {
        if (isEmpty())
            System.out.println("Arvore vazia");
        else
            print(root);
    }

    private void print(BinaryNode t) {
        if (t != null) {
            System.out.println(t.element);
            print(t.left);
            print(t.right);

        }
    }

  /*---------- Metodo de busca ----------*/
    public void find(int x) {
        if (root == null) {
            System.out.println("Arvore vazia");
        } else {
            for (BinaryNode t = root; t != null; t = t.left) {
                if (t.element == x) {
                    System.out.println(t.element);
                }
            }
        }
    }

}

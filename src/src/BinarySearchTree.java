
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
        if (root == null) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        return false;
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
            for (BinaryNode t = root; t != null; t = t.left, t = t.right) {
                if (t.element == x) {
                    System.out.println(t.element);
                }
            }
        }
    }

//    public boolean find(int x) {
//        if (x == root.element) {
//            System.out.println(true);
//        }
//        System.out.println(false);
//      return false;
//    }



//    public boolean find(int number) {
//        return find(number, root) != null ? true : false;
//    }
//
//    private BinaryNode find(int number, BinaryNode t) {
//        if (t == null) {
//            return null;
//        }
//        if (number < t.element) {
//            return find(number, t.left);
//        } else if (number > t.element) {
//            return find(number, t.right);
//        } else {
//            return t;
//        }
//
//
//    }


    public int findMin()  {
        if (isEmpty()){
            System.out.println("Arvore vazia");
        }
        return findMin(root).element;

    }
    private BinaryNode findMin(BinaryNode t) {
        if (t == null )
            return null;
        else if( t.left == null )
            return t;
        return findMin( t.left );
    }



    public int findMax( ) {
        if (isEmpty()){
            System.out.println("Arvore vazia");
        }
        return findMax(root).element;
    }
    private BinaryNode findMax( BinaryNode t ) {
        if( t != null )
            while( t.right != null )
                t = t.right;
        return t;
    }


    public void remove( int x ) {
        root=remove(x,root);
    }
    private BinaryNode remove( int x, BinaryNode t ) {
        if( t == null )
            return t;   // Item não está na árvore ou árvore vazia, não faça nada
        if( x < t.element)
            t.left = remove( x, t.left );
        else if( x > t.element )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) {  // Caso 3 – nó com dois filhos
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        }
        else // Caso 1 e 2 – nó com um ou nenhum filho
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }


}

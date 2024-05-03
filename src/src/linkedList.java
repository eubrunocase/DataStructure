import jdk.jfr.Description;

public class linkedList {


// Atributos da lista
 private ListNode head;         // Primeiro elemento da lista
 private ListNode tail;        // Ultimo elemento da lista
 private ListNode previous;    // Elemento antecessor
 private int size;             // Tamanho da lista
 private class ListNode {     // Classe interna ListNode
  private Object element;     // Nó
  private ListNode next;      // Ponteiro para o proximo elemento


  private ListNode(Object e, ListNode n) {    // Construtor
   element = e;
   next = n;
   }
 }








}
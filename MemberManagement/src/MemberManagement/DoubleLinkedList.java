package MemberManagement;

public class DoubleLinkedList<E> {
	//--- 노드 ---//
    class Node<E> {
        private E data;              // 데이터
        private Node<E> prev;        // 앞쪽포인터(앞쪽 노드에 대한 참조)
        private Node<E> next;        // 뒤쪽포인터(뒤쪽 노드에 대한 참조)

        //--- 생성자(constructor) ---//
        Node() {
            data = null;
            prev = next = this;
        }

        //--- 생성자(constructor) ---//
        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }
    
    private Node<E> head;        // 머리 포인터(참조하는 곳은 더미노드)
    private Node<E> crnt;        // 선택 포인터

    //--- 생성자(constructor) ---//
    public DoubleLinkedList() {
        head = crnt = new Node<E>();        // 더미 노드를 생성
    }

    //--- 리스트가 비어있는가? ---//
    public boolean isEmpty() {
        return head.next == head;
    }
}

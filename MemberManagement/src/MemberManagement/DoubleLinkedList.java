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
}

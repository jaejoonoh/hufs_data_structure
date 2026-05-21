package MemberManagement;

public class LinkedList<E> {
	//--- 노드 ---//
    class Node<E> {
        private E data;              // 데이터
        private Node<E> next;        // 뒤쪽 포인터(다음 노드에 대한 참조)

        //--- 생성자(constructor) ---//
        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

}

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
    
    private Node<E> head;        // 머리 포인터(머리 노드에 대한 참조)
    private Node<E> crnt;        // 선택 포인터(선택 노드에 대한 참조)

    //--- 생성자(constructor) ---//
    public LinkedList() {
        head = crnt = null;
    }
    
  //--- 머리 노드 삽입 ---//
    public void addFirst(E obj) {
        Node<E> ptr = head;                       // 삽입 전의 머리 노드
        head = crnt = new Node<E>(obj, ptr);
    }
    
    //--- 꼬리 노드 삽입 ---//
    public void addLast(E obj) {
        if (head == null)                // 리스트가 비어있으면
            addFirst(obj);               // 머리에 삽입
        else {
            Node<E> ptr = head;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }
    
    //--- 다음 노드 선택 ---//
    public boolean next() {
        if (crnt == null || crnt.next == null)
            return false;           // 나아갈 수 없음
        crnt = crnt.next;
        return true;
    }
    
    //--- 선택 노드 표시 ---//
    public void printCurrentNode() {
        if (crnt == null)
            System.out.println("주목노드가 없습니다.");
        else
            System.out.println(crnt.data);
    }

    //--- 전체 노드 표시 ---//
    public void dump() {
        Node<E> ptr = head;

        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    
    

}

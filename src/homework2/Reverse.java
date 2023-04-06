package homework2;

// РЕАЛИЗОВАТЬ МЕТОД РАЗВОРОТА СВЯЗНОГО СПИСКА (двухсвязного).

public class Reverse {
    Node head;
    Node tail;

    public void revert(){
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous; // меняем их местами
            currentNode.previous = next;
            if (previous == null) { // если находимся в head
                tail = currentNode; // меняем ее на tail
            }
            if (next == null) { // если это последний элемент
                head = currentNode; // меняем его на head
            }
            currentNode = next;
        }
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}

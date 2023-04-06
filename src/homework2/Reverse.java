package homework2;

// РЕАЛИЗОВАТЬ МЕТОД РАЗВОРОТА СВЯЗНОГО СПИСКА (двухсвязного).

public class Reverse {
    Node head;
    Node tail;
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert (currentNode.next, currentNode);
        }
        currentNode.next = previousNode;

    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}

package DataStructures;

public class Stack<Item>
{
    private Node _first = null;

    private class Node
    {
        public Item data;
        public Node next = null;
    }

    public void push(Item data)
    {
        Node old_first = _first;
        _first = new Node();
        _first.data = data;
        _first.next = old_first;
    }

    public Item pop()
    {
        Item data = _first.data;
        _first = _first.next;
        return data;
    }
}


package DataStructures;

public class StackWithMax
{
    private Node _first = null;
    private Integer max = null;

    private class Node
    {
        public int data;
        public Node next = null;
    }

    public void push(int data)
    {
        Node old_first = _first;
        _first = new Node();
        _first.data = data;
        _first.next = old_first;
        if (max == null || max < data)
        {
            max = data;
        }
    }

    public int pop()
    {
        int data = _first.data;
        _first = _first.next;

        if (max != null && data == max) {max = null;}
        return data;
    }

    public int max()
    {
        if (max == null)
        {
            Node current = _first;
            while(current != null)
            {
                if (max == null || max < current.data)
                {
                    max = current.data;
                }
                current = current.next;
            }
        }
        return max;
    }
}

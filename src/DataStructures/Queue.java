package DataStructures;
import java.util.Iterator;
import java.util.ListIterator;




public class Queue<Item> implements Iterable<Item>
{
    private Node first, last;

    private class Node
    {
        public Item data;
        public Node next = null;
    }
    private class ListIterator implements Iterator<Item>
    {
            Node current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                Item data = current.data;
                current = current.next;
                return data;
            }

    };



    public void enqueue(Item data)
    {
        Node old_last = last;
        last = new Node();
        last.data = data;

        if (!IsEmpty()){old_last.next = last;}
        else {first=last;}
    }

    public Item dequeue()
    {
        Item data = first.data;
        first = first.next;
        if (IsEmpty()) {last=first;}
        return data;
    }

    public boolean IsEmpty()
    {
        return (first==null);
    }

    @Override
    public Iterator<Item> iterator()
    {
        return new ListIterator();

    }
}

package DataStructures;

public class ArrayStack<Item>
{
    private Item[] _data;
    private int N = 0;


    public ArrayStack()
    {
        _data = (Item[]) new Object[1];
    }

    public void push(Item data)
    {
        if (N==_data.length)
        {
            resize(_data.length*2);
        }
        _data[N] = data;
        N++;
    }

    public Item pop()
    {
        Item data = _data[--N];
        if (N > 0 && N == _data.length/4)
        {
            resize(_data.length/2);
        }
        return data;
    }

    private void resize(int capacity)
    {
        Item[] new_data = (Item[]) new Object[capacity];
        for (int i = 0; i<N; i++)
        {
            new_data[i] = _data[i];
        }
        _data = new_data;
    }

    public boolean IsEmpty()
    {
        return N == 0;
    }
    
}

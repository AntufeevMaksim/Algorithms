package DataStructures;



public class QueueOfTwoStacks<Item>
{
    ArrayStack<Item> stack_in = new ArrayStack<>();
    ArrayStack<Item> stack_out = new ArrayStack<>();

    public void enqueue(Item data)
    {
        stack_in.push(data);
    }

    public Item dequeue()
    {
        if (stack_out.IsEmpty())
        {
            while (!stack_in.IsEmpty())
            {
                stack_out.push(stack_in.pop());
            }
        }
        return stack_out.pop();
    }
}

package DataStructures;

class TreeNode<Key extends Comparable<Key>, Value>
{
    public TreeNode<Key, Value> left;
    public TreeNode<Key, Value> right;
    public Key key;
    public Value value;

    public TreeNode(Key key, Value value)
    {
        this.key = key;
        this.value = value;
    }
}

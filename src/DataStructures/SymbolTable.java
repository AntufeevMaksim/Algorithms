package DataStructures;

public class SymbolTable<Key extends Comparable<Key>, Value>
{
    private TreeNode<Key, Value> root;

    public void set(Key key, Value value)
    {
        root = set(root, key, value);
    }

    public Value get(Key key)
    {
        TreeNode<Key, Value> current_node = root;
        while (current_node != null)
        {
            int cmp = current_node.key.compareTo(key);

            if (cmp==0)
            {
                return current_node.value;
            }
            else if (cmp > 0)
            {
                current_node = current_node.left;
            }
            else if (cmp < 0)
            {
                current_node = current_node.right;
            }

        }
        return null;
    }

    public Value min()
    {
        if (root==null) {return null;}

        TreeNode<Key, Value> node = root;

        while (node.left != null){node = node.left;}

        return node.value;
    }

    public Value max()
    {
        if (root==null) {return null;}

        TreeNode<Key, Value> node = root;

        while (node.right != null){node = node.right;}

        return node.value;
    }

    private TreeNode<Key, Value> set(TreeNode<Key, Value> node, Key key, Value value)
    {
        if (node == null){return new TreeNode<Key, Value>(key, value);}

        int cmp = node.key.compareTo(key);

        if (cmp==0)
        {
            node.value = value;
        }
        else if (cmp>0)
        {
            node.left = set(node.left, key, value);
        }
        else if (cmp<0)
        {
            node.right = set(node.right, key, value);
        }
        return node;
    }


}


public class LeafNode implements ComponentNode
{
    protected int item;
    
    public LeafNode(int item)
    {
        this.item = item;
    }

    @Override
    public int item()
    {
        return this.item;
    }

    @Override
    public ComponentNode left()
    {
        return null;
    }

    @Override
    public ComponentNode right()
    {
        return null;
    }
}

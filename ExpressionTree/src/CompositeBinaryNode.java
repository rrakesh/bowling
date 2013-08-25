
public abstract class CompositeBinaryNode extends CompositeUnaryNode
{
    
    protected ComponentNode left;

    public CompositeBinaryNode(ComponentNode componentNode)
    {
        this(componentNode, null);
    }
    
    public CompositeBinaryNode(ComponentNode left, ComponentNode right)
    {
        super(right);
        this.left = left;
    }
    
    @Override
    public ComponentNode left()
    {
        return this.left;
    }

    @Override
    public ComponentNode right()
    {
        return super.right();
    }
}

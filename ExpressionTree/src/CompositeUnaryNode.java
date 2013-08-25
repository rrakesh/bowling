
public abstract class CompositeUnaryNode implements ComponentNode 
{
    protected ComponentNode componentNode;

    public CompositeUnaryNode(ComponentNode componentNode)
    {
        this.componentNode = componentNode;
    }
    
    @Override
    public int item()
    {
        return componentNode.item();
    }

    @Override
    public ComponentNode right()
    {
        return this.componentNode;
    }
    
    @Override
    public ComponentNode left()
    {
        return null;
    }
}

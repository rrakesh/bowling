
public class ComponentNegateNode extends CompositeUnaryNode
{
        
    public ComponentNegateNode(ComponentNode componentNode)
    {
        super(componentNode);
    }

    @Override
    public int item()
    {
        return -1 * super.item();
    }
}

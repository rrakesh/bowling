

public class CompositeAddNode extends CompositeBinaryNode
{

    public CompositeAddNode(ComponentNode left, ComponentNode right)
    {
        super(left, right);
    }

    @Override
    public int item()
    {
        return left().item() + right().item();
    }
    
}

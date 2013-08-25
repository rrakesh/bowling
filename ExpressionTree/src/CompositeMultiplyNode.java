
public class CompositeMultiplyNode extends CompositeBinaryNode
{

    public CompositeMultiplyNode(ComponentNode left, ComponentNode right)
    {
        super(left, right);
    }

    @Override
    public int item()
    {
        int leftValue = left().item();
        int rightValue = right().item();
        return leftValue * rightValue;
    }
}

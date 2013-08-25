
public class Driver
{
    
    public static void main(String [] args)
    {
        ComponentNode l1 = new LeafNode(5);
        ComponentNode l2 = new LeafNode(3);
        ComponentNode l3 = new LeafNode(4);
        
        ComponentNode l4 = new ComponentNegateNode(l1);
        ComponentNode l5 = new CompositeMultiplyNode(l2, l3);
        
        ComponentNode root = new CompositeMultiplyNode(l4,l5);
        
        System.out.println(" Value of tree is = " + root.item());
        
    }

}

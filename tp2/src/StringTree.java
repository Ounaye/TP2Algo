import java.util.ArrayList;

public class StringTree implements Tree<Character>{

    char value;
    boolean isTerminal;
    Tree<Character> parent;
    ArrayList<Tree<Character>> children;

    StringTree(Character value, boolean isTerminal, Tree<Character> parent)
    {
        this.value = value;
        this.isTerminal = isTerminal;
        this.parent = parent;
        children = new ArrayList<>();
    }

    @Override
    public Tree<Character> getParent() {
        return parent;
    }

    @Override
    public ArrayList<Tree<Character>> getChildren() {
        return children;
    }

    @Override
    public void addChildren(Tree<Character> newChildren) {
        children.add(newChildren);
    }

    @Override
    public Character getValue() {
        return value;
    }

    public boolean getTerminal()
    {
        return isTerminal;
    }

    public void setTerminal(boolean terminal)
    {
        isTerminal = terminal;
    }
}

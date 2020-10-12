import java.util.ArrayList;

public interface Tree<T> {

    Tree<T> getParent();

    ArrayList<Tree<T>> getChildren();
    void addChildren(Tree<T> newChildren);

    T getValue();

    void setTerminal(boolean terminal);
}

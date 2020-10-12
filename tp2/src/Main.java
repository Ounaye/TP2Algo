import java.io.File;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FileManager fileManager = new FileManager(new File("./resources/dico.txt"));
        StringTree dico = new StringTree('§',false,null);
        addDico(dico,fileManager.getLine());
        long time = System.nanoTime();
        while(fileManager.hasNext())
        {
            addDico(dico,fileManager.getLine());
        }
        time = System.nanoTime() - time;
        System.out.println("TP2 " + time);
    }

    public static void addDico(Tree<Character> dico, String mot)
    {
        if(mot.length() <= 1)
        {
            for(int i = 0; i<dico.getChildren().size();i++)
            {
                if(dico.getChildren().get(i).getValue() ==  mot.charAt(0))
                {
                    dico.getChildren().get(i).setTerminal(true);
                    return;
                }
            }
            StringTree newTree = new StringTree(mot.charAt(0),true,dico);
            dico.addChildren(newTree);
            return;
        }
        StringBuilder builder = new StringBuilder(mot.length());
        builder.append(mot).deleteCharAt(0);
        for(int i = 0; i<dico.getChildren().size();i++)
        {
            if(dico.getChildren().get(i).getValue() ==  mot.charAt(0))
            {
                addDico(dico.getChildren().get(i),builder.toString());
                return;
            }
        }
        StringTree newTree = new StringTree(mot.charAt(0),false,dico);
        dico.addChildren(newTree);
        addDico(newTree,builder.toString());
    }

}

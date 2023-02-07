import java.util.Scanner;

public class SongSuggester{
  public static boolean askYesNo(String Question){
    System.out.println(Question);
    Scanner scanner = new Scanner(System.in);
    String yesno = scanner.nextLine();
    if (yesno == "y"){
      return true;
    }
    else{
      return false;
    }
  }
  //new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
  public static void main(String[] args){
    TreeNode root = new TreeNode("Do you like classical music? [y/n]",
                        new TreeNode("Are you a fan of Mozart?",
                            new TreeNode("Eine Kleine Nachtmusik"),
                            new TreeNode("\"3 Romances\" by Clara Schumann")),
                        new TreeNode("\"Take Five\" by Dave Brubeck"));

    System.out.println("Welcome! Let's help you find a song.");
    TreeNode current = root;
    while (current.isLeaf() == false){
      System.out.println(root.value);
      if (askYesNo(current.value) == true){
        current = current.getLeft();
      }
      else{
        current = current.getRight();
      }
      System.out.println(current.value);
    }
  }
}

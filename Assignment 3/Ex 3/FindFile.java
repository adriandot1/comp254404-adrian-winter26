import java.util.Scanner;
import java.io.File;

public class FindFile {

  public static void find(File root, String filename) {
    if (!root.exists()) return;

    if (root.getName().equals(filename)) {
      System.out.println(root);                         
    }

    if (root.isDirectory()) {                           
      String[] children = root.list();
      if (children != null) {
        for (String childname : children) {
          File child = new File(root, childname);      
          find(child, filename);                       
        }
      }
    }
  }

  public static void find(String path, String filename) {
    find(new File(path), filename);
  }

  public static void main(String[] args) {
    String start;
    String filename;

    if (args.length >= 2) {
      start = args[0];
      filename = args[1];
    } else {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the starting location: "); //input . to go higher
      start = input.nextLine();
      System.out.print("Enter the file name to find: ");
      filename = input.nextLine();
    }

    find(start, filename);
  }
}

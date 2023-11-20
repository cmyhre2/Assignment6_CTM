/**
 * @author Chris Myhre
 * @version 1.1 (CS-215 Module 6 Lab)
 * Fall 2023 (11/20/2023)
 */

/**
 * @author Nathan Johnson, Bellarmine University (Version 1.0)
 * 
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		
		
		//aSearch.DFS2(root);
		//aSearch.DFS3(root);
	}

}
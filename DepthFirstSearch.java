/**
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 6 Lab)
 * Fall 2023 (11/20/2023)
 */
public class DepthFirstSearch {       
       Node root;
       private int nodesTraversed = 0;// int variable to track nodes traversed
       private int height = 1;// int variable to track the current node's height in the tree
       public DepthFirstSearch()
       {               
                   System.out.println("\nDepth First Search Created.\n"); //tells the user the DFS method can now be used on a tree.
       }
       /**
        * DFS = recursive method that calls itself to print the current node's data and counts nodes traversed as it's traversing nodes 
        * along with tracking + printing each node's tree height as it's being traversed.
        * @param node 
        */
        public void DFS(Node node){ 
        	nodesTraversed++;
        	System.out.println("Node Data: " + node.getData() + "\nNode Tree Height: " + height + "\nNodes Traversed: " + nodesTraversed + "\n");
            if(node.getlChild()!=null) {//if statement checks if node is a leaf
            	height++;
            	DFS(node.getlChild());//recursive call to call itself on the left child of current node, if it has a left child
            }//end if statement
            else
            	return;//returns up a level in the tree
            DFS(node.getrChild());//recursive call to the right child of a already traversed node
            height--;
        }//end DFS()
        /**
         * @return nodesTraversed
         */
		public int getNodesTraversed() {
			return nodesTraversed;
		}//end getNodesTraversed()
		
		/**
		 * @param nt to set nodesTraveled
		 */
		public void setNodesTraversed(int nt) {
			nodesTraversed = nt;
		}//endsetNodesTraversed()

		/**
         * @return height
         */
		public int getHeight() {
			return height;
		}//end getHeight()
		
		/**
		 * @param h to set height
		 */
		public void setHeight(int h) {
			height = h;
		}//end setHeight(
}//end DepthFristSearch class
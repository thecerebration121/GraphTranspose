package graphTranspose;

import java.util.Iterator;
import java.util.LinkedList;


class oldGraph
{
	public LinkedList<Integer> oldG[];
	
	oldGraph(int v)
	{
		oldG = new LinkedList[v];
		for(int i =0; i<v;i++)
		{
			oldG[i]=new LinkedList();
		}
	}
	
	void addEdge(int v ,int w)
	{
		oldG[v].add(w);
	}
	
	 void displayGraph()
	 {
		 int i=0;
 
		 for(i=0;i<oldG.length;i++)
		 {
	         Iterator<Integer> j = oldG[i].listIterator();
	         System.out.print(i);
	         while(j.hasNext())
	         {
	        	 System.out.print("->"+j.next());
	         }

	         System.out.println();
		 }
	 }
	
	
}


public class Graph {

	private LinkedList<Integer> newGraph[];
	
	Graph(int v)
	{
		newGraph = new LinkedList[v];
		for(int i =0; i<v;i++)
		{
			newGraph[i]=new LinkedList();
		}
	}
	
	void addEdge(int v ,int w)
	{
		newGraph[v].add(w);
	}
	
	void transpose(oldGraph og )
	{
		 for(int i =0;i<og.oldG.length;i++)
		 {
	         Iterator<Integer> j = og.oldG[i].listIterator();
	         
	         while(j.hasNext())
	         {
	        	 addEdge(j.next() , i);
	         }

	         System.out.println();
		 }
	}
	 
	
	void displayGraph()
	 {
		 int i=0;

		 for(i=0;i<newGraph.length;i++)
		 {
	         Iterator<Integer> j = newGraph[i].listIterator();
	         System.out.print(i);
	         while(j.hasNext())
	         {
	        	 System.out.print("->"+j.next());
	         }

	         System.out.println();
		 }
	 }
	 
	public static void main(String args[])
	{
		oldGraph og = new oldGraph(4);
		og.addEdge(0,2 );
		og.addEdge(1, 0);
		og.addEdge(3, 2);
		og.addEdge(1,3);
		og.displayGraph();
		
		Graph g = new Graph(4);
		g.transpose(og);
		g.displayGraph();
	}

}

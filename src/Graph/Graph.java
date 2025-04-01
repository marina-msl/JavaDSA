package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private HashMap<String, ArrayList<String>>adjList = new HashMap<>();
	
	
	public void printGraph() {
		System.out.println(adjList);
	}
	
	public boolean addVertex(String vertext) {
		if (adjList.get(vertext) == null) {
			adjList.put(vertext, new ArrayList<String>());
			
			return true;
		}
		return false;
	}
	
}

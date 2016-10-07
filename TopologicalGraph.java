import java.util.*;


public class TopologicalGraph {

	/**
	 * @param args
	 */
	int V;
	LinkedList<Integer> adj[];
	TopologicalGraph(int v){
		V=v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	void topologicalSort(){
		Stack<Integer> st = new Stack();
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			visited[i] = false;
		}
		for (int i = 0; i < V; i++) {
			if(!visited[i]){
				topologicalSortUntil(i, visited, st);
			}
			
		}
		while (st.empty()==false)
            System.out.print(st.pop() + " ");
	}
	private void topologicalSortUntil(int i, boolean[] visited,
			Stack<Integer> st) {
		// TODO Auto-generated method stub
		visited[i] =true;
		Integer n;
		Iterator<Integer> it = adj[i].iterator();
		while(it.hasNext()){
			n = it.next();
			if(!visited[n]){
				topologicalSortUntil(n,visited,st);
			}	
		}
		st.push(new Integer(i));
		
	}
	public static void main(String[] args) {
		// logTODO Auto-generated method stub
		TopologicalGraph topo = new TopologicalGraph(6);
		topo.addEdge(5, 2);
		topo.addEdge(5, 0);
		topo.addEdge(4, 0);
		topo.addEdge(4, 1);
		topo.addEdge(2, 3);
		topo.addEdge(3, 1);
		topo.topologicalSort();
	}
}

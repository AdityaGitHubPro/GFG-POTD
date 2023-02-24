Question Link: https://practice.geeksforgeeks.org/problems/e7d81a082cda6bd1e959d943197aa3bc21b88bdb/1



class Solution {
    static class Node implements Comparable<Node>{
		int v;
		int w;
		Node(int v, int w){
			this.v = v;
			this.w = w;
		}
		
		public int compareTo(Node o) {
			return this.w - o.w;
		}
	}

	static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
		
		ArrayList<ArrayList<Node>> adj = new ArrayList<>();
		for(int i = 0 ; i <= n ; i++) {
			adj.add(new ArrayList<>());
		}
		
		
		for(int i = 0 ; i < m ; i++) {
			int u = edges.get(i).get(0);
			int v = edges.get(i).get(1);
			int straightWeight = edges.get(i).get(2);
			
			adj.get(u).add(new Node(v, straightWeight));
			adj.get(v).add(new Node(u, straightWeight));
		}
		
		int[] dista = diskstra(adj, a, n);
		int[] distb = diskstra(adj, b, n);
		
		int ans = dista[b];
		for(int i = 0 ; i < m ; i++) {
			int u = edges.get(i).get(0);
			int v = edges.get(i).get(1);
			int curvedWeight = edges.get(i).get(3);
			
			ans = Math.min(ans, dista[u] + distb[v] + curvedWeight);
			ans = Math.min(ans, dista[v] + distb[u] + curvedWeight);
		}
		
		if(ans == 1000000001) {
			return -1;
		}
		
		return ans;
	}
	
	// Time = (V+E)logv
	static int[] diskstra(ArrayList<ArrayList<Node>> adj, int start, int n) {
		
		 // sorting in asc order of src-> target dist
        int dis[] = new int[n+1];
        Arrays.fill(dis, 1000000001);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> { return x.w - y.w; }); 
        
        
        dis[start]=0;
        
        pq.add(new Node(start,0)); //1sr para is target and 2nd para is dist from src(2) to target
        
        while(!pq.isEmpty())
        {
            Node curr_node =pq.poll();  // VlogV
            for(Node nei : adj.get(curr_node.v))  // ElogV
            {
                // u -> v if(d[v] > d[u] + w[u,v]) d[v] = d[u] + w[u,v])
                //d[v] = dis[nei.v] , d[u] = dis[curr_node.v]  , w[u,v] = nei.w
                if(dis[nei.v] > dis[curr_node.v] + nei.w)
                {
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.add(new Node(nei.v , dis[nei.v])); // passing the targer and its updated wt from src(2) to target
                }   
            }
        }
        return dis;
	}
};

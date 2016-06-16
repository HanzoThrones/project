import java.util.*;

/**
 * This class models a simple, undirected graph using an 
 * incidence list representation. Vertices are identified 
 * uniquely by their labels, and only unique vertices are allowed.
 * At most one Edge per vertex pair is allowed in this Graph.
 * 
 * Note that the Graph is designed to manage the Edges. You
 * should not attempt to manually add Edges yourself.
 * 
 * @author Michael Levet
 * @date June 09, 2015
 */
public class Graph {
    
    private HashMap<Integer, TileVertex> vertices;
    private HashMap<Integer, MapEdge> edges;
    
    public Graph(){
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();
    }
    
    /**
     * This constructor accepts an ArrayList<Vertex> and populates
     * this.vertices. If multiple Vertex objects have the same label,
     * then the last Vertex with the given label is used. 
     * 
     * @param vertices The initial Vertices to populate this Graph
     */
    public Graph(ArrayList<TileVertex> vertices){
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();
        
        for(TileVertex v: vertices){
            this.vertices.put(v.getIndex(), v);
        }       
    }
    
    /**
     * This method adds am edge between Vertices one and two
     * of weight 1, if no Edge between these Vertices already
     * exists in the Graph.
     * 
     * @param one The first vertex to add
     * @param two The second vertex to add
     * @return true if no Edge relating one and two exists in the Graph
     */
    public boolean addEdge(TileVertex one, TileVertex two){
        return addEdge(one, two, 1);
    }
    
    
    /**
     * Accepts two vertices and a weight, and adds the edge 
     * ({one, two}, weight) if no Edge relating one and two 
     * exists in the Graph.
     * 
     * @param one The first Vertex of the Edge
     * @param two The second Vertex of the Edge
     * @param weight The weight of the Edge
     * @return true if no Edge already exists in the Graph
     */
    public boolean addEdge(TileVertex one, TileVertex two, int weight){
        if(one.equals(two)){
            return false;   
        }       
        
        //Edge e = new Edge(one, two, weight);
        MapEdge e;
        
        switch(weight){
            case 1: e = new RoadEdge(one, two, weight);
            break;
            case 2: e = new RiverEdge(one, two, weight);
            break;
            case 3: e = new SeaEdge(one, two, weight);
            break;
            case 4: e = new ShoreEdge(one, two, weight);
            break;
            case 5: e = new PortEdge(one, two, weight);
            break;
            default: e = new RoadEdge(one, two, 1);
        }     
        
        //ensures the Edge is not in the Graph
        if(edges.containsKey(e.hashCode())){
            return false;
        }
       
        //and that the Edge isn't already incident to one of the vertices
        else if(one.containsNeighbor(e) || two.containsNeighbor(e)){
            return false;
        }
            
        edges.put(e.hashCode(), e);
        one.addNeighbor(e);
        two.addNeighbor(e);
        return true;
    }
    
    /**
     * 
     * @param e The Edge to look up
     * @return true if this Graph contains the Edge e
     */
    public boolean containsEdge(MapEdge e){
        if(e.getOne() == null || e.getTwo() == null){
            return false;
        }
        
        return this.edges.containsKey(e.hashCode());
    }
    
    /*public MapEdge getEdge(TileVertex one, TileVertex two)
    {
        Iterator i;
        i = edges.entrySet().iterator();
        
        for(;i.hasNext(); i.)
        {
            ;
        }
    }*/
    /**
     * This method removes the specified Edge from the Graph,
     * including as each Vertex's incidence neighborhood.
     * 
     * @param e The Edge to remove from the Graph
     * @return Edge The Edge removed from the Graph
     */
    public MapEdge removeEdge(MapEdge e){
       e.getOne().removeNeighbor(e);
       e.getTwo().removeNeighbor(e);
       return this.edges.remove(e.hashCode());
    }
    
    /**
     * 
     * @param vertex The Vertex to look up
     * @return true if this Graph contains vertex
     */
    public boolean containsVertex(TileVertex vertex){
        return this.vertices.get(vertex.getIndex()) != null;
    }
    
    /**
     * 
     * @param index The specified Vertex label
     * @return Vertex The Vertex with the specified label
     */
    public TileVertex getVertex(Integer index){
        return vertices.get(index);
    }
    
    /**
     * This method adds a Vertex to the graph. If a Vertex with the same label
     * as the parameter exists in the Graph, the existing Vertex is overwritten
     * only if overwriteExisting is true. If the existing Vertex is overwritten,
     * the Edges incident to it are all removed from the Graph.
     * 
     * @param vertex
     * @param overwriteExisting
     * @return true if vertex was added to the Graph
     */
    public boolean addVertex(TileVertex vertex, boolean overwriteExisting){
        TileVertex current = this.vertices.get(vertex.getIndex());
        if(current != null){
            if(!overwriteExisting){
                return false;
            }
            
            while(current.getNeighborCount() > 0){
                this.removeEdge(current.getNeighbor(0));
            }
        }
        
        
        vertices.put(vertex.getIndex(), vertex);
        return true;
    }
    
    /**
     * 
     * @param index The index of the Vertex to remove
     * @return Vertex The removed Vertex object
     */
    public TileVertex removeVertex(Integer index){
        TileVertex v = vertices.remove(index);
        
        while(v.getNeighborCount() > 0){
            this.removeEdge(v.getNeighbor((0)));
        }
        
        return v;
    }
    
    /**
     * 
     * @return Set<Integer> The unique labels of the Graph's Vertex objects
     */
    public Set<Integer> vertexKeys(){
        return this.vertices.keySet();
    }
    
    /**
     * 
     * @return Set<MapEdge> The Edges of this graph
     */
    public Set<MapEdge> getEdges(){
        return new HashSet<>(this.edges.values());
    }
    
}

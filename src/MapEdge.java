/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public abstract class MapEdge extends Edge {
    
    
    public MapEdge(Vertex one, Vertex two){
        super(one, two, 1);
    }
    
    public MapEdge(Vertex one, Vertex two, int weight){
        super(one, two, weight);
    }
    
    abstract public boolean equalsType(Edge other);   
    
}

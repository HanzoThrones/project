/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class RoadEdge extends MapEdge{
    
    private boolean blocked;
    
    public RoadEdge(Vertex one, Vertex two){
        super(one, two, 1);
        this.blocked = false;
    }
    
    public RoadEdge(Vertex one, Vertex two, int weight){
        super(one, two, weight);
        this.blocked = false;
    }
    
    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }
    
    public boolean getBlocked(){
        return this.blocked;
    }
    
    @Override
    public boolean equalsType(Edge other){
        return other instanceof RoadEdge;
    }
}

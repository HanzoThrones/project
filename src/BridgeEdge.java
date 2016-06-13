/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class BridgeEdge extends MapEdge {
    
     private boolean blocked;
     private boolean broken;
    
    public BridgeEdge(Vertex one, Vertex two){
        super(one, two, 1);
        this.blocked = false;
        this.broken = false;
    }
    
    public BridgeEdge(Vertex one, Vertex two, int weight){
        super(one, two, weight);
        this.blocked = false;
        this.broken = false;
    }
    
    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }
    
    public boolean getBlocked(){
        return this.blocked;
    }
    
    public void setBroken(boolean broken){
        this.broken = broken;
    }
    
    public boolean getBroken(){
        return this.broken;
    }
    
    @Override
    public boolean equalsType(Edge other){
        return other instanceof BridgeEdge;
    }
}

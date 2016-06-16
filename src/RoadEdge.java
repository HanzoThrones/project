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
    
    public RoadEdge(TileVertex one, TileVertex two){
        super(one, two, 1);
        this.blocked = false;
    }
    
    public RoadEdge(TileVertex one, TileVertex two, int weight){
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
    public boolean equalsType(MapEdge other){
        return other instanceof RoadEdge;
    }
    
    @Override
    public String toString(){
        return "\tRoad Edge: ({" + one + ", " + two + "}, " + weight + ")";
    }
}

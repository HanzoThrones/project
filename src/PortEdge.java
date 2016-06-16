/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class PortEdge extends MapEdge {
       
    public PortEdge(TileVertex one, TileVertex two){
        super(one, two, 1);
    }
    
    public PortEdge(TileVertex one, TileVertex two, int weight){
        super(one, two, weight);
    }
        
    @Override
    public boolean equalsType(MapEdge other){
        return other instanceof PortEdge;
    }
    
    @Override
    public String toString(){
        return "\tPort Edge: ({" + one + ", " + two + "}, " + weight + ")";
    }
}
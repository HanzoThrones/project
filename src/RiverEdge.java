/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class RiverEdge extends MapEdge{
    private boolean hasBridge;
    
    public RiverEdge(TileVertex one, TileVertex two){
        super(one, two, 1);
        this.hasBridge = false;
    }
    
    public RiverEdge(TileVertex one, TileVertex two, int weight){
        super(one, two, weight);
        this.hasBridge = weight == 6;        
    }
    
    public void setBridge(boolean hasBridge){
        this.hasBridge = hasBridge;
    }
    
    public boolean getBridge(){
        return this.hasBridge;
    }
    
    @Override
    public boolean equalsType(MapEdge other){
        return other instanceof RiverEdge;
    }
    
    @Override
    public String toString(){
        return "\tRiver Edge " + (hasBridge? "with bridge":"") +
                "({:" + one + ", " + two + "}, " + weight + ")";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class SeaEdge extends MapEdge {
    
    private boolean blockaded;
    
    public SeaEdge(TileVertex one, TileVertex two){
        super(one, two, 1);
        this.blockaded = false;
    }
    
    public SeaEdge(TileVertex one, TileVertex two, int weight){
        super(one, two, weight);
        this.blockaded = false;
    }
    
    public void setBlockaded(boolean blockaded){
        this.blockaded = blockaded;
    }
    
    public boolean getBlockaded(){
        return this.blockaded;
    }
    
    @Override
    public boolean equalsType(MapEdge other){
        return other instanceof SeaEdge;
    }
    
    @Override
    public String toString(){
        return "\tSea Edge: ({" + one + ", " + two + "}, " + weight + ")";
    }
}

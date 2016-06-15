/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public class ShoreEdge extends MapEdge{
    
   public ShoreEdge(TileVertex one, TileVertex two){
        super(one, two, 1);
    }
    
    public ShoreEdge(TileVertex one, TileVertex two, int weight){
        super(one, two, weight);
    }
    
    @Override
    public boolean equalsType(MapEdge other){
        return other instanceof ShoreEdge;
    }
}



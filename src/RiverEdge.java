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
    private boolean blockaded;
    
    public RiverEdge(Vertex one, Vertex two){
        super(one, two, 1);
    }
    
    public RiverEdge(Vertex one, Vertex two, int weight){
        super(one, two, weight);
    }
    
    public void setBlockaded(boolean blockaded){
        this.blockaded = blockaded;
    }
    
    public boolean getBlockaded(){
        return this.blockaded;
    }
    
    @Override
    public boolean equalsType(Edge other){
        return other instanceof RiverEdge;
    }
}

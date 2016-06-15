/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taylo
 */
public abstract class MapEdge implements Comparable<MapEdge> {
    
    private TileVertex one, two;
    private int weight;
    
    
    public MapEdge(TileVertex one, TileVertex two){
        this(one, two, 1);
    }
    
    public MapEdge(TileVertex one, TileVertex two, int weight){
        this.one = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two; //keeps a sort? Not sure this is preferable
        this.two = (this.one == one) ? two : one;
        this.weight = weight;
    }
    
       
    /**
     * 
     * @param current
     * @return The neighbor of current along this MapEdge
     */
    
    public TileVertex getNeighbor(TileVertex current){
        if(!(current.equals(one) || current.equals(two))){
            return null;
        }
        
        return (current.equals(one)) ? two : one;
    }
    
   /**
     * 
     * @return TileVertex this.one
     */
    public TileVertex getOne(){
        return this.one;
    }
    
    /**
     * 
     * @return TileVertex this.two
     */
    public TileVertex getTwo(){
        return this.two;
    }
    
     /**
     * 
     * @return int The weight of this Edge
     */
    public int getWeight(){
        return this.weight;
    }
    
     /**
     * 
     * @param weight The new weight of this Edge
     */
    public void setWeight(int weight){
        this.weight = weight;
    }
    
     /**
     * Note that the compareTo() method deviates from 
     * the specifications in the Comparable interface. A 
     * return value of 0 does not indicate that this.equals(other).
     * The equals() method checks the Vertex endpoints, while the 
     * compareTo() is used to compare Edge weights
     * 
     * @param other The Edge to compare against this
     * @return int this.weight - other.weight
     */
    @Override
    public int compareTo(MapEdge other){
        return this.weight - other.weight;
    }
    
    @Override
     public String toString(){
        return "({" + one + ", " + two + "}, " + weight + ")";
    }
     
    @Override
    public int hashCode(){
        return (one.getLabel() + two.getLabel()).hashCode(); 
    }
    
    @Override
     public boolean equals(Object other){
        if(!(other instanceof Edge)){
            return false;
        }
        
        MapEdge e = (MapEdge)other;
        
        return e.one.equals(this.one) && e.two.equals(this.two);
    }
     
    abstract public boolean equalsType(MapEdge other);   
    
}

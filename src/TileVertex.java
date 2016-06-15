
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public abstract class TileVertex{
    
    private ArrayList<MapEdge> neighborhood;
    protected String label;
    protected int index;
    private String control;
      
    public TileVertex(String label, int index, String control)
    {
        this.label = label;
        this.index = index;
        this.control = control;
        this.neighborhood = new ArrayList<>();
    }
    
    /**
     * This method adds an Edge to the incidence neighborhood of this graph if
     * the edge is not already present. 
     * 
     * @param edge The edge to add
     */
    public void addNeighbor(MapEdge edge){
        if(this.neighborhood.contains(edge)){
            return;
        }
        this.neighborhood.add(edge);
    }
    
     /**
     * 
     * @param other The edge for which to search
     * @return true iff other is contained in this.neighborhood
     */
    public boolean containsNeighbor(MapEdge other){
        return this.neighborhood.contains(other);
    }
    
      /**
     * 
     * @param index The index of the Edge to retrieve
     * @return Edge The Edge at the specified index in this.neighborhood
     */
    public MapEdge getNeighbor(int index){
        return this.neighborhood.get(index);
    }
    
    /**
     * 
     * @param index The index of the edge to remove from this.neighborhood
     * @return Edge The removed Edge
     */
    MapEdge removeNeighbor(int index){
        return this.neighborhood.remove(index);
    }
    
    /**
     * 
     * @param e The Edge to remove from this.neighborhood
     */
    public void removeNeighbor(MapEdge e){
        this.neighborhood.remove(e);
    }
    
    /**
     * 
     * @return int The number of neighbors of this Vertex
     */
    public int getNeighborCount(){
        return this.neighborhood.size();
    }
    
    /**
     * 
     * @return String The label of this Vertex
     */
    public String getLabel(){
        return this.label;
    }
    
     /**
     * 
     * @return int The index of this Vertex
     */
    public int getIndex(){
        return this.index;
    }
    
    /**
     * 
     * @return String A String representation of this Vertex
     */
    public String toString(){
        return "Vertex #" + index + ": " + label;
    }
    
    /**
     * 
     * @return The hash code of this Vertex's label
     */
    public int hashCode(){
        return this.label.hashCode();
    }
    
     /**
     * 
     * @param other The object to compare
     * @return true iff other instanceof Vertex and the two Vertex objects have the same label
     */
    @Override
    public boolean equals(Object other){
        if(!(other instanceof TileVertex)){
            return false;
        }
        TileVertex v = (TileVertex)other;
        return this.label.equals(v.label);
    }
    
    /**
     * 
     * @return ArrayList<Edge> A copy of this.neighborhood. Modifying the returned
     * ArrayList will not affect the neighborhood of this Vertex
     */
    public ArrayList<MapEdge> getNeighbors(){
        return new ArrayList<>(this.neighborhood);
    }
    
    public void setControl(String houseControl)
    {
        this.control = houseControl;
    }
    
    public String getControl()
    {
        return control;
    }
    
    abstract public boolean equalsType(TileVertex other);
}

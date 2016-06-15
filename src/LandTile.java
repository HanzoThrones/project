/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class LandTile extends TileVertex {
    
    private int building;
    private int crowns;
    private int supply;
    
    public LandTile(String label, int index, String control)
    {
        super(label, index, control);
        building = 0;
        crowns = 0;
        supply = 0;
    }
    
    public LandTile(String label, int index, String control, int building,
                    String houseControl, int crowns, int supply)
    {
        super(label, index, control);
        this.building = building;
        this.crowns = crowns;
        this.supply = supply;
    }
    
    public void setBuilding(int building)
    {
        this.building = building;
    }
    
    public int getBuilding()
    {
        return building;
    }
        
    public void setCrowns(int crowns)
    {
        this.crowns = crowns;
    }
    
    public int getCrowns()
    {
        return crowns;
    }
    
    public void setSupply(int supply)
    {
        this.supply = supply;
    }
    
    public int getSupply()
    {
        return supply;
    }
    
    @Override
    public boolean equalsType(TileVertex other){
        return other instanceof LandTile;
    }
    @Override
    public String toString(){
        return "Land Vertex #" + index + ": " + label;
    }
}

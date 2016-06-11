/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class TileData {
    
    private String name;
    private String building;
    private String biome;
    private String houseControl;
    private int crowns;
    private int supply;
    private boolean port;
    
    public TileData()
    {
        name = null;
        building = null;
        biome = null;
        houseControl = null;
        crowns = 0;
        supply = 0;
        port = false;
    }
    
    public TileData(String name, String building, String biome, String houseControl,
                    int crowns, int supply, boolean port)
    {
        this.name = name;
        this.building = building;
        this.biome = biome;
        this.houseControl = houseControl;
        this.crowns = crowns;
        this.supply = supply;
        this.port = port;
    }
  
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    public void setBuilding(String building)
    {
        this.building = building;
    }
    
    public String getBuilding()
    {
        return building;
    }
    
    public void setBiome(String biome)
    {
        this.biome = biome;
    }
    
    public String getBiome()
    {
        return biome;
    }
    
    public void setControl(String houseControl)
    {
        this.houseControl = houseControl;
    }
    
    public String getControl()
    {
        return houseControl;
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
    
    public void setPort(boolean port)
    {
        this.port = port;
    }
    
    public boolean getPort()
    {
        return port;
    }
}

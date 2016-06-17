/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */

        /*vertices[n] = new SeaTile("Bay of Ice", n, "None"); n++;                // 0
        vertices[n] = new LandTile("Castle Black", n, "None"); n++;             // 1
        vertices[n] = new SeaTile("The Shivering Sea", n, "None"); n++;         // 2
        vertices[n] = new LandTile("Winterfell", n, "Stark"); n++;              // 3
        vertices[n] = new PortTile("Winterfell Port", n, "Stark"); n++;         // 4
        vertices[n] = new LandTile("Karhold", n, "None"); n++;                  // 5
        vertices[n] = new LandTile("The Stony Shore", n, "None"); n++;          // 6
        vertices[n] = new LandTile("White Harbor", n, "None"); n++;             // 7
        vertices[n] = new PortTile("White Harbor Port", n, "None"); n++;        // 8
        vertices[n] = new LandTile("Widow's Watch", n, "None"); n++;            // 9
        vertices[n] = new SeaTile("Sunset Sea", n, "None"); n++;                // 10
        vertices[n] = new LandTile("Flint's Finger", n, "None"); n++;           // 11
        vertices[n] = new LandTile("Greywater Watch", n, "None"); n++;          // 12
        vertices[n] = new LandTile("Moat Calin", n, "None"); n++;               // 13
        vertices[n] = new SeaTile("The Narrow Sea", n, "None"); n++;            // 14
        vertices[n] = new SeaTile("Ironman's Bay", n, "None"); n++;             // 15
        vertices[n] = new LandTile("Pyke", n, "Greyjoy"); n++;                  // 16
        vertices[n] = new PortTile("Pyke Port", n, "Greyjoy"); n++;             // 17
        vertices[n] = new LandTile("Seagard", n, "None"); n++;                  // 18
        vertices[n] = new LandTile("The Twins", n, "None"); n++;                // 19
        vertices[n] = new LandTile("The Fingers", n, "None"); n++;              // 20
        vertices[n] = new LandTile("Riverrun", n, "None"); n++;                 // 21
        vertices[n] = new LandTile("The Mountains of The Moon", n, "None"); n++;// 22
        vertices[n] = new LandTile("The Eyrie", n, "None"); n++;                // 23
        vertices[n] = new SeaTile("The Golden Sound", n, "None"); n++;          // 24
        vertices[n] = new LandTile("Lannisport", n, "None"); n++;               // 25
        vertices[n] = new PortTile("Lannisport Port", n, "None"); n++;          // 26
        vertices[n] = new LandTile("Stoney Sept", n, "None"); n++;              // 27
        vertices[n] = new LandTile("Harrenhal", n, "None"); n++;                // 28
        vertices[n] = new LandTile("Cracklaw Point", n, "None"); n++;           // 29
        vertices[n] = new SeaTile("Shipbreaker Bay", n, "None"); n++;           // 30
        vertices[n] = new LandTile("SeaRoad Marches", n, "None"); n++;          // 31
        vertices[n] = new LandTile("Blackwater", n, "None"); n++;               // 32
        vertices[n] = new LandTile("King's Landing", n, "None"); n++;           // 33
        vertices[n] = new SeaTile("Blackwater Bay", n, "None"); n++;            // 34
        vertices[n] = new LandTile("Dragonstone", n, "Baratheon"); n++;         // 35
        vertices[n] = new PortTile("Dragonstone Port", n, "Baratheon"); n++;    // 36
        vertices[n] = new SeaTile("West Summer Sea", n, "None"); n++;           // 37
        vertices[n] = new SeaTile("Redwyne Straights", n, "None"); n++;         // 38
        vertices[n] = new LandTile("Highgarden", n, "Tyrell"); n++;              // 39
        vertices[n] = new LandTile("The Reach", n, "None"); n++;                // 40
        vertices[n] = new LandTile("Kingswood", n, "None"); n++;                // 41
        vertices[n] = new LandTile("OldTown", n, "None"); n++;                  // 42
        vertices[n] = new PortTile("OldTown Port", n, "None"); n++;             // 43
        vertices[n] = new LandTile("Dornish Marches", n, "None"); n++;          // 44
        vertices[n] = new LandTile("The Boneway", n, "None"); n++;              // 45
        vertices[n] = new LandTile("Storms End", n, "None"); n++;               // 46
        vertices[n] = new PortTile("Storms End Port", n, "None"); n++;          // 47
        vertices[n] = new LandTile("Three Towers", n, "None"); n++;             // 48
        vertices[n] = new LandTile("Prince's Pass", n, "None"); n++;            // 49
        vertices[n] = new SeaTile("Sea of Dorne", n, "None"); n++;              // 50
        vertices[n] = new LandTile("The Arbor", n, "None"); n++;                // 51
        vertices[n] = new LandTile("Starfall", n, "None"); n++;                 // 52
        vertices[n] = new LandTile("Yronwood", n, "None"); n++;                 // 53
        vertices[n] = new LandTile("Sunspear", n, "Dorne"); n++;                // 54
        vertices[n] = new PortTile("Sunspear Port", n, "Dorne"); n++;           // 55
        vertices[n] = new LandTile("Salt Shore", n, "None"); n++;               // 56
        vertices[n] = new SeaTile("East Summer Sea", n, "None");                // 57
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

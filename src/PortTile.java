/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class PortTile extends TileVertex{

    public PortTile(String label, int index, String control) {
        super(label, index, control);
    }

    @Override
    public boolean equalsType(Vertex other) {
        return other instanceof LandTile;
    }
    
    @Override
    public String toString(){
        return "Port Vertex #" + index + ": " + label;
    }
}

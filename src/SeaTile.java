/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class SeaTile extends TileVertex{

    public SeaTile(String label, int index, String control) {
        super(label, index, control);
    }

    @Override
    public boolean equalsType(TileVertex other){
        return other instanceof SeaTile;
    }
    
    @Override
    public String toString(){
        return "Sea Vertex #" + index + ": " + label;
    }
}

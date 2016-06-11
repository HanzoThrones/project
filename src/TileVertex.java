/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public abstract class TileVertex extends Vertex{

    private String control;
      
    public TileVertex(String label, int index, String control)
    {
        super(label, index);
        this.control = control;
    }
    
    public void setControl(String houseControl)
    {
        this.control = houseControl;
    }
    
    public String getControl()
    {
        return control;
    }
    
    abstract public boolean equalsType(Vertex other);
}

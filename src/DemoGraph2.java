/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph2 {
    
    public static void main(String[] args){
        
        Graph graph = new Graph();
        
        final int SIZE = 10;
        
        //initialize some vertices and add them to the graph
        Vertex[] vertices = new Vertex[SIZE];       
        
        vertices[0] = new SeaTile("Bay of Ice", 1, "None");
        vertices[1] = new LandTile("Castle Black", 2, "None");
        vertices[2] = new SeaTile("The Shivering Sea", 3, "None");
        vertices[3] = new LandTile("Winterfell", 4, "Stark");
        vertices[4] = new PortTile("Winterfell Port", 5, "Stark");
        vertices[5] = new LandTile("Karhold", 6, "None");
        vertices[6] = new LandTile("The Stony Shore", 7, "None");
        vertices[7] = new LandTile("White Harbor", 8, "None");
        vertices[8] = new PortTile("White Harbor Port", 9, "None");
        vertices[9] = new LandTile("Widow's Watch", 10, "None");
        vertices[10] = new SeaTile("The Shivering Sea", 11, "None");
        vertices[11] = new LandTile("Flint's Finger", 12, "None");
        vertices[12] = new LandTile("Greywater Watch", 13, "None");
        vertices[13] = new LandTile("Moat Calin", 14, "None");
        vertices[14] = new SeaTile("The Narrow Sea", 15, "None");
        vertices[15] = new SeaTile("Ironman's Bay", 16, "None");
        vertices[16] = new LandTile("Pyke", 17, "Greyjoy");
        vertices[17] = new PortTile("Pyke Port", 18, "Greyjoy");
        vertices[18] = new LandTile("Seagard", 19, "None");
        vertices[19] = new LandTile("The Twins", 20, "None");
        vertices[20] = new LandTile("The Fingers", 21, "None");
        vertices[21] = new LandTile("Riverrun", 22, "None");
        vertices[22] = new LandTile("The Mountains of The Moon", 23, "None");
        vertices[23] = new LandTile("The Eyrie", 24, "None");
        vertices[24] = new SeaTile("The Golden Sound", 25, "None");
        vertices[25] = new LandTile("Lannisport", 26, "None");
        vertices[26] = new PortTile("Lannisport Port", 27, "None");
        
        for(int i = 0; i < SIZE; i++){
            graph.addVertex(vertices[i], true);
        }
        
        graph.addEdge(vertices[0], vertices[1]);
        graph.addEdge(vertices[0], vertices[3]);
        graph.addEdge(vertices[0], vertices[4]);
        graph.addEdge(vertices[0], vertices[6]);
        
        graph.addEdge(vertices[1], vertices[2]);
        graph.addEdge(vertices[1], vertices[3]);
        graph.addEdge(vertices[1], vertices[5]);
        
        graph.addEdge(vertices[2], vertices[5]);
        graph.addEdge(vertices[2], vertices[3]);
        graph.addEdge(vertices[2], vertices[5]);
        graph.addEdge(vertices[2], vertices[8]);
        graph.addEdge(vertices[2], vertices[9]);
        
        graph.addEdge(vertices[3], vertices[4]);
        graph.addEdge(vertices[3], vertices[6]);
        graph.addEdge(vertices[3], vertices[7]);
        
        
        
        //display the initial setup- all vertices adjacent to each other
        for (Vertex vertice : vertices) {
            System.out.println(vertice);
            for (int j = 0; j < vertice.getNeighborCount(); j++) {
                System.out.println(vertice.getNeighbor(j));
            }
            System.out.println();
        }
    }
}

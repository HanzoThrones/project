/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph2 {
    
    public static void main(String[] args){
        
        Graph graph = new Graph();
        
        final int SIZE = 58;
        
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
        vertices[11] = new SeaTile("Sunset Sea", 12, "None");
        vertices[12] = new LandTile("Flint's Finger", 13, "None");
        vertices[13] = new LandTile("Greywater Watch", 14, "None");
        vertices[14] = new LandTile("Moat Calin", 15, "None");
        vertices[15] = new SeaTile("The Narrow Sea", 16, "None");
        vertices[16] = new SeaTile("Ironman's Bay", 17, "None");
        vertices[17] = new LandTile("Pyke", 18, "Greyjoy");
        vertices[18] = new PortTile("Pyke Port", 19, "Greyjoy");
        vertices[19] = new LandTile("Seagard", 20, "None");
        vertices[20] = new LandTile("The Twins", 21, "None");
        vertices[21] = new LandTile("The Fingers", 22, "None");
        vertices[22] = new LandTile("Riverrun", 23, "None");
        vertices[23] = new LandTile("The Mountains of The Moon", 24, "None");
        vertices[24] = new LandTile("The Eyrie", 25, "None");
        vertices[25] = new SeaTile("The Golden Sound", 26, "None");
        vertices[26] = new LandTile("Lannisport", 27, "None");
        vertices[27] = new PortTile("Lannisport Port", 28, "None");
        vertices[28] = new LandTile("Stoney Sept", 29, "None");
        vertices[29] = new LandTile("Harrenhal", 30, "None");
        vertices[30] = new LandTile("Cracklaw Point", 31, "None");
        vertices[31] = new SeaTile("Shipbreaker Bay", 32, "None");
        vertices[32] = new LandTile("Searoad Marches", 33, "None");
        vertices[33] = new LandTile("Blackwater", 34, "None");
        vertices[34] = new LandTile("King's Landing", 35, "None");
        vertices[35] = new SeaTile("Blackwater Bay", 36, "None");
        vertices[36] = new LandTile("Dragonstone", 37, "Baratheon");
        vertices[37] = new PortTile("Dragonstone Port", 38, "Baratheon");
        vertices[38] = new SeaTile("West Summer Sea", 39, "None");
        vertices[39] = new SeaTile("Redwyne Straights", 40, "None");
        vertices[40] = new LandTile("Highgarden", 41, "Tyrel");
        vertices[41] = new LandTile("The Reach", 42, "None");
        vertices[42] = new LandTile("Kingswood", 43, "None");
        vertices[43] = new LandTile("Oldtown", 44, "None");
        vertices[44] = new PortTile("Oldtown Port", 45, "None");
        vertices[45] = new LandTile("Dornish Marches", 46, "None");
        vertices[46] = new LandTile("The Boneway", 47, "None");
        vertices[47] = new LandTile("Storms End", 48, "None");
        vertices[48] = new PortTile("Storms End Port", 49, "None");
        vertices[49] = new LandTile("Three Towers", 50, "None");
        vertices[50] = new LandTile("Prince's Pass", 51, "None");
        vertices[51] = new SeaTile("Sea of Dorne", 52, "None");
        vertices[52] = new LandTile("The Arbor", 53, "None");
        vertices[53] = new LandTile("Starfall", 54, "None");
        vertices[54] = new LandTile("Yronwood", 55, "None");
        vertices[55] = new LandTile("Sunspear", 55, "Dorne");
        vertices[56] = new PortTile("Sunspear Port", 56, "Dorne");
        vertices[56] = new LandTile("Salt Shore", 57, "None");
        vertices[57] = new SeaTile("East Summer Sea", 58, "None");
        
        
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

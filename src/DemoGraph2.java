/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph2 {
                   
    public static void main(String[] args){
        
        final int ROAD = 1;
        final int RIVER = 2;
        final int SEA = 3;
        final int SHORE = 4;
        final int PORT = 5;
        
        Graph graph = new Graph();
        
        final int SIZE = 58;
        int n = 0;
        
        //initialize some vertices and add them to the graph
        TileVertex[] vertices = new TileVertex[SIZE];       
        
        vertices[n] = new SeaTile("Bay of Ice", n, "None"); n++;                // 0
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
               
        for(int i = 0; i < SIZE; i++){
            graph.addVertex(vertices[i], true);
        }
        
        graph.addEdge(vertices[0], vertices[1], SHORE);
        graph.addEdge(vertices[0], vertices[3], SHORE);
        graph.addEdge(vertices[0], vertices[4], SEA);
        graph.addEdge(vertices[0], vertices[6], SHORE);
        graph.addEdge(vertices[0], vertices[10], SEA);
        graph.addEdge(vertices[0], vertices[6], SHORE);
        graph.addEdge(vertices[0], vertices[11], SHORE);
        graph.addEdge(vertices[0], vertices[12], SHORE); 
        
        graph.addEdge(vertices[1], vertices[2], SHORE);
        graph.addEdge(vertices[1], vertices[3], ROAD);
        graph.addEdge(vertices[1], vertices[5], ROAD);
        
        graph.addEdge(vertices[2], vertices[5], SHORE);
        graph.addEdge(vertices[2], vertices[3], SHORE);
        graph.addEdge(vertices[2], vertices[7], SHORE);
        graph.addEdge(vertices[2], vertices[9], SHORE);
        graph.addEdge(vertices[2], vertices[14], SEA);
        
        graph.addEdge(vertices[3], vertices[4], PORT);
        graph.addEdge(vertices[3], vertices[5], ROAD);
        graph.addEdge(vertices[3], vertices[6], ROAD);
        graph.addEdge(vertices[3], vertices[7], ROAD);
        graph.addEdge(vertices[3], vertices[12], RIVER); 
        graph.addEdge(vertices[3], vertices[13], ROAD);
        
        graph.addEdge(vertices[7], vertices[8], PORT);
        graph.addEdge(vertices[7], vertices[9], ROAD);
        graph.addEdge(vertices[7], vertices[13], ROAD);
        graph.addEdge(vertices[7], vertices[14], SHORE);
        
        graph.addEdge(vertices[8], vertices[14], SEA);
        
        graph.addEdge(vertices[9], vertices[14], SHORE);
        
        graph.addEdge(vertices[10], vertices[11], SHORE);
        graph.addEdge(vertices[10], vertices[15], SEA);
        graph.addEdge(vertices[10], vertices[24], SEA);
        graph.addEdge(vertices[10], vertices[31], SHORE);
        
        graph.addEdge(vertices[11], vertices[12], ROAD);
        graph.addEdge(vertices[11], vertices[12], ROAD);
        graph.addEdge(vertices[11], vertices[15], SHORE);
        
        graph.addEdge(vertices[12], vertices[13], ROAD);
        graph.addEdge(vertices[12], vertices[15], SHORE);
        graph.addEdge(vertices[12], vertices[18], ROAD);
        
        graph.addEdge(vertices[13], vertices[14], SHORE);
        graph.addEdge(vertices[13], vertices[18], ROAD);
        graph.addEdge(vertices[13], vertices[19], ROAD);
        
        graph.addEdge(vertices[14], vertices[19], SHORE);
        graph.addEdge(vertices[14], vertices[20], SHORE);
        graph.addEdge(vertices[14], vertices[22], SHORE);
        graph.addEdge(vertices[14], vertices[23], SHORE);
        graph.addEdge(vertices[14], vertices[29], SHORE);
        graph.addEdge(vertices[14], vertices[30], SEA);
        
        graph.addEdge(vertices[15], vertices[16], SHORE);
        graph.addEdge(vertices[15], vertices[17], SEA);
        graph.addEdge(vertices[15], vertices[18], SHORE);
        graph.addEdge(vertices[15], vertices[21], SHORE);
        graph.addEdge(vertices[15], vertices[24], SEA);
        
        graph.addEdge(vertices[16], vertices[17], PORT);
        
        graph.addEdge(vertices[18], vertices[19], RIVER);
        RiverEdge edge = (RiverEdge)(vertices[18].getNeighbor(3));
        edge.setBridge(true);
        graph.addEdge(vertices[18], vertices[21], ROAD);
        
        graph.addEdge(vertices[19], vertices[20], ROAD);
        graph.addEdge(vertices[19], vertices[22], ROAD);
        
        graph.addEdge(vertices[20], vertices[22], ROAD);
        
        graph.addEdge(vertices[21], vertices[24], SHORE);
        graph.addEdge(vertices[21], vertices[25], ROAD);
        graph.addEdge(vertices[21], vertices[22], RIVER);
        graph.addEdge(vertices[21], vertices[27], ROAD);
        graph.addEdge(vertices[21], vertices[28], ROAD);
        
        graph.addEdge(vertices[22], vertices[23], ROAD);
        graph.addEdge(vertices[22], vertices[28], RIVER);
        graph.addEdge(vertices[22], vertices[29], RIVER);
        edge = (RiverEdge)(vertices[22].getNeighbor(6));
        edge.setBridge(true);
        
        graph.addEdge(vertices[24], vertices[25], SHORE);
        graph.addEdge(vertices[24], vertices[26], SEA);
        graph.addEdge(vertices[24], vertices[31], SHORE);
        
        graph.addEdge(vertices[25], vertices[26], PORT);
        graph.addEdge(vertices[25], vertices[27], ROAD);
        graph.addEdge(vertices[25], vertices[31], ROAD);
        
        graph.addEdge(vertices[27], vertices[28], ROAD);
        graph.addEdge(vertices[27], vertices[31], ROAD);
        graph.addEdge(vertices[27], vertices[32], ROAD);
        
        graph.addEdge(vertices[28], vertices[29], ROAD);
        graph.addEdge(vertices[28], vertices[32], ROAD);
        
        graph.addEdge(vertices[29], vertices[30], SHORE);
        graph.addEdge(vertices[29], vertices[32], ROAD);
        graph.addEdge(vertices[29], vertices[33], ROAD);
        graph.addEdge(vertices[29], vertices[34], SHORE);
        
        graph.addEdge(vertices[30], vertices[35], SHORE);
        graph.addEdge(vertices[30], vertices[36], SEA);
        graph.addEdge(vertices[30], vertices[34], SEA);
        graph.addEdge(vertices[30], vertices[41], SHORE);
        graph.addEdge(vertices[30], vertices[46], SHORE);
        graph.addEdge(vertices[30], vertices[47], SEA);
        graph.addEdge(vertices[30], vertices[57], SEA);
        
        graph.addEdge(vertices[31], vertices[32], ROAD);
        graph.addEdge(vertices[31], vertices[37], SHORE);
        graph.addEdge(vertices[31], vertices[39], ROAD);
        graph.addEdge(vertices[31], vertices[40], ROAD);
        
        graph.addEdge(vertices[32], vertices[33], ROAD);
        graph.addEdge(vertices[32], vertices[40], ROAD);
        
        graph.addEdge(vertices[33], vertices[34], SHORE);
        graph.addEdge(vertices[33], vertices[40], ROAD);
        graph.addEdge(vertices[33], vertices[41], ROAD);
        
        graph.addEdge(vertices[34], vertices[41], SHORE);
        
        graph.addEdge(vertices[35], vertices[36], PORT);
        
        graph.addEdge(vertices[37], vertices[39], SHORE);
        graph.addEdge(vertices[37], vertices[38], SEA);
        graph.addEdge(vertices[37], vertices[51], SHORE);
        graph.addEdge(vertices[37], vertices[48], SHORE);
        graph.addEdge(vertices[37], vertices[52], SHORE);
        graph.addEdge(vertices[37], vertices[57], SEA);
        
        graph.addEdge(vertices[38], vertices[39], SHORE);
        graph.addEdge(vertices[38], vertices[42], SHORE);
        graph.addEdge(vertices[38], vertices[43], SEA);
        graph.addEdge(vertices[38], vertices[48], SHORE);
        graph.addEdge(vertices[38], vertices[51], SHORE);
        
        graph.addEdge(vertices[39], vertices[40], ROAD);
        graph.addEdge(vertices[39], vertices[42], ROAD);
        graph.addEdge(vertices[39], vertices[44], ROAD);
        
        graph.addEdge(vertices[40], vertices[41], ROAD);
        graph.addEdge(vertices[40], vertices[44], ROAD);
        graph.addEdge(vertices[40], vertices[45], ROAD);
        
        graph.addEdge(vertices[41], vertices[45], ROAD);
        graph.addEdge(vertices[41], vertices[46], ROAD);
        
        graph.addEdge(vertices[42], vertices[43], PORT);
        graph.addEdge(vertices[42], vertices[44], ROAD);
        graph.addEdge(vertices[42], vertices[48], ROAD);
        
        graph.addEdge(vertices[44], vertices[45], ROAD);
        graph.addEdge(vertices[44], vertices[48], ROAD);
        graph.addEdge(vertices[44], vertices[49], ROAD);
        
        graph.addEdge(vertices[45], vertices[46], ROAD);
        graph.addEdge(vertices[45], vertices[49], ROAD);
        graph.addEdge(vertices[45], vertices[50], SHORE);
        graph.addEdge(vertices[45], vertices[53], ROAD);
        
        graph.addEdge(vertices[46], vertices[47], PORT);
        graph.addEdge(vertices[46], vertices[50], SHORE);
        graph.addEdge(vertices[46], vertices[57], SHORE);
        
        graph.addEdge(vertices[48], vertices[49], ROAD);
        graph.addEdge(vertices[48], vertices[52], RIVER);
        
        graph.addEdge(vertices[49], vertices[52], ROAD);
        graph.addEdge(vertices[49], vertices[53], ROAD);
        
        graph.addEdge(vertices[50], vertices[53], SHORE);
        graph.addEdge(vertices[50], vertices[54], SHORE);
        graph.addEdge(vertices[50], vertices[57], SEA);
        
        graph.addEdge(vertices[52], vertices[53], ROAD);
        graph.addEdge(vertices[52], vertices[56], ROAD);
        graph.addEdge(vertices[52], vertices[57], SHORE);
        
        graph.addEdge(vertices[53], vertices[54], ROAD);
        graph.addEdge(vertices[53], vertices[56], ROAD);
        
        graph.addEdge(vertices[54], vertices[55], PORT);
        graph.addEdge(vertices[54], vertices[56], ROAD);
        graph.addEdge(vertices[54], vertices[57], SHORE);
        
        graph.addEdge(vertices[55], vertices[57], SEA);
        
        graph.addEdge(vertices[56], vertices[57], SHORE);
        
        TileVertex vertex;
        //display the initial setup- all vertices adjacent to each other
        for (int i = 0; i < SIZE; i++) {
            vertex = graph.getVertex(i);
            System.out.println(vertex);
            for (int j = 0; j < vertex.getNeighborCount(); j++) {
                System.out.println(vertex.getNeighbor(j));
            }
            System.out.println();
        }
    }
}

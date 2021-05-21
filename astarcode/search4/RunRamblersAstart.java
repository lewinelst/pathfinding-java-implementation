package search4;
public class RunRamblersAstart {

    public static void main(String[] arg){
        //Current Search is using Eucledian, changing the heuristic needs to be done in RamblersState in the get successors function. The list of heuristics are in the terrain map. Change the map.eucledianEst part.
        //General Tests
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 8), new Coords(7, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(15, 15), new Coords(0, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(15, 0), new Coords(0, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 15), new Coords(0, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(13, 13), new Coords(2, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 2), new Coords(13, 13));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 1), new Coords(0, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(8, 8), new Coords(0, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(9, 7), new Coords(3, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(15, 15), new Coords(7, 7));

        //In Depth Tests
        /* 
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 0), new Coords(15, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 1), new Coords(15, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 2), new Coords(15, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 3), new Coords(15, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 4), new Coords(15, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 5), new Coords(15, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 6), new Coords(15, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 7), new Coords(15, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 8), new Coords(15, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 9), new Coords(15, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(0, 10), new Coords(15, 10));

        
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 0), new Coords(14, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 1), new Coords(14, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 2), new Coords(14, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 3), new Coords(14, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 4), new Coords(14, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 5), new Coords(14, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 6), new Coords(14, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 7), new Coords(14, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 8), new Coords(14, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 9), new Coords(14, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(1, 10), new Coords(14, 10));

        
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 0), new Coords(13, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 1), new Coords(13, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 2), new Coords(13, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 3), new Coords(13, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 4), new Coords(13, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 5), new Coords(13, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 6), new Coords(13, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 7), new Coords(13, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 8), new Coords(13, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 9), new Coords(13, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(2, 10), new Coords(13, 10));

        
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 0), new Coords(12, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 1), new Coords(12, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 2), new Coords(12, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 3), new Coords(12, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 4), new Coords(12, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 5), new Coords(12, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 6), new Coords(12, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 7), new Coords(12, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 8), new Coords(12, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 9), new Coords(12, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(3, 10), new Coords(12, 10));

        
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 0), new Coords(11, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 1), new Coords(11, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 2), new Coords(11, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 3), new Coords(11, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 4), new Coords(11, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 5), new Coords(11, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 6), new Coords(11, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 7), new Coords(11, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 8), new Coords(11, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 9), new Coords(11, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(4, 10), new Coords(11, 10));

        
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 0), new Coords(10, 0));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 1), new Coords(10, 1));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 2), new Coords(10, 2));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 3), new Coords(10, 3));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 4), new Coords(10, 4));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 5), new Coords(10, 5));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 6), new Coords(10, 6));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 7), new Coords(10, 7));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 8), new Coords(10, 8));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 9), new Coords(10, 9));
        aStarTest(new TerrainMap("astarcode/search4/tmc.pgm"), new Coords(5, 10), new Coords(10, 10));

        //These tests take a long time
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(80, 50), new Coords(70, 0));
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(90, 70), new Coords(30, 50));
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(10, 10), new Coords(0, 0));
        */

    }

    public static void aStarTest(TerrainMap map, Coords goal, Coords start){
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(start.gety(), start.getx()), tmap[start.gety()][start.getx()], 0);
        String output = search.runSearch(startState, "AStar");
    }
    
}

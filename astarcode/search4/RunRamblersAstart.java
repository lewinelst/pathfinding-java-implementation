package search4;
public class RunRamblersAstart {

    public static void main(String[] arg){
        //Current Search is using Eucledian, changing the heuristic needs to be done in RamblersState in the get successors function. The list of heuristics are in the terrain map. Change the map.eucledianEst part.
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

        //These tests take a long time
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(80, 50), new Coords(70, 0));
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(90, 70), new Coords(30, 50));
        //aStarTest(new TerrainMap("astarcode/search4/diablo.pgm"), new Coords(10, 10), new Coords(0, 0));

    }

    public static void aStarTest(TerrainMap map, Coords goal, Coords start){
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(start.gety(), start.getx()), tmap[start.gety()][start.getx()], 0);
        String output = search.runSearch(startState, "AStar");
    }
    
}

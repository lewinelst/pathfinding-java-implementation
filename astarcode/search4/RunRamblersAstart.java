package search4;
public class RunRamblersAstart {

    public static void main(String[] arg){
        TerrainMap map = new TerrainMap("astarcode/search4/tmc.pgm");
        Coords goal = new Coords(5, 8);
    
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(7, 0), tmap[7][0], 0);
        String output = search.runSearch(startState, "AStar");

    }
    
}

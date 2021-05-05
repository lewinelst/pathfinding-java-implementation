public class RunMapSearch {
    public static void main(String[] args){
        TerrainMap map = new TerrainMap("search3/tmc.pgm");
        Coords goal = new Coords(5, 8);
    
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(0, 7), tmap[0][7]);
        String output = search.runSearch(startState, "breadthFirst");
        System.out.println(output);
    }
}

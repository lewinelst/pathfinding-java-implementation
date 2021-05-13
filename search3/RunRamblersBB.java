public class RunRamblersBB {
    public static void main(String[] args){
        TerrainMap map = new TerrainMap("search3/tmc.pgm");
        Coords goal = new Coords(5, 8);
    
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(7, 0), tmap[7][0]);
        String output = search.runSearch(startState, "breadthFirst");
        System.out.println(output);
    }
}

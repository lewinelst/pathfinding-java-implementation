public class RunRamblersBB {
    public static void main(String[] args){
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 8), new Coords(7, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), new Coords(15, 15));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), new Coords(15, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), new Coords(0, 15));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 2), new Coords(13, 13));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(13, 13), new Coords(2, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), new Coords(1, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 2), new Coords(8, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 5), new Coords(9, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(7, 7), new Coords(15, 15));

        //These tests take a long time
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(70, 0), new Coords(50, 80));
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(30, 50), new Coords(90, 70));
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(0, 0), new Coords(10, 10));
    }

    public static void bFTest(TerrainMap map, Coords goal, Coords start){
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(start.gety(), start.getx()), tmap[start.gety()][start.getx()]);
        String output = search.runSearch(startState, "breadthFirst");
        System.out.println(output);
    }
    
}

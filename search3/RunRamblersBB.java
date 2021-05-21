public class RunRamblersBB {
    public static void main(String[] args){
        // General Tests
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

        // In Depth Tests
        /* 
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), new Coords(15, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 1), new Coords(15, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 2), new Coords(15, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 3), new Coords(15, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 4), new Coords(15, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 5), new Coords(15, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 6), new Coords(15, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 7), new Coords(15, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 8), new Coords(15, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 9), new Coords(15, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(0, 10), new Coords(15, 10));

        
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 0), new Coords(14, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 1), new Coords(14, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 2), new Coords(14, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 3), new Coords(14, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 4), new Coords(14, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 5), new Coords(14, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 6), new Coords(14, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 7), new Coords(14, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 8), new Coords(14, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 9), new Coords(14, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(1, 10), new Coords(14, 10));

        
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 0), new Coords(13, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 1), new Coords(13, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 2), new Coords(13, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 3), new Coords(13, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 4), new Coords(13, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 5), new Coords(13, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 6), new Coords(13, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 7), new Coords(13, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 8), new Coords(13, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 9), new Coords(13, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(2, 10), new Coords(13, 10));

        
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 0), new Coords(12, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 1), new Coords(12, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 2), new Coords(12, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 3), new Coords(12, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 4), new Coords(12, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 5), new Coords(12, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 6), new Coords(12, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 7), new Coords(12, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 8), new Coords(12, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 9), new Coords(12, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(3, 10), new Coords(12, 10));

        
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 0), new Coords(11, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 1), new Coords(11, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 2), new Coords(11, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 3), new Coords(11, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 4), new Coords(11, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 5), new Coords(11, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 6), new Coords(11, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 7), new Coords(11, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 8), new Coords(11, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 9), new Coords(11, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(4, 10), new Coords(11, 10));

        
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 0), new Coords(10, 0));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 1), new Coords(10, 1));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 2), new Coords(10, 2));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 3), new Coords(10, 3));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 4), new Coords(10, 4));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 5), new Coords(10, 5));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 6), new Coords(10, 6));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 7), new Coords(10, 7));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 8), new Coords(10, 8));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 9), new Coords(10, 9));
        bFTest(new TerrainMap("search3/tmc.pgm"), new Coords(5, 10), new Coords(10, 10));
        



        //These tests take a long time
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(70, 0), new Coords(50, 80));
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(30, 50), new Coords(90, 70));
        //bFTest(new TerrainMap("search3/diablo.pgm"), new Coords(0, 0), new Coords(10, 10));
        */
    }

    public static void bFTest(TerrainMap map, Coords goal, Coords start){
        int tmap[][] = map.getTmap();
    
        RamblersSearch search = new RamblersSearch(map, goal);
        SearchState startState = (SearchState) new RamblersState(new Coords(start.gety(), start.getx()), tmap[start.gety()][start.getx()]);
        String output = search.runSearch(startState, "breadthFirst");
        System.out.println(output);
    }
    
}

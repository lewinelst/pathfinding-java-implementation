public class RunMapSearch {
    TerrainMap map = new TerrainMap("tmc.pgm");
    Coords goal = new Coords(8, 5);

    RamblersSearch search = new RamblersSearch(map, goal);
}

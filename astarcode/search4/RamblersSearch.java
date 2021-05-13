package search4;
public class RamblersSearch extends Search{
    private TerrainMap map;
    private Coords goal;
    public RamblersSearch(TerrainMap m, Coords g){
        map = m;
        goal = g;
    }

    public TerrainMap returnMap(){
        return map;
    }

    public Coords returnGoal(){
        return goal;
    }
}

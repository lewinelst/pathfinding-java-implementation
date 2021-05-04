public class RamblersSearch extends Search{

    private TerrainMap map;
    private Coords goal;
    public RamblersSearch(TerrainMap m, int goalX, int goalY){
        map = m;
        goal = new Coords(goalY, goalX);
    }

    public TerrainMap returnMap(){
        return map;
    }

    public Coords returnGoal(){
        return goal;
    }
    
}

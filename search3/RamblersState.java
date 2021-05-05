import java.util.ArrayList;

public class RamblersState extends SearchState{
    private Coords stateCoord;

    //constructor
    public RamblersState(Coords coord, int lc){
        stateCoord = coord;
        localCost = lc;
    }

    public Coords getCoords() { // returns coordinates
        return stateCoord;
    }

    public boolean goalPredicate(Search searcher){ // Checks if current state is the goal
        RamblersSearch ramSearcher = (RamblersSearch) searcher;
        Coords goal = ramSearcher.returnGoal();
        if ((goal.getx() == stateCoord.getx()) && (goal.gety() == stateCoord.gety())){
            return true;
        } else {
            return false;
        }
    }

    public boolean sameState(SearchState stateTwo){
        RamblersState ramblersStateTwo = (RamblersState)stateTwo;
        if ((this.getLocalCost() == stateTwo.getLocalCost() && (this.stateCoord.getx() == ramblersStateTwo.getCoords().getx()) && (this.stateCoord.gety() == ramblersStateTwo.getCoords().gety()))){
            return true;
        } else {
            return false;
        }
    }

    //getSuccessors 
    public ArrayList<SearchState> getSuccessors(Search searcher){
        RamblersSearch ramSearcher = (RamblersSearch) searcher;
        TerrainMap map = ramSearcher.returnMap();
        ArrayList<SearchState> successors = new ArrayList<SearchState>();
        int x = stateCoord.getx();
        int y = stateCoord.gety();
        int tmap[][] = map.getTmap();
        //North
        if((y - 1) >= 0){
            Coords newCoordinates = new Coords(y - 1, x);
            RamblersState newSuccessor = new RamblersState(newCoordinates, tmap[newCoordinates.gety()][newCoordinates.getx()]);
            successors.add(newSuccessor);
        }
        //East
        if((x + 1) <= map.getWidth()){
            Coords newCoordinates = new Coords(y, x + 1);
            RamblersState newSuccessor = new RamblersState(newCoordinates, tmap[newCoordinates.gety()][newCoordinates.getx()]);
            successors.add(newSuccessor);
        }

        //South
        if((y + 1) <= map.getHeight()){
            Coords newCoordinates = new Coords(y + 1, x);
            RamblersState newSuccessor = new RamblersState(newCoordinates, tmap[newCoordinates.gety()][newCoordinates.getx()]);
            successors.add(newSuccessor);
        }

        //West
        if((x - 1) >= 0){
            Coords newCoordinates = new Coords(y, x - 1);
            RamblersState newSuccessor = new RamblersState(newCoordinates, tmap[newCoordinates.gety()][newCoordinates.getx()]);
            successors.add(newSuccessor);
        }

        return successors;
    }

    public String toString(){
        return ("Ramblers State: " + "(" + stateCoord.getx() + "," + stateCoord.gety() + ")");
    }




}

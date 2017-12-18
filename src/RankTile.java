public class RankTile extends Tile {
    protected int rank;

    public RankTile(int rank)
    {
        this.rank = rank;
    }
    public boolean matches(Tile other){
        if(this == other){
            return true;
        }
        if(this == null){
            return false;
        }
        if(getClass() != other.getClass()){
            return false;
        }
        RankTile T = (RankTile) other;
        return (rank == T.rank);
    }
}

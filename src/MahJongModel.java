import java.util.ArrayList;
import java.util.Collections;

public class MahJongModel {

    private ArrayList<Tile> tileList;
    Tile[][][] tiles;
    public int x;
    public int y;
    public int z;
    private Tile t;
    public MahJongModel()
    {
        tiles = new Tile[8][15][5];
        tileList = new ArrayList<>();
        this.createTile();
        this.shuffleTile(tileList);
        this.positionTile();
    }



//    public void positionTile(Tile t, int x, int y, int z)
//    {
//        tiles[x][y][z] = t;
//    }

    public void createTile()
    {
        for (int j = 0; j<4;j++)
        {
            t = new CharacterTile('N');
            tileList.add(t);
            t = new CharacterTile('E');
            tileList.add(t);
            t = new CharacterTile('W');
            tileList.add(t);
            t = new CharacterTile('S');
            tileList.add(t);
            t = new CharacterTile('C');
            tileList.add(t);
            t = new CharacterTile('F');
            tileList.add(t);
            t = new WhiteDragonTile();
            tileList.add(t);
            t = new Bamboo1Tile();
            tileList.add(t);

            t = new CharacterTile('1');
            tileList.add(t);
            t = new CharacterTile('2');
            tileList.add(t);
            t = new CharacterTile('3');
            tileList.add(t);
            t = new CharacterTile('4');
            tileList.add(t);
            t = new CharacterTile('5');
            tileList.add(t);
            t = new CharacterTile('6');
            tileList.add(t);
            t = new CharacterTile('7');
            tileList.add(t);
            t = new CharacterTile('8');
            tileList.add(t);
            t = new CharacterTile('9');
            tileList.add(t);
            for (int i = 1; i<= 9; i++)
            {
                if(i != 1) {
                    t = new BambooTile(i);
                    tileList.add(t);
                }
                t = new CircleTile(i);
                tileList.add(t);
            }
        }
        t = new FlowerTile("Chrysanthemum");
        tileList.add(t);
        t = new FlowerTile("Orchid");

        tileList.add(t);
        t = new FlowerTile("Plum");
        tileList.add(t);
        t = new FlowerTile("Bamboo");
        tileList.add(t);
        t = new SeasonTile("Spring");
        tileList.add(t);
        t = new SeasonTile("Summer");
        tileList.add(t);
        t = new SeasonTile("Fall");
        tileList.add(t);
        t = new SeasonTile("Winter");
        tileList.add(t);
    }

    public void shuffleTile(ArrayList<Tile> tList)
    {
        Collections.shuffle(tList);
    }

    public void positionTile()
    {
        //layer 0
        tiles[4][0][0] = tileList.get(141);
        tiles[3][13][0] = tileList.get(142);
        tiles[3][14][0] = tileList.get(143);
        int layer0 = 57;
        for(int i = 1; i<=12; i++)
        {
            for(int j = 0; j <= 7;j++)
            {
                if( i==1 && (j==1 || j ==2 || j==5 || j==6)
                    || i == 2 && (j == 1 || j ==6)
                    || i == 11 && (j == 1 || j ==6)
                    || i==12 && (j==1 || j ==2 || j==5 || j==6)
                        )
                {
                    tiles[j][i][0] = null;

                }
                else
                {
                    tiles[j][i][0] = tileList.get(layer0);
                    layer0++;
                }

            }
        }
        //layer 1
        int layer1 = 21;
        for(int i = 4; i<=9; i++)
        {
            for(int j = 1; j <= 6;j++)
            {
                tiles[j][i][1] = tileList.get(layer1);
                layer1++;
            }
        }
        //layer 2
        int layer2 = 5;
        for(int i = 5; i<=8; i++)
        {
            for(int j = 2; j <= 5;j++)
            {
                tiles[j][i][2] = tileList.get(layer2);
                layer2++;
            }
        }

        //layer 3
        int layer3 = 1;
        for(int i = 6; i <= 7; i++)
        {
            for(int j = 3; j <= 4;j++)
            {
                tiles[j][i][3] = tileList.get(layer3);
                layer3++;
            }
        }
//
        //layer 4
        tiles[4][7][4] = tileList.get(0);
    }

    boolean isTileOpen(int x, int y, int z)
    {
        if (x ==0 || x == 7 || y <= 3 || y >= 10 || z == 4)
            return true;

        return tiles[x][ y][z + 1] == null && (tiles[x ][ y- 1][ z] == null || tiles[x ][ y+ 1][ z] == null);

    }



    public Tile getTile(int x, int y, int z)
    {
        Tile t;
        return t = tiles[x][y][z];
    }



}

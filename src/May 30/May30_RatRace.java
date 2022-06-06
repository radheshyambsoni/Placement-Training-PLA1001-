public class May30_RatRace {
    static int noOfPaths=0;
    static int ratRace(int maze[][],String s,int i,int j){
        if(maze[i][j]==1&&i==maze.length-1&&j==maze[0].length-1){
            noOfPaths++;
            System.out.println(s);
        }
        
        if(maze[i][j]==1){
            if(i!=maze.length-1){ratRace(maze,s+"D",i+1,j);}
            if(j!=maze[0].length-1){ratRace(maze,s+"R",i,j+1);}
        }

        return noOfPaths;
    }
    public static void main(String[] args) {
        // 1 - Rat can go through the cell
        // 0 - Rat can't go through the cell
        
        // int maze[][]={{1,0,0,0},{1,0,0,0},{1,1,1,1},{0,1,1,1}};
        int maze[][]={{1,1,0,0},
                    {0,1,1,0},
                    {1,1,1,1},
                    {0,0,1,1}};
        
        System.out.println(ratRace(maze,"",0,0));
    }
}
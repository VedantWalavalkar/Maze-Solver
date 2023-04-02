package AccioProjects.MazeSolver;

import java.util.List;

public class DepthFirst {
    public static boolean findPath(int[][] maze, int x, int y, List<Integer> path){
        if(maze[y][x] == 9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maze[y][x] == 0){
            maze[y][x] = 2;
            int dx = -1;
            int dy = 0;
            if(findPath(maze,x-1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(findPath(maze,x+1,y,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(findPath(maze,x,y-1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            if(findPath(maze,x,y+1,path)){
                path.add(x);
                path.add(y);
                return true;
            }
         }
        return false;
    }
}

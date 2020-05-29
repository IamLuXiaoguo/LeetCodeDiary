package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/20 11:56
 * @description:
 * 给定一个由0和1组成的非空二维数组grid，一个岛由一组四联通（上下左右四方向）的1（表示陆地）组成。假定grid的四周都是水。
 * 返回最大的岛。（没有岛则返回0）
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        // Write your code here
        if(grid == null || grid.length == 0)
            return 0;

        int maxArea = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                maxArea = Math.max(maxArea, dfs(grid, i, j));
            }
        }
        return maxArea;
    }


    private int dfs(int[][] grid, int row, int col){
        if(row <0 || row >= grid.length || col <0 || col >= grid[0].length || grid[row][col] == 0)
            return 0;

        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//上右下左

        grid[row][col] = 0;
        int area = 1;
        for(int i=0; i<4; i++)  //尝试4个方向
            area += dfs(grid, row + dir[i][0], col + dir[i][1]);

        return area;
    }
}

/**
        - https://leetcode.com/problems/flood-fill/
        - O(nm)
        - easy
 */

import java.util.*;

class Solution {
    
    public static int [] dx = new int[]{0,0,-1,1};
    public static int [] dy = new int[]{-1,1,0,0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Node> q = new LinkedList<>();
        int n = image.length;
        int m = image[0].length;
        boolean [][] visited = new boolean[n][m];
        visited[sr][sc] = true;
        int prev = image[sr][sc];
        image[sr][sc] = color;
        q.offer(new Node(sc, sr));
        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int dir = 0 ; dir < 4 ; dir++){
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if(visited[ny][nx] || image[ny][nx] != prev) continue;
                q.offer(new Node(nx, ny));
                visited[ny][nx] = true;
                image[ny][nx] = color;
            }
        }
        return image;        
    }
    public class Node {
        int x;
        int y;
        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}

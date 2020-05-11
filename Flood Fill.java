/**
*An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
*Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
*To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. 
*Replace the color of all of the aforementioned pixels with the newColor.
*At the end, return the modified image.
**/


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor)
            change(image, sr, sc, image[sr][sc], newColor);
        return image;
        
    }
    public void change(int[][] image, int i, int j, int c0, int c1) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != c0) return;
        image[i][j] = c1;
        change(image, i, j - 1, c0, c1);
        change(image, i, j + 1, c0, c1);
        change(image, i - 1, j, c0, c1);
        change(image, i + 1, j, c0, c1);
    }
}

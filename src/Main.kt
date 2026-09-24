fun main(args: Array<String>) {
    val img = arrayOf<IntArray>(
        intArrayOf(1, 1, 1, 0),
        intArrayOf(0, 1, 1, 1),
        intArrayOf(1, 1, 1, 1)
    )

    val sr = 1
    val sc = 2
    val newColor = 2

    val result = floodFill(img, sr, sc, newColor)

    for (row in result) {
        for (pixel in row) {
            print(pixel.toString() + " ")
        }
        println()
    }
}

fun floodFill(img: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    // If the starting pixel already has the new color,
    // no changes are needed

    if (img[sr][sc] == newColor) {
        return img
    }

    // Call DFS to start filling from the source pixel
    // Store original color
    val oldColor = img[sr][sc]
    dfs(img, sr, sc, oldColor, newColor)

    return img
}

fun dfs(img: Array<IntArray>, x: Int, y: Int, oldColor: Int, newColor: Int) {
    if (x < 0 || x >= img.size || y < 0 || y >= img[0].size || img[x][y] != oldColor) {
        return
    }

    // Update the color of the current pixel
    img[x][y] = newColor

    // Recursively visit all 4 connected neighbors
    dfs(img, x + 1, y, oldColor, newColor)
    dfs(img, x - 1, y, oldColor, newColor)
    dfs(img, x, y + 1, oldColor, newColor)
    dfs(img, x, y - 1, oldColor, newColor)
}



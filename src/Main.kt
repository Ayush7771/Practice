fun main() {
    val grid = mutableListOf(
        mutableListOf(1,1,1,0),
        mutableListOf(0,1,1,0),
        mutableListOf(1,0,1,1)
    )

    val sr = 1
    val sc = 2
    val newColor = 2

    val result = floodFill(grid, sr, sc, newColor)

    for (row in result) {
        for (pixel in row) {
            print("$pixel ")
        }
        println()
    }
}

fun floodFill(grid: MutableList<MutableList<Int>>, sr: Int, sc: Int, newColor: Int): MutableList<MutableList<Int>> {

    if (grid[sr][sc] == newColor) {
        return grid
    }

    val oldColor = grid[sr][sc]
    checkNear(grid, sr, sc, oldColor, newColor)

    return grid
}

fun checkNear(grid: MutableList<MutableList<Int>>, x: Int, y: Int, oldColor: Int, newColor: Int) {
    if (x < 0 || x >= grid.size || y < 0 || y >= grid[0].size || grid[x][y] != oldColor) {
        return
    }
    
    grid[x][y] = newColor
    
    checkNear(grid, x + 1, y, oldColor, newColor)
    checkNear(grid, x - 1, y, oldColor, newColor)
    checkNear(grid, x, y + 1, oldColor, newColor)
    checkNear(grid, x, y - 1, oldColor, newColor)
    checkNear(grid, x + 1, y - 1, oldColor, newColor)
    checkNear(grid, x - 1, y - 1, oldColor, newColor)
    checkNear(grid, x + 1, y + 1, oldColor, newColor)
    checkNear(grid, x - 1, y + 1, oldColor, newColor)
}
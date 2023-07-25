class Matrix(private val rows: Int, private val cols: Int) {
    val data: Array<Array<Int>> = Array(rows) { Array(cols) { 0 } }

    fun showMatrix(a:Matrix){
        for(i in 0 until rows){
            for (j in 0 until cols){
                print("${a.data[i][j]} ");
            }
            println();
        }
    }

    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must be the same for addition." }

        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must be the same for subtraction." }

        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return result
    }

    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) { "Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication." }

        val result = Matrix(rows, other.cols)
        for (i in 0 until rows) {

            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                sb.append("${data[i][j]}\t")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}
fun main() {
    val matrix1 = Matrix(3, 3)
    matrix1.apply {
        data[0][0] = 1
        data[0][1] = 2
        data[0][2] = 3
        data[1][0] = 4
        data[1][1] = 5
        data[1][2] = 6
        data[2][0] = 7
        data[2][1] = 8
        data[2][2] = 9
    }

    val matrix2 = Matrix(3, 3)
    matrix2.apply {
        data[0][0] = 9
        data[0][1] = 8
        data[0][2] = 7

        data[1][0] = 6
        data[1][1] = 5
        data[1][2] = 4

        data[2][0] = 3
        data[2][1] = 2
        data[2][2] = 1
    }

    println("*********************** Addition **************************");
    val sumMatrix = matrix1 + matrix2
    println("Matrix 1:")
    matrix1.showMatrix(matrix1);
    println("Matrix 2:")
    matrix2.showMatrix(matrix2);
    println("Addition : ${sumMatrix}");


    println("********************** Subtraction *************************");
    val diffMatrix = matrix1 - matrix2
    println("Matrix 1:")
    matrix1.showMatrix(matrix1);
    println("Matrix 2:")
    matrix2.showMatrix(matrix2);
    println(diffMatrix)


    val productMatrix = matrix1 * matrix2
    println("********************* Multiplication ***********************");
    println("Matrix 1:")
    matrix1.showMatrix(matrix1);
    println("Matrix 2:")
    matrix2.showMatrix(matrix2);
    println(productMatrix)
}

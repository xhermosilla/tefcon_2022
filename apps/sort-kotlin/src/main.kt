
var seed: Long = 1;

fun get_rand(): Long {
    seed = (12345678 * seed + 88888) % 54321
    return seed
}

fun sort(array: LongArray, size: Int): Long {
    var aux_elem: Long;
    var iterations: Long = 0;

    for (i in 0..size - 2) {
        for (j in 1..size - 1) {
            if (array[j] < array[j - 1]) {
                aux_elem = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux_elem;
                iterations++;
            }
        }
    }

    return iterations
}

fun main(args: Array<String>) {
    if (args.size >= 1) {
        val size = args[0].toInt()
        val table = LongArray(size)

        for (i in 0..table.size - 1 ) {
            table[i] = get_rand()
        }

        val iterations = sort(table, table.size)
        println("iterations: ${iterations}")
    }
}
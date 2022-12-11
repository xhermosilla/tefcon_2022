let seed = 1;

function get_rand() {
    seed = (12345678 * seed + 88888) % 54321;
    return seed;
}

function sort(array, size) {
    let i;
    let j;
    let aux_elem;
    let iterations = 0;

    for (i = 0; i < size - 1; i++) {
        for (j = 1; j < size; j++) {
            if (array[j] < array[j - 1]) {
                aux_elem = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux_elem;
                iterations++;
            }
        }
    }

    return iterations;
}

function main() {
    if (process.argv.length > 2) {
        const size = parseInt(process.argv[2]);
        const table = Array(size);

        for (let i = 0; i < size; i++) {
            table[i] = get_rand();
        }
        const iterations = sort(table, size);
        console.log(`iterations: ${iterations}`);
    }

    return 0;
}

main();
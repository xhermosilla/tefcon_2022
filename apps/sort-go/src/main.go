package main

import (
	"fmt"
	"os"
	"strconv"
)

var seed uint64 = 1

func get_rand() uint64 {
	seed = (12345678*seed + 88888) % 54321
	return seed
}

func sort(table []uint64, size uint64) uint64 {
	var aux_elem uint64 = 0
	var iterations uint64 = 0

	for i := uint64(0); i < size-1; i++ {
		for j := uint64(1); j < size; j++ {
			if table[j] < table[j-1] {
				aux_elem = table[j]
				table[j] = table[j-1]
				table[j-1] = aux_elem
				iterations++
			}
		}
	}
	return iterations
}

func main() {
	if len(os.Args) > 1 {
		var size, _ = strconv.Atoi(os.Args[1])
		var table = make([]uint64, size)

		for i := 0; i < size; i++ {
			table[i] = get_rand()
		}
		var iterations uint64 = sort(table, uint64(size))
		fmt.Println("iterations: ", iterations)
	}
}

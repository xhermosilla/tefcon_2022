import sys

seed = 1

def get_rand():
    global seed
    seed = (12345678 * seed + 88888) % 54321
    return seed

def sort(array, size):
    iterations = 0

    for i in range(0, size - 1):
        for j in range(1, size):
            if array[j] < array[j - 1]:
                aux_elem = array[j]
                array[j] = array[j - 1]
                array[j - 1] = aux_elem
                iterations += 1

    return iterations

def main():
    if len(sys.argv) > 1:
        size = int(sys.argv[1])
        table = [0] * size

        for i in range(0, size):
            table[i] = get_rand()

        iterations = sort(table, size);
        print("iterations: ", iterations)

main()
#include <stdio.h>
#include <stdlib.h>

unsigned long seed = 1;

long get_rand()
{
    seed = (12345678 * seed + 88888) % 54321;
    return seed;
}

unsigned long sort(unsigned long *array, unsigned long size)
{
    unsigned long i;
    unsigned long j;
    unsigned long aux_elem;
    unsigned long iterations = 0;

    for (i = 0; i < size - 1; i++)
    {
        for (j = 1; j < size; j++)
        {
            if (array[j] < array[j - 1])
            {
                aux_elem = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux_elem;
                iterations++;
            }
        }
    }

    return iterations;
}

int main(int argc, char *argv[])
{
    if (argc > 1)
    {
        unsigned long size = atoi(argv[1]);
        unsigned long table[size];
        unsigned long iterations = 0;

        for (int i = 0; i < size; i++)
        {
            table[i] = get_rand();
        }
        iterations = sort(table, size);
        printf("iterations: %ld\n", iterations);
    }

    return 0;
}
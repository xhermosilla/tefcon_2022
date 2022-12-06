#include <stdio.h>
#include <stdlib.h>

unsigned long seed = 1;

long get_rand()
{
    seed = (12345678 * seed + 88888) % 54321;
    return seed;
}

ulong sort(ulong *array, ulong size)
{
    ulong i;
    ulong j;
    ulong aux_elem;
    ulong iterations = 0;

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
        ulong size = atoi(argv[1]);
        ulong table[size];
        ulong iterations = 0;

        for (int i = 0; i < size; i++)
        {
            table[i] = get_rand();
        }
        iterations = sort(table, size);
        printf("iterations: %ld\n", iterations);
    }

    return 0;
}
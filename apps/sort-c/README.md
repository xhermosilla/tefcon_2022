# Sort (c)

## Compile

gcc -O3 sort-c/src/main.c -o sort-c/bin/sort-c

## Average execution

multitime -n 10 ./sort-c/bin/sort-c 1000

            Mean        Std.Dev.    Min         Median      Max
real        0.007       0.002       0.004       0.008       0.011       
user        0.005       0.003       0.000       0.004       0.011       
sys         0.002       0.002       0.000       0.003       0.004   

multitime -n 10 ./sort-c/bin/sort-c 10000

            Mean        Std.Dev.    Min         Median      Max
real        0.267       0.003       0.264       0.266       0.275       
user        0.266       0.004       0.260       0.265       0.275       
sys         0.001       0.002       0.000       0.000       0.004 

multitime -n 10 ./sort-c/bin/sort-c 50000

            Mean        Std.Dev.    Min         Median      Max
real        6.732       0.010       6.715       6.736       6.743       
user        6.730       0.010       6.711       6.731       6.743       
sys         0.002       0.002       0.000       0.000       0.004       

## Memory

time ./sort-c/bin/sort-c 50000                                    

iterations: 624641519
./sort-c/bin/sort-c 50000   6,76s  user 0,00s system 99% cpu 6,761 total
avg shared (code):         0 KB
avg unshared (data/stack): 0 KB
total (sum):               0 KB
max memory:                3 MB
page faults from disk:     0
other page faults:         209


## Docker image

REPOSITORY          TAG       IMAGE ID       CREATED          SIZE
sort-c              latest    b8fc85660ed2   37 seconds ago   7.09MB
# Sort (c)

## Average execution

multitime -n 10 python3 sort-python/src/main.py 1000

            Mean        Std.Dev.    Min         Median      Max
real        0.147       0.021       0.122       0.141       0.189       
user        0.136       0.020       0.114       0.129       0.176       
sys         0.010       0.006       0.000       0.010       0.024   

multitime -n 10 python3 sort-python/src/main.py 10000

            Mean        Std.Dev.    Min         Median      Max
real        10.783      0.483       10.306      10.583      11.620      
user        10.776      0.484       10.297      10.571      11.611      
sys         0.006       0.005       0.000       0.006       0.016 

multitime -n 10 python3 sort-python/src/main.py 50000

    

# Memory

time ./sort-c/bin/sort-c 50000                                    

iterations: 624641519
./sort-c/bin/sort-c 50000   6,76s  user 0,00s system 99% cpu 6,761 total
avg shared (code):         0 KB
avg unshared (data/stack): 0 KB
total (sum):               0 KB
max memory:                3 MB
page faults from disk:     0
other page faults:         209
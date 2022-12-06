# Sort (go)

## Compile

go build -o sort-go/bin/sort-go sort-go/src/main.go

## Average execution

multitime -n 10 ./sort-go/bin/sort-go 1000

            Mean        Std.Dev.    Min         Median      Max
real        0.011       0.007       0.003       0.010       0.030       
user        0.006       0.003       0.000       0.007       0.011       
sys         0.004       0.003       0.000       0.005       0.007     

multitime -n 10 ./sort-go/bin/sort-go 10000

            Mean        Std.Dev.    Min         Median      Max
real        0.154       0.005       0.148       0.153       0.167       
user        0.153       0.006       0.148       0.150       0.168       
sys         0.002       0.002       0.000       0.002       0.004   

multitime -n 10 ./sort-go/bin/sort-go 50000

            Mean        Std.Dev.    Min         Median      Max
real        4.043       0.127       3.962       3.983       4.364       
user        4.043       0.127       3.961       3.986       4.364       
sys         0.005       0.005       0.000       0.004       0.016

# Memory

time ./sort-go/bin/sort-go 50000

iterations:  624641519
./sort-go/bin/sort-go 50000   4,00s  user 0,02s system 100% cpu 4,015 total
avg shared (code):         0 KB
avg unshared (data/stack): 0 KB
total (sum):               0 KB
max memory:                4 MB
page faults from disk:     0
other page faults:         159

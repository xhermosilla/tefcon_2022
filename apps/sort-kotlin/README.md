# Sort (kotlin)

## Compile

kotlinc sort-kotlin/src/main.kt -d sort-kotlin/bin/

## Create jar

kotlinc src/main.kt -include-runtime -d bin/sort-kotlin.jar

## Run

kotlin -cp sort-kotlin/bin MainKt 10

## Average execution

multitime -n 10 kotlin -cp sort-kotlin/bin MainKt 1000

            Mean        Std.Dev.    Min         Median      Max
real        0.205       0.022       0.167       0.209       0.240       
user        0.144       0.011       0.122       0.144       0.157       
sys         0.058       0.010       0.041       0.057       0.077    

multitime -n 10 kotlin -cp sort-kotlin/bin MainKt 10000

            Mean        Std.Dev.    Min         Median      Max
real        0.407       0.027       0.371       0.406       0.448       
user        0.341       0.022       0.314       0.341       0.390       
sys         0.060       0.019       0.039       0.058       0.092   

multitime -n 10 kotlin -cp sort-kotlin/bin MainKt 50000

            Mean        Std.Dev.    Min         Median      Max
real        5.214       0.034       5.170       5.210       5.266       
user        5.159       0.033       5.121       5.159       5.230       
sys         0.060       0.006       0.051       0.061       0.069  

## Memory

time kotlin -cp sort-kotlin/bin MainKt 50000

iterations: 624641519
kotlin -cp sort-kotlin/bin MainKt 50000   5,21s  user 0,06s system 101% cpu 5,215 total
avg shared (code):         0 KB
avg unshared (data/stack): 0 KB
total (sum):               0 KB
max memory:                49 MB
page faults from disk:     0
other page faults:         7484

## Docker

REPOSITORY          TAG       IMAGE ID       CREATED          SIZE
sort-kotlin         latest    7b78064929fe   2 seconds ago    216MB
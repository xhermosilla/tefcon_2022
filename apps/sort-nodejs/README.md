# Sort (nodejs)

## Average execution

multitime -n 10  node sort-nodejs/src/index.js 1000

real        0.065       0.006       0.053       0.065       0.076       
user        0.049       0.007       0.033       0.049       0.059       
sys         0.016       0.005       0.008       0.017       0.025   

multitime -n 10  node sort-nodejs/src/index.js 10000

            Mean        Std.Dev.    Min         Median      Max
real        0.355       0.008       0.347       0.351       0.368       
user        0.340       0.009       0.328       0.339       0.357       
sys         0.017       0.005       0.008       0.018       0.024  

multitime -n 10  node sort-nodejs/src/index.js 50000

real        8.233       0.039       8.192       8.218       8.316       
user        8.216       0.041       8.181       8.201       8.309       
sys         0.018       0.005       0.008       0.018       0.028   

## Memory

time node sort-nodejs/src/index.js 50000

iterations: 624641519
node sort-nodejs/src/index.js 50000   8,21s  user 0,01s system 99% cpu 8,230 total
avg shared (code):         0 KB
avg unshared (data/stack): 0 KB
total (sum):               0 KB
max memory:                42 MB
page faults from disk:     0
other page faults:         3852

## Docker

REPOSITORY          TAG       IMAGE ID       CREATED              SIZE
sort-node           latest    9c2d2335ffc4   21 seconds ago       58.1MB
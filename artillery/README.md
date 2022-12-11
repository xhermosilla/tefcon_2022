# Ejecuciones

# go

artillery run artillery/tests/word-search-low-load.yml -o artillery/results/low-load-go.json | tee artillery/outputs/low-load-go.txt

artillery run artillery/tests/word-search-medium-load.yml -o artillery/results/medium-load-go.json | tee artillery/outputs/medium-load-go.txt

artillery run artillery/tests/word-search-high-load.yml -o artillery/results/high-load-go.json | tee artillery/outputs/high-load-go.txt

# kotlin

artillery run artillery/tests/word-search-low-load.yml -o artillery/results/low-load-kotlin.json | tee artillery/outputs/low-load-kotlin.txt

artillery run artillery/tests/word-search-medium-load.yml -o artillery/results/medium-load-kotlin.json | tee artillery/outputs/medium-load-kotlin.txt

artillery run artillery/tests/word-search-high-load.yml -o artillery/results/high-load-kotlin.json | tee artillery/outputs/high-load-kotlin.txt

# nodejs

artillery run artillery/tests/word-search-low-load.yml -o artillery/results/low-load-nodejs.json | tee artillery/outputs/low-load-nodejs.txt

artillery run artillery/tests/word-search-medium-load.yml -o artillery/results/medium-load-nodejs.json | tee artillery/outputs/medium-load-nodejs.txt

artillery run artillery/tests/word-search-high-load.yml -o artillery/results/high-load-nodejs.json | tee artillery/outputs/high-load-nodejs.txt

# python

artillery run artillery/tests/word-search-low-load.yml -o artillery/results/low-load-python.json | tee artillery/outputs/low-load-python.txt

artillery run artillery/tests/word-search-medium-load.yml -o artillery/results/medium-load-python.json | tee artillery/outputs/medium-load-python.txt

artillery run artillery/tests/word-search-high-load.yml -o artillery/results/high-load-python.json | tee artillery/outputs/high-load-python.txt
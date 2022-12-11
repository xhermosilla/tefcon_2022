# Word Search App (go)

## Run

```bash
go run word-search-go/main.go
```

## Run production

```
cd apps/word-search-go
go build -o bin/word-search-go word-search-go/main.go
```

```
GIN_MODE=release ./bin/word-search-go > /dev/null 2>&1
```

## Example request

```
curl http://localhost:8080/files/hobbit.txt/searchWord?word=Bilbo
```

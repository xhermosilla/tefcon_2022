# Word Search App (nodejs)

## Install

```bash
npm install
```

## Run debug

```bash
node --inspect src/index.js
```

## Run production

```
node src/index.js > /dev/null 2>&1
```

## Example request

```
curl http://localhost:3000/files/hobbit.txt/searchWord?word=Bilbo
```

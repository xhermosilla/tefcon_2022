# Word Search App (python)

## Create env

```bash
python3 -m venv venv
. venv/bin/activate
pip install -r requirements.txt
```

## Run debug

```bash
flask --app flaskr --debug run
```

## Run production

```bash
pip install waitress
```

```
waitress-serve --host=localhost --port=3000 --call flaskr:create_app > /dev/null 2>&1
```

## Example request

```
curl http://localhost:5000/files/hobbit.txt/searchWord?word=Bilbo
```

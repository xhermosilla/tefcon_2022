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

## Example request

```
curl http://localhost:5000/files/hobbit.txt/searchWord?word=Bilbo
```

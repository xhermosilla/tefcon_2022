# tefcon_2022

## Ejecución de test de performance

### Test de carga baja

```bash
artillery run artillery/tests/word-search-low-load.yml -o artillery/results/low-load-<LENGUAJE>.json
```

### Test de carga media

```bash
artillery run artillery/tests/word-search-low-load.yml -o artillery/results/medium-load-<LENGUAJE>.json
```

### Test de carga alta

```bash
artillery run artillery/tests/word-search-low-load.yml -o artillery/results/high-load-<LENGUAJE>.json
```
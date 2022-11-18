import os
import re

from flask import Blueprint, request

bp = Blueprint('files', __name__, url_prefix='/files')

FILES_PATH = os.path.join(os.getcwd(), '../../assets/files')

@bp.route('/<file_name>/searchWord')
def searchWord(file_name):
    """ Search word from file.
    
    Args:
        file_name (str): File to search for the word
    """
    word = request.args.get("word", default="", type=str)
    with open(os.path.join(FILES_PATH, file_name), mode="r", encoding="utf-8") as f:
        text = f.read() 
        count = re.split(r'[\s,.:;]+', text).count(word)
    return { "file": file_name, "searchWord": word, "count": count }

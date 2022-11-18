from flask import Flask

from .files import views


def create_app():
    app = Flask(__name__)
    app.register_blueprint(views.bp)
    return app

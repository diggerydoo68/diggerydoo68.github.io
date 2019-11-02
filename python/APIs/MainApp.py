# This script demonstrates creating a dead simple API that calls the dbcon() from the dbconfig.py file,
# to connect to an Oracle database

from __future__ import print_function

import os
import cx_Oracle
from flask import Flask
from dbConfig import dbcon

app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/dbversion')
def db():
    result = dbcon()
    return result
    

if __name__ == '__main__':
    app.run()

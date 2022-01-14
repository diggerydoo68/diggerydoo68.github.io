#!/usr/bin/env python

from __future__ import print_function

import cx_Oracle

def dbcon():
    connection = cx_Oracle.connect('username/domain')
    cur = connection.cursor()
    cur.execute("SELECT 'Hello, World from Oracle DB!' FROM DUAL")
    col = cur.fetchone()[0]
    cur.close()
    connection.close()
    return col

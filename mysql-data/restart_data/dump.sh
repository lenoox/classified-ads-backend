#!/bin/bash
#dump.sh
rm /restart_data/db.sql
cat /restart_data/drop_db.sql  >> ./restart_data/db.sql
cat /docker-entrypoint-initdb.d/dump.sql  >> /restart_data/db.sql
mysql -u root -p classified-ads < /restart_data/db.sql

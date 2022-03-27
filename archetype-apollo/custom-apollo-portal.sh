#!/bin/bash
printf "idea中启动，自制脚本，方便查看日志"
cd apollo-portal-1.9.2-github
java -Xms200m -Xmx200m -Duser.timezone=Asia/Shanghai -Dclient.encoding.override=UTF-8 -Dfile.encoding=UTF-8 -jar apollo-portal-1.9.2.jar
exit 0;
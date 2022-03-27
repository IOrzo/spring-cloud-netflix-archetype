# 本地搭建 Apollo 配置中心

从官网上下载打包好的压缩包，configservice，adminservice，portal。

该应用依赖 MySQL 服务器，解压过后修改 config 文件夹下的配置信息，修改 MySQL 的连接信息。

portal 应用还需在 config/apollo-env.properties 中修改配置服务的地址。

windows 环境下直接在 idea 中启动自己简写的脚本分别启动应用，custom-apollo-configservice.sh、custom-apollo-adminservice.sh、custom-apollo-portal.sh
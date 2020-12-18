#Spring Boot示例简单项目
* 不包含中间件，只有数据库及其他常用功能

### 架构分层简介
|名称|定义|端口|workerId|
|:----: |:----:|:----:|:----:|
|common|公共类|||
|model|实体|||
|dao|数据交互|||
|system|后台服务|40000|0|

* 使用分布式id生成需配置workerId和datacenterId，需保证每个服务workerId和datacenterId组合均不一致，docker容器初始化时workerId为默认设置，datacenterId则根据端口号生成，如40001的datacenterId即为1，以此规则命名

### Docker环境搭建
|应用|获取|运行|
|:----:|:-----|:-----|

* 生产环境IDEA链接Docker开放端口2375请配置好ca证书
* docker run添加--cap-add=SYS_PTRACE参数解决无法使用JVM命令问题

### 预设初始账号密码

  
 ### 相关环境及技术栈
 * JDK：Java 8
 * 容器化部署工具：Docker
 * 数据库：MySQL
 * 服务框架：Spring Boot
 * Mybatis插件：Mybatis Plus,PageHelper,dynamic datasource
 * 接口文档框架：Swagger 2
 * JDBC组件：Druid 
 * 公共工具：Hutool 
 * 验证框架：Hibernate Validator
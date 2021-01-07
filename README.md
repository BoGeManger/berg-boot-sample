#Spring Boot示例简单项目
* 不包含中间件，只有数据库及其他常用功能

### 目录结构
├── common 公共应用<br>
│   ├─ all-common 公共应用所有引用<br>
│   ├─ application 基础服务应用<br>
│   └─ util 工具<br>
├── dao 数据交互<br>
│   ├─ all-dao 数据交互所有引用<br>
│   ├─ base-dao 基础数据交互引用<br>
│   └─ system-dao 后台系统数据交互<br>
├── model 实体层<br>
├── sql 数据脚本<br>
└── system 后台服务<br>

### 服务划分
|名称|定义|端口|workerId|
|:----: |:----:|:----:|:----:|
|system|后台服务|42000|0|

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
 * Mybatis插件：[Mybatis Plus](https://baomidou.com/guide/)
 * 分页插件：PageHelper
 * 多数据源组件：Dynamic Datasource
 * 接口文档组件：knife4j
 * JDBC组件：Druid 
 * 公共工具组件：[Hutool](https://www.hutool.cn/docs/#/) 
 * 验证组件：Hibernate Validator
 * Excel工具：[EasyExcel](https://www.yuque.com/easyexcel/doc/easyexcel)
 * 高性能实体映射工具：MapStruct
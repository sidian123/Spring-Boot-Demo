* 一个简单的,完整的Spring Boot demo
* 约定xml与mapper在同一个文件夹, 无需任何Mybatis配置
* 为不同的包设置不同的日记级别, 打印`warn`级别系统日记, `trace`级Mybatis日记, 个人代码其他包打印`debug`日记.
* 本demo使用log4j2日记框架, 而三方框架使用的是common logging, 互不影响.
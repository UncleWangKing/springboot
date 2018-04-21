# springboot-mybaits模板

包含:<br>
  1.一张用户表的crud及测试<br>
  2.事务管理<br>
  3.统一异常处理<br>
## ps:使用lombok

建表语句<br>
CREATE TABLE `sys_user` (<br>
  `id` bigint(20) NOT NULL AUTO_INCREMENT,<br>
  `user_name` varchar(255) DEFAULT NULL,<br>
  `pass_word` varchar(255) DEFAULT NULL,<br>
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,<br>
  `last_login_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,<br>
  PRIMARY KEY (`id`),<br>
  UNIQUE KEY `user_name` (`user_name`)<br>
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;<br>

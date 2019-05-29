# 测试
## 权限控制
/order在ResourceServerConfiguration中, 被配置为必须认证后才能访问。
## 用户名、密码的配置
分别在SecurityConfiguration、AuthorizationServerConfiguration中
## 获取token
http://localhost:8081/oauth/token?grant_type=password&username=user_1&password=123456&scope=select&client_id=client_2&client_secret=123456  
成功后会返回token
## token使用访问授权地址
http://localhost:8081/order/demo?access_token=417c50c6-bc25-44fe-b1d0-0af3fc04b99b

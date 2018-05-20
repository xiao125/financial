# financial

#添加产品 API
http://localhost:8081/manager/products

参数 json：
 {
  "id":"001",
  "name":"金融1号",
  "thresholdAmount":10,
  "stepAmount":1,
  "lock_term":0,
  "status":"AUDITING",
  "memo":null,
  "rewardRate":3.86,
  "updateAt":null,
  "createUser":null,
  "updateUser":null,
  "createAt":null
 
 }
 
 返回：
 
 {
     "id": "001",
     "name": "金融1号",
     "status": "AUDITING",
     "thresholdAmount": 10,
     "stepAmount": 1,
     "lockTerm": 0,
     "rewardRate": 3.86,
     "memo": null,
     "createAt": "2018-05-20 23:45:26.086",
     "updateAt": "2018-05-20 23:45:26.086",
     "createUser": null,
     "updateUser": null
 }
  
 #查询产品 API
 
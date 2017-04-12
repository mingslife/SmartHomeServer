# 智能家居API文档
SmartHomeServer
校内科研项目-智能家居服务器端

## 警报相关API
### 查看警报列表
请求URL
> api/alert/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> [{"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}]
> ```

### 查看警报
请求URL
> api/alert/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |警报ID      |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}
> ```

### 创建警报
请求URL
> api/alert/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |message     |string      |警报内容    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}
> ```

### 修改警报
请求URL
> api/alert/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |警报ID      |
> |message     |string      |警报内容    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}
> ```

### 删除警报
请求URL
> api/alert/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |警报ID      |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}
> ```

### 查看最新警报
请求URL
> api/alert/lastest.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |警报ID      |
> |familyId    |int         |家庭组ID    |
> |message     |string      |警报内容    |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"message":"报警啦","recordDate":1491978029000}
> ```

## 门卡相关API
### 查看门卡列表
请求URL
> api/card/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |门卡ID      |
> |familyId    |int         |家庭组ID    |
> |cardNumber  |string      |门卡编号    |

返回示例
> ```javascript
> [{"id":1,"cardNumber":"11303080125","familyId":1}]
> ```

### 查看门卡
请求URL
> api/card/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |门卡ID      |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |门卡ID      |
> |familyId    |int         |家庭组ID    |
> |cardNumber  |string      |门卡编号    |

返回示例
> ```javascript
> {"id":1,"cardNumber":"11303080125","familyId":1}
> ```

### 创建门卡
请求URL
> api/card/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |cardNumber  |string      |门卡编号    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |门卡ID      |
> |familyId    |int         |家庭组ID    |
> |cardNumber  |string      |门卡编号    |

返回示例
> ```javascript
> {"id":1,"cardNumber":"11303080125","familyId":1}
> ```

### 修改门卡
请求URL
> api/card/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |门卡ID      |
> |cardNumber  |string      |门卡编号    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |门卡ID      |
> |familyId    |int         |家庭组ID    |
> |cardNumber  |string      |门卡编号    |

返回示例
> ```javascript
> {"id":1,"cardNumber":"11303080125","familyId":1}
> ```

### 删除门卡
请求URL
> api/card/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |门卡ID      |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |门卡ID      |
> |familyId    |int         |家庭组ID    |
> |cardNumber  |string      |门卡编号    |

返回示例
> ```javascript
> {"id":1,"cardNumber":"11303080125","familyId":1}
> ```

## 智能门相关API
### 查看智能门列表
请求URL
> api/door/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> [{"id":1,"familyId":1,"status":0}]
> ```

### 查看智能门
请求URL
> api/door/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能门ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 创建智能门
请求URL
> api/door/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |status      |short       |状态(0关 1开)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 修改智能门
请求URL
> api/door/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能门ID    |
> |status      |short       |状态(0关 1开)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 删除智能门
请求URL
> api/door/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能门ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 打开智能门
请求URL
> api/door/open.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能门ID    |
> |cardNumber  |string      |门卡编号    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能门ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":1}
> ```

## 温湿度相关API
### 查看温湿度列表
请求URL
> api/humiture/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> [{"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}]
> ```

### 查看温湿度
请求URL
> api/humiture/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |温湿度ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}
> ```

### 创建温湿度
请求URL
> api/humiture/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}
> ```

### 修改温湿度
请求URL
> api/humiture/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |温湿度ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}
> ```

### 删除温湿度
请求URL
> api/humiture/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |温湿度ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}
> ```

### 查看最新温湿度
请求URL
> api/humiture/lastest.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |温湿度ID    |
> |familyId    |int         |家庭组ID    |
> |temperature |float       |温度        |
> |humidity    |float       |湿度        |
> |recordDate  |long        |记录时间    |

返回示例
> ```javascript
> {"id":1,"familyId":1,"temperature":20.0,"humidity":0.68,"recordDate":1491982475355}
> ```

## 智能灯相关API
### 查看智能灯列表
请求URL
> api/lamp/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能灯ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回示例
> ```javascript
> [{"id":1,"familyId":1,"status":0}]
> ```

### 查看智能灯
请求URL
> api/lamp/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能灯ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能灯ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 创建智能灯
请求URL
> api/lamp/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能灯ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 修改智能灯
请求URL
> api/lamp/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能灯ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能灯ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 删除智能灯
请求URL
> api/lamp/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能灯ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能灯ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1低亮度 2中亮度 3高亮度)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

## 智能窗相关API
### 查看智能窗列表
请求URL
> api/window/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能窗ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> [{"id":1,"familyId":1,"status":0}]
> ```

### 查看智能窗
请求URL
> api/window/show.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能窗ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能窗ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 创建智能窗
请求URL
> api/window/create.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |status      |short       |状态(0关 1开)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能窗ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 修改智能窗
请求URL
> api/window/modify.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能窗ID    |
> |status      |short       |状态(0关 1开)|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能窗ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

### 删除智能窗
请求URL
> api/window/destroy.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |id          |int         |智能窗ID    |

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |智能窗ID    |
> |familyId    |int         |家庭组ID    |
> |status      |short       |状态(0关 1开)|

返回示例
> ```javascript
> {"id":1,"familyId":1,"status":0}
> ```

## 其他相关API
### 新增家庭组
请求URL
> api/family/new

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |token       |string      |家庭组令牌  |
> |appToken    |string      |应用认证令牌|

返回
> |返回参数    |参数类型    |返回说明    |
> |------------|------------|------------|
> |id          |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |
> |isActive    |bool        |是否激活(true是 false否)|

返回示例
> ```javascript
> {"id":3,"token":"123456","isActive":true}
> ```
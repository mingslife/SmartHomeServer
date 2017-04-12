# 智能家居API文档
SmartHomeServer
校内科研项目-智能家居服务器端

## 警报相关API
### 查看警报列表
请求URL:
> /alert/list.do

请求方式
> POST

请求参数
> |请求参数    |参数类型    |参数说明    |
> |------------|------------|------------|
> |familyId    |int         |家庭组ID    |
> |token       |string      |家庭组令牌  |

返回
> |返回参数    |返回类型    |返回说明    |
> |------------|------------|------------|
> ||||

返回示例
> ```javascript
> []
> ```

### 查看警报
请求URL:
> /alert/show.do

请求方式:
> POST

请求参数:
> |请求参数|参数类型|参数说明  |
> |--------|--------|----------|
> |familyId|int     |家庭组ID  |
> |token   |string  |家庭组令牌|
> |id      |int     |警报ID    |

### 创建警报
请求URL:
> /alert/create.do

请求方式:
> POST

请求参数:
> |请求参数|参数类型|参数说明  |
> |--------|--------|----------|
> |familyId|int     |家庭组ID  |
> |token   |string  |家庭组令牌|
> |message |string  |警报内容  |

## 门卡相关API

## 智能门相关API

## 温湿度相关API

## 智能灯相关API

## 智能窗相关API
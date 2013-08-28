<h3>1.	开发模式验证</h3>
回收商后台，切换到<b>开发模式</b>，填写回调url和token，其中token为任意的字符串（长度不超过30个byte）。<br>
提交url和token后，回收平台会GET请求到对应的url上，其中GET请求的参数：
<table class="table table-bordered">
              <thead>
                <tr>
                  <th>参数</th>
                  <th>类型</th>
                  <th>描述</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>signature</td>
                  <td>String</td>
                  <td>回收平台加密签名</td>
                </tr>
                <tr>
                  <td>timestamp</td>
                  <td>Long</td>
                  <td>时间戳</td>
                </tr>
                <tr>
                  <td>recycle_num</td>
                  <td>Long</td>
                  <td>随机数</td>
                </tr>
                <tr>
                  <td>recycle_str</td>
                  <td >String</td>
                  <td>随机字符串</td>
                </tr>
              </tbody>
            </table>
通过检验signature对请求进行校验（下面有校验方式）。若确认此次GET请求来自回收平台，请原样返回recycle_str参数内容，则接入生效，否则接入失败。<br>

signature是回收商填写的token参数和请求中的timestamp参数、recycle_num参数的加密串。
<h5>加密/校验流程:</h5>
1. 将token、timestamp、recycle_num三个参数进行字典序排序
2. 将三个参数字符串拼接成一个字符串进行sha1加密
3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于回收平台

<i>第一次认证会带这些参数，后续调用api的时候，也会传递这些参数，回收商可通过此校验确认请求是否来自回收平台。</i><br>
<h5>GET请求示例：</h5>
http://isv_callback_url? signature=xx&timestamp=11&recycle_num=22&recycle_str=33
 
<h3>2.	估价请求</h3>
<h5>说明</h5>
当用户在回收平台选择了相关的回收参数信息进行估价时，回收平台会将对应的参数信息POST到回收商填写的URL上。
<h5>推送格式</h5>
Json
<h5>推送参数</h5>
<table class="table table-bordered">
              <thead>
                <tr>
                  <th>参数</th>
                  <th>类型</th>
                  <th>描述</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>optionId</td>
                  <td>String</td>
                  <td>参数选项id</td>
                </tr>
                <tr>
                  <td>categoryId</td>
                  <td>Long</td>
                  <td>叶子类目id</td>
                </tr>
                <tr>
                  <td>categoryName</td>
                  <td>String</td>
                  <td>叶子类目名称</td>
                </tr>
                <tr>
                  <td>spuId</td>
                  <td >Long</td>
                  <td>商品信息聚合的最小单位Id</td>
                </tr>
                <tr>
                  <td>spuName</td>
                  <td>String</td>
                  <td>商品信息聚合的最小单位名称</td>
                </tr>
                 <tr>
                  <td>propertyId</td>
                  <td >Long</td>
                  <td>选项id</td>
                </tr>
                <tr>
                  <td>propertyName</td>
                  <td >String</td>
                  <td>选项名称</td>
                </tr>
                <tr>
                  <td>valueId</td>
                  <td >Long</td>
                  <td>选项值id</td>
                </tr>
                <tr>
                  <td>valueName</td>
                  <td >String</td>
                  <td>选项值名称</td>
                </tr>
                <tr>
                  <td>timestamp</td>
                  <td >Long</td>
                  <td>时间戳</td>
                </tr>
              </tbody>
            </table>
<h5>POST数据示例</h5>
<pre>
{
    "categoryId": 1000,
    "categoryName": "手机",
    "optionDetail": [
        {
            "propertyId": 0,
            "propertyName": "选项0",
            "valueId": 0,
            "valueName": "选项值0"
        },
        {
            "propertyId": 1,
            "propertyName": "选项1",
            "valueId": 1,
            "valueName": "选项值1"
        }
    ],
    "optionId": "ssssss",
    "spuId": 11111,
    "spuName": "iPhone4 16G",
    "timestamp": 1376360326962
}
</pre>
<h3>3.	估价响应</h3>

当用户填写的参数由回收平台POST到回收商的服务器，回收商需要解析对应的参数进行一个出价响应。回收平台在3秒内收不到响应会放弃本次连接。
<h5>响应格式</h5>
Json
<h5>响应参数</h5>
<table class="table table-bordered">
              <thead>
                <tr>
                  <th>参数</th>
                  <th>类型</th>
                  <th>描述</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>code</td>
                  <td>Int</td>
                  <td>用于标识对应商品是否支持回收。code：1，表示支持回收；code：2，表示不支持回收</td>
                </tr>
                 <tr>
                  <td>price</td>
                  <td>Long</td>
                  <td>回收商出价，分为单位</td>
                </tr>
              </tbody>
            </table>
<h5>响应示例</h5>
<pre>
{
    "code": 1,
    "price": 200000
}
</pre>

